package com.devdroid.projretrieveday2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    public Adapter(List<Model> list) {
        this.list = list;
    }

    private List<Model> list;
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Model model= list.get(position);
        Log.d("Adapter","model name: "+ model.getName());
        holder.nameTextView.setText(model.getName());
        holder.designationTextView.setText(model.getDesignation());
        holder.phoneTextView.setText(model.getPhone());
        holder.idTextView.setText(model.getId());

    }

    @Override
    public int getItemCount() {
        Log.d("Adapter","List Size:" +list.size());

        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView designationTextView;
        public TextView phoneTextView;
        public TextView idTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.display_name);
            designationTextView = itemView.findViewById(R.id.designation_display);
            phoneTextView = itemView.findViewById(R.id.display_phone);
            idTextView = itemView.findViewById(R.id.id_display);

        }
        }
    }