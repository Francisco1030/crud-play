package models.dao;

import models.DatabaseExecutionContext;
import models.entidades.Endereco;
import models.entidades.Pessoa;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class EnderecoDAOImpl implements EnderecoDAO {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public EnderecoDAOImpl(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    private Endereco criarImpl(EntityManager entityManager, Endereco endereco){
        Pessoa pessoa = entityManager.find(Pessoa.class, endereco.getPessoa().getId());
        endereco.setPessoa(pessoa);
        entityManager.persist(endereco);
        return endereco;
    }

    private List<Endereco> listarImpl(EntityManager entityManager){
        Query query = entityManager.createQuery("select e from Endereco e ORDER BY e.id");
        List<Endereco> enderecos = query.getResultList();
        return enderecos;
    }

    private Endereco atualizarImpl(EntityManager entityManager, Endereco endereco){
        entityManager.merge(endereco);
        return endereco;
    }

    private Endereco deletarImpl(EntityManager entityManager, Long id){
        Query query = entityManager.createQuery("select e from Endereco e where e.id = :id").setParameter("id",id);
        Endereco endereco = (Endereco) query.getSingleResult();
        entityManager.remove(endereco);
        return endereco;
    }

    private Endereco buscaPorIdImpl(EntityManager entityManager, Long id){
        Query query = entityManager.createQuery("select e from Endereco e where e.id = :id").setParameter("id",id);
        Endereco endereco = (Endereco) query.getSingleResult();
        return endereco;
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    @Override
    public CompletionStage<Endereco> criar(Endereco endereco) {
        return supplyAsync(() -> wrap((entityManager) -> criarImpl(entityManager,endereco)),executionContext);
    }

    @Override
    public CompletionStage<List<Endereco>> listar() {
        return supplyAsync(() -> wrap((entityManager) -> listarImpl(entityManager)),executionContext);
    }

    @Override
    public CompletionStage<Endereco> atualizar(Endereco endereco) {
        return supplyAsync(() -> wrap((entityManager) -> atualizarImpl(entityManager,endereco)),executionContext);
    }

    @Override
    public CompletionStage<Endereco> deletar(Long id) {
        return supplyAsync(() -> wrap((entityManager) -> deletarImpl(entityManager,id)),executionContext);
    }

    @Override
    public CompletionStage<Endereco> buscarPorId(Long id) {
        return supplyAsync(() -> wrap((entityManager) -> buscaPorIdImpl(entityManager,id)),executionContext);
    }
}
