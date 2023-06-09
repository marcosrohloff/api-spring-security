package br.com.jwtexemplo.apispringsecurity.repository;

import br.com.jwtexemplo.apispringsecurity.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    List<Venda> findAllByCnpj(String cnpj);
}
