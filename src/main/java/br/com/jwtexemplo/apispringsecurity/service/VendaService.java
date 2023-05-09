package br.com.jwtexemplo.apispringsecurity.service;

import br.com.jwtexemplo.apispringsecurity.entity.Venda;
import br.com.jwtexemplo.apispringsecurity.repository.VendaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VendaService {

    private final VendaRepository repository;
    public List<Venda> buscarPorCnpj(String cnpj) {
        return repository.findAllByCnpj(cnpj);
    }
    public Venda salvar(Venda venda) {
        return repository.save(venda);
    }
}
