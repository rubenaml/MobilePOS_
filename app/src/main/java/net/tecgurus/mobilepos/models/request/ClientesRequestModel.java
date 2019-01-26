package net.tecgurus.mobilepos.models.request;

import net.tecgurus.mobilepos.models.entities.ClienteEntity;

import java.util.List;

public class ClientesRequestModel extends RequestModel {

    final static public String TYPE_SALDO = "SALDO";
    final static public String TYPE_CLIENTS = "CLIENTS";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    private String criteria;
    private List<ClienteEntity> clientes;
    private String type = TYPE_CLIENTS;
    private double saldo;
    private String clienteID;

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public List<ClienteEntity> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteEntity> clientes) {
        this.clientes = clientes;
    }



}
