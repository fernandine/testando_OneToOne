package com.pedido.pagamento.services;

import com.pedido.pagamento.dtos.PedidoDto;
import com.pedido.pagamento.entities.Pedido;
import com.pedido.pagamento.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Transactional(readOnly = true)
    public List<PedidoDto> findAll() {
        List<Pedido> list = repository.findAll();
        return list.stream().map(x -> new PedidoDto(x)).collect(Collectors.toList());
    }
}