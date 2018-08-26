package com.example.shubham.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecAdapter extends RecyclerView.Adapter<RecViewHolder> {
   ArrayList<String> list;
    LayoutInflater inflater;
    public  RecAdapter(Context context,ArrayList<String> list)
    {
        this.list=list;
        inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=inflater.inflate(android.R.layout.simple_list_item_1,viewGroup,false);
        return new RecViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder recViewHolder, int i) {
        recViewHolder.textView.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
