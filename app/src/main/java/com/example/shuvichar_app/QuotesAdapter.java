package com.example.shuvichar_app;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.dataViewHolder> {

    Context context;
    Integer[] image;
    String[] name;

    public QuotesAdapter(Context context, Integer[] image, String[] name) {
        this.image = image;
        this.name = name;
        this.context = context;
    }

    @NonNull
    @Override
    public dataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.quotes_tile, parent, false);
        return new dataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataViewHolder holder, int position) {

        holder.imghv.setImageResource(image[position]);
        holder.txthv.setText(name[position]);

        holder.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Happy_Activity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    class dataViewHolder extends RecyclerView.ViewHolder {


        ImageView imghv;
        TextView txthv;

        CardView card1;



        public dataViewHolder(@NonNull View itemView) {
            super(itemView);

            card1 = itemView.findViewById(R.id.card1);
            imghv = itemView.findViewById(R.id.imghv);
            txthv = itemView.findViewById(R.id.txthv);
        }
    }
}
