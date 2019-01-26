package net.tecgurus.mobilepos.models.entities;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class PedidosEntityView {
    @Embedded
    private PedidoEntity pedidoEntity;

    @Relation(parentColumn = "id", entityColumn = "pedidoId", entity = PedidoEntity.class)
    private List<PartidaPedidoEntity> partidaPedidoEntityList;

    public PedidoEntity getPedidoEntity(){
        return pedidoEntity;
    }
}
