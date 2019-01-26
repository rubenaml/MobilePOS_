package net.tecgurus.mobilepos.controllers.listviews;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.tecgurus.mobilepos.R;
import net.tecgurus.mobilepos.models.entities.ClienteEntity;

import java.util.List;

public class ClientesAdapter extends BaseAdapter {
    private List<ClienteEntity> clienteEntityList;
    private Activity activity;


    @Override
    public int getCount() {
        return clienteEntityList.size();
    }

    @Override
    public Object getItem(int i) {
        return clienteEntityList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return clienteEntityList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view=LayoutInflater.from(activity).inflate(R.layout.item_clientes,viewGroup,false);
       }
       final ClienteEntity clienteEntity=(ClienteEntity) getItem(i);

        final TextView txtvNombre=(TextView) view.findViewById(R.id.txtNombre_);
        txtvNombre.setText(clienteEntity.getNombre());

        final TextView txtvSaldo=(TextView) view.findViewById(R.id.txtSaldo_);
        txtvSaldo.setText("0");

        final TextView txtvContacto=(TextView) view.findViewById(R.id.txtContacto_);
        txtvContacto.setText("(33) 23 44 13 23");

        final TextView txtvNumeroCliente=(TextView) view.findViewById(R.id.txtNumeroCliente_);
        txtvNumeroCliente.setText(clienteEntity.getId());

        return view;

    }

    public void setClienteEntityList(List<ClienteEntity> clienteEntityList) {
        this.clienteEntityList=clienteEntityList;
    }
}
