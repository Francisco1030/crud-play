package controllers;

import models.dao.EnderecoDAO;
import models.entidades.Endereco;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class EnderecoController extends Controller {

    final HttpExecutionContext executionContext;
    final EnderecoDAO enderecoDAO;
    final FormFactory formFactory;

    @Inject
    public EnderecoController(HttpExecutionContext executionContext, EnderecoDAO enderecoDAO, FormFactory formFactory) {
        this.executionContext = executionContext;
        this.enderecoDAO = enderecoDAO;
        this.formFactory = formFactory;
    }

    public CompletionStage<Result> cadastrarEnderecoPage(){
        return CompletableFuture.completedFuture(ok(views.html.endereco_views.cadastrar_endereco.render()));
    }

    public CompletionStage<Result> gerenciarEnderecoPage(){
        return enderecoDAO.listar().thenComposeAsync(enderecos -> {
            return CompletableFuture.completedFuture(ok(views.html.endereco_views.gerenciar_endereco.render(enderecos)));
        },executionContext.current());
    }

    public CompletionStage<Result> atualizarEnderecoPage(Long id){
        return enderecoDAO.buscarPorId(id).thenComposeAsync(endereco -> {
            return CompletableFuture.completedFuture(ok(views.html.endereco_views.atualizar_endereco.render(endereco)));
        },executionContext.current());
    }

    public CompletionStage<Result> cadastrarEndereco(Http.Request request){
        Form<Endereco> formulario = formFactory.form(Endereco.class).bindFromRequest(request);
        Endereco endereco = formulario.get();
        return enderecoDAO.criar(endereco).thenComposeAsync(pessoa1 -> {
            return CompletableFuture.completedFuture(redirect(routes.EnderecoController.cadastrarEnderecoPage()));
        },executionContext.current());
    }

    public CompletionStage<Result> atualizarEndereco(Http.Request request){
        Form<Endereco> formulario = formFactory.form(Endereco.class).bindFromRequest(request);
        Endereco endereco = formulario.get();
        return enderecoDAO.atualizar(endereco).thenComposeAsync(endereco1 -> {
            return CompletableFuture.completedFuture(redirect(routes.EnderecoController.gerenciarEnderecoPage()));
        },executionContext.current());
    }

    public CompletionStage<Result> removerEndereco(Long id){
        return enderecoDAO.deletar(id).thenComposeAsync(endereco -> {
            return CompletableFuture.completedFuture(redirect(routes.EnderecoController.gerenciarEnderecoPage()));
        },executionContext.current());
    }

}
