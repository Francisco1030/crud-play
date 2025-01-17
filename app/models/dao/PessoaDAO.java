package models.dao;

import com.google.inject.ImplementedBy;
import models.entidades.Pessoa;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

@ImplementedBy(PessoaDAOImpl.class)
public interface PessoaDAO {

    CompletionStage <Pessoa> criar(Pessoa pessoa);
    CompletionStage <List<Pessoa>> listar();
    CompletionStage <Pessoa> atualizar(Pessoa pessoa);
    CompletionStage <Pessoa> deletar(Long id);
    CompletionStage <Optional<Pessoa>> buscarPorId(Long id);
    CompletionStage <List<Pessoa>> buscarPorNome(String nome);
}
