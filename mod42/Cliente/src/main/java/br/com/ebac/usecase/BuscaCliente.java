package br.com.ebac.usecase;

import br.com.ebac.domain.Cliente;
import br.com.ebac.exception.EntityNotFoundException;
import br.com.ebac.repository.IClienteRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BuscaCliente {

  private IClienteRepository clienteRepository;

  @Autowired
  public BuscaCliente(IClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  public Page<Cliente> buscar(Pageable pageable) {
    return clienteRepository.findAll(pageable);
  }

  public Cliente buscarPorId(String id) {
    return clienteRepository
        .findById(id)
        .orElseThrow(() -> new EntityNotFoundException(Cliente.class, "id", id));
  }

  public Boolean isCadastrado(String id) {
    Optional<Cliente> cliente = clienteRepository.findById(id);
    return cliente.isPresent();
  }

  public Cliente buscarPorCpf(Long cpf) {
    return clienteRepository
        .findByCpf(cpf)
        .orElseThrow(() -> new EntityNotFoundException(Cliente.class, "cpf", String.valueOf(cpf)));
  }
}