package net.tecgurus.mobilepos.models.entities;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class VendedoresEntityView {
    @Embedded
    public VendedoresEntity vendedoresEntity;
    @Relation(parentColumn = "Id", entityColumn = "vendedorId",entity = ClienteEntity.class)
    public List<ClienteEntity> clienteEntityList;

    public VendedoresEntity getVendedoresEntity() {
        return vendedoresEntity;
    }

    public void setVendedoresEntity(VendedoresEntity vendedoresEntity) {
        this.vendedoresEntity = vendedoresEntity;
    }

    public List<ClienteEntity> getClienteEntityList() {
        return clienteEntityList;
    }

    public void setClienteEntityList(List<ClienteEntity> clienteEntityList) {
        this.clienteEntityList = clienteEntityList;
    }
}
