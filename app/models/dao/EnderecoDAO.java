package models.dao;

import com.google.inject.ImplementedBy;
import models.entidades.Endereco;

import java.util.List;
import java.util.concurrent.CompletionStage;

@ImplementedBy(EnderecoDAOImpl.class)
public interface EnderecoDAO {

    CompletionStage<Endereco> criar(Endereco endereco);
    CompletionStage <List<Endereco>> listar();
    CompletionStage <Endereco> atualizar(Endereco endereco);
    CompletionStage <Endereco> deletar(Long id);
    CompletionStage <Endereco> buscarPorId(Long id);
}
