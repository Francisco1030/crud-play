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

    public CompletionStage<Result> cadastrarEndereco(Http.Request request){
        Form<Endereco> formulario = formFactory.form(Endereco.class).bindFromRequest(request);
        Endereco endereco = formulario.get();
        return enderecoDAO.criar(endereco).thenComposeAsync(pessoa1 -> {
            return CompletableFuture.completedFuture(redirect(routes.EnderecoController.cadastrarEnderecoPage()));
        },executionContext.current());
    }
}
