package com.example.shubham.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public RecViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(android.R.id.text1);
    }
}
