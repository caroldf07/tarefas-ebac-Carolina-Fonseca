package br.com.ebac.repository;

import br.com.ebac.domain.Cliente;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {

  Optional<Cliente> findByCpf(Long cpf);
}
