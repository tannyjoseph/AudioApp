package com.example.audioapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.audioapp.Activities.AudioPlayerActivity;
import com.example.audioapp.Classes.MyListData;
import com.example.audioapp.R;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private MyListData[] listdata;
    private Context context;

    // RecyclerView recyclerView;
    public MyListAdapter(MyListData[] listdata, Context context) {
        this.listdata = listdata;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.card, parent, false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final MyListData myListData = listdata[position];
        holder.title.setText(myListData.getTitle());
        holder.subject.setImageResource(myListData.getImage());

        holder.subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(view.getContext(), AudioPlayerActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView subject;
        TextView title;

        ViewHolder(View itemView) {
            super(itemView);
            this.subject =  itemView.findViewById(R.id.thumbnail);
            this.title =  itemView.findViewById(R.id.title);

        }
    }
}