package controllers;

import models.dao.PessoaDAO;
import models.entidades.Pessoa;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class PessoaController extends Controller {

    final HttpExecutionContext executionContext;
    final PessoaDAO pessoaDAO;
    final FormFactory formFactory;

    @Inject
    public PessoaController(HttpExecutionContext executionContext, PessoaDAO pessoaDAO, FormFactory formFactory) {
        this.executionContext = executionContext;
        this.pessoaDAO = pessoaDAO;
        this.formFactory = formFactory;
    }

    public CompletionStage<Result> cadastrarPessoaPage(){
        return CompletableFuture.completedFuture(ok(views.html.pessoa_views.cadastrar_pessoa.render()));
    }

    public CompletionStage<Result> gerenciarPessoaPage(){
        return pessoaDAO.listar().thenComposeAsync(pessoas -> {
            return CompletableFuture.completedFuture(ok(views.html.pessoa_views.gerenciar_pessoa.render(pessoas)));
        },executionContext.current());
    }

    public CompletionStage<Result> atualizarPessoaPage(Long id){
        return pessoaDAO.buscarPorId(id).thenComposeAsync(pessoa -> {
            return CompletableFuture.completedFuture(ok(views.html.pessoa_views.atualizar_pessoa.render(pessoa)));
        },executionContext.current());
    }

    public CompletionStage<Result> cadastrarPessoa(Http.Request request){
        Form<Pessoa> formulario = formFactory.form(Pessoa.class).bindFromRequest(request);
        Pessoa pessoa = formulario.get();
        return pessoaDAO.criar(pessoa).thenComposeAsync(pessoa1 -> {
            return CompletableFuture.completedFuture(redirect(routes.PessoaController.gerenciarPessoaPage()));
        },executionContext.current());
    }

    public CompletionStage<Result> atualizarPessoa(Http.Request request){
        Form<Pessoa> formulario = formFactory.form(Pessoa.class).bindFromRequest(request);
        Pessoa pessoa = formulario.get();
        return pessoaDAO.atualizar(pessoa).thenComposeAsync(pessoa1 -> {
            return CompletableFuture.completedFuture(redirect(routes.PessoaController.gerenciarPessoaPage()));
        },executionContext.current());
    }

    public CompletionStage<Result> removerPessoa(Long id){
        return pessoaDAO.deletar(id).thenComposeAsync(pessoa -> {
            return CompletableFuture.completedFuture(redirect(routes.PessoaController.gerenciarPessoaPage()));
        },executionContext.current());
    }
}
