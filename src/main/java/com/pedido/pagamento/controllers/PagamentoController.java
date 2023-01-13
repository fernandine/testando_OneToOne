package com.pedido.pagamento.controllers;

import com.pedido.pagamento.dtos.PagamentoDto;
import com.pedido.pagamento.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    @GetMapping
    public ResponseEntity<List<PagamentoDto>> findAll() {
        List<PagamentoDto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
