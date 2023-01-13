package com.pedido.pagamento.dtos;

import com.pedido.pagamento.entities.Pedido;
import com.pedido.pagamento.entities.enums.PedidoStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoDto {

    private Long id;

    private Instant momento;

    private PedidoStatus status;
//    private Pagamento pagamento;

    public PedidoDto(Pedido entity) {
        id = entity.getId();
        momento = entity.getMomento();
        status = entity.getStatus();
    }
}
