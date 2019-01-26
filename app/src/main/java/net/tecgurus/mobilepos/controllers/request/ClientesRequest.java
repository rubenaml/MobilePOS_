package net.tecgurus.mobilepos.controllers.request;

import com.google.gson.Gson;

import net.tecgurus.mobilepos.models.entities.ClienteEntity;
import net.tecgurus.mobilepos.models.request.ClientesRequestModel;

import java.util.List;

public class ClientesRequest extends Request {
    private OnResult onResult;
    private ClientesRequestModel clientesRequestModel;
    private OnResultSaldo onResultSaldo;


    @Override
    protected void onResult(String result) {
        final Gson gson = new Gson();
        final ClientesRequestModel clientesRequestModel = gson.fromJson(result,ClientesRequestModel.class);
        if(clientesRequestModel.isResult()){
            if(clientesRequestModel.getType().compareTo(ClientesRequestModel.TYPE_CLIENTS)==0){
                if(this.onResult!=null){
                    this.onResult.onSuccess(clientesRequestModel.getClientes());
                }
            }
            else if(clientesRequestModel.getType().compareTo(ClientesRequestModel.TYPE_SALDO)==0){
                if(this.onResultSaldo!=null){
                    this.onResultSaldo.onResult(clientesRequestModel.getSaldo());
                }
            }
        }
    }

    @Override
    public void execute() throws Exception {
        final Gson gson=new Gson();
        final  String json= gson.toJson(this.clientesRequestModel);
        final String result=this.requestManager.post("http//localhost:8088/Login",json);
        this.onResult(result);

    }

    public interface OnResult{
            void onSuccess(List<ClienteEntity> clients);
        }

    public interface OnResultSaldo{
        void onResult(double saldo);
    }

    }
