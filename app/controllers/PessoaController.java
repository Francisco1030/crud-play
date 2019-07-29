package controllers;

import models.dao.PessoaDAO;
import models.entidades.Pessoa;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class PessoaController extends Controller {

    final HttpExecutionContext executionContext;
    final PessoaDAO pessoaDAO;

    @Inject
    public PessoaController(HttpExecutionContext executionContext, PessoaDAO pessoaDAO) {
        this.executionContext = executionContext;
        this.pessoaDAO = pessoaDAO;
    }

    public CompletionStage<Result> criarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Chico");
        pessoa.setEmail("chico@gmail.com");
        return pessoaDAO.criar(pessoa).thenComposeAsync(pessoa1 -> {
            return CompletableFuture.completedFuture(ok(Json.toJson(pessoa1)));
        },executionContext.current());
    }
}
