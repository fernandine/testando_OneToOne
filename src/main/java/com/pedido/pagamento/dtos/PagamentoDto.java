package com.pedido.pagamento.dtos;

import com.pedido.pagamento.entities.Pagamento;
import com.pedido.pagamento.entities.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PagamentoDto {

    private Long id;
    private Instant momento;
//    private Pedido pedido;

    public PagamentoDto(Pagamento entity) {
        id = entity.getId();
        momento = entity.getMomento();

    }
}
