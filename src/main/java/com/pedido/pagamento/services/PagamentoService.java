package com.pedido.pagamento.services;

import com.pedido.pagamento.dtos.PagamentoDto;
import com.pedido.pagamento.entities.Pagamento;
import com.pedido.pagamento.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository repository;

    @Transactional(readOnly = true)
    public List<PagamentoDto> findAll() {
        List<Pagamento> list = repository.findAll();
        return list.stream().map(x -> new PagamentoDto(x)).collect(Collectors.toList());
    }
}
