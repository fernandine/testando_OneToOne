package com.pedido.pagamento.controllers;

import com.pedido.pagamento.dtos.PagamentoDto;
import com.pedido.pagamento.dtos.PedidoDto;
import com.pedido.pagamento.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public ResponseEntity<List<PedidoDto>> findAll() {
        List<PedidoDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
