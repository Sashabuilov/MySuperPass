package com.builov.mysuperpass;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<model> loginpassword;

    DataAdapter(List<model> loginpassword, Context context) {
        this.loginpassword = loginpassword;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = inflater.inflate(R.layout.item_holder,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        model thisModel = loginpassword.get(position);
        viewHolder.login.setText(thisModel.getLogin());
    }

    @Override
    public int getItemCount() {
        return loginpassword.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        final TextView login;
        ViewHolder(View view) {
            super(view);
            login = view.findViewById(R.id.login);
        }
    }
}
