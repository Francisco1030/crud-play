package models.dao;

import models.DatabaseExecutionContext;
import models.entidades.Pessoa;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import static java.util.concurrent.CompletableFuture.supplyAsync;

public class PessoaDAOImpl implements PessoaDAO{

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public PessoaDAOImpl(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    private Pessoa criarImpl(EntityManager entityManager, Pessoa pessoa){
        entityManager.persist(pessoa);
        return pessoa;
    }

    private List<Pessoa> listarImpl(EntityManager entityManager){
        Query query = entityManager.createQuery("select p from Pessoa p");
        List<Pessoa> pessoas = query.getResultList();
        return pessoas;
    }

    private Pessoa atualizarImpl(EntityManager entityManager, Pessoa  pessoa){
        entityManager.merge(pessoa);
        return pessoa;
    }

    private Pessoa deletarImpl(EntityManager entityManager, Long id){
        Query query = entityManager.createQuery("select p from Pessoa p where p.id = :id").setParameter("id", id);
        Pessoa pessoa = (Pessoa) query.getSingleResult();
        entityManager.remove(pessoa);
        return pessoa;
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    @Override
    public CompletionStage<Pessoa> criar(Pessoa pessoa) {
        return supplyAsync(() -> wrap((entityManager) -> criarImpl(entityManager,pessoa)),executionContext);
    }

    @Override
    public CompletionStage<List<Pessoa>> listar() {
        return supplyAsync(() -> wrap((entityManager) -> listarImpl(entityManager)),executionContext);
    }

    @Override
    public CompletionStage<Pessoa> atualizar(Pessoa pessoa) {
        return supplyAsync(() -> wrap((entityManager) -> atualizarImpl(entityManager,pessoa)),executionContext);
    }

    @Override
    public CompletionStage<Pessoa> deletar(Long id) {
        return supplyAsync(() -> wrap((entityManager) -> deletarImpl(entityManager,id)),executionContext);
    }
}
