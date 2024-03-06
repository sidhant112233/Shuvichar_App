package com.example.shuvichar_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HappyAdapter extends RecyclerView.Adapter<HappyAdapter.Happydata> {

    Context context;
    Integer[] Image;
    String[] name;

    public HappyAdapter(Context context,Integer[] Image, String[] name) {
        this.context = context;
        this.Image = Image;
        this.name = name;
    }

    @NonNull
    @Override
    public Happydata onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.happy_tile, parent, false);
        return new Happydata(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Happydata holder, int position) {

        holder.imgvh.setImageResource(Image[position]);
        holder.txtvh.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class Happydata extends RecyclerView.ViewHolder {

        ImageView imgvh;
        TextView txtvh;

        public Happydata(@NonNull View itemView) {
            super(itemView);
            imgvh = itemView.findViewById(R.id.imgvh);
            txtvh = itemView.findViewById(R.id.txtvh);

        }
    }
}
