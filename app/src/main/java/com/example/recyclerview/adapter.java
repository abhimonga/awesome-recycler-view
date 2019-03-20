package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

        private List<data> list;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title, year, rate,open,close,high,low;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.title);
                rate = (TextView) view.findViewById(R.id.rate);
                open = (TextView) view.findViewById(R.id.open);
                close = (TextView) view.findViewById(R.id.close);
                high = (TextView) view.findViewById(R.id.high);
                low= (TextView) view.findViewById(R.id.low);
                year = (TextView) view.findViewById(R.id.year);
            }
        }


        public adapter(List<data> moviesList) {
            this.list = moviesList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.activity_datalist, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            data movie = list.get(position);
            holder.title.setText(movie.getTitle());
            holder.rate.setText(movie.getRate());
            holder.open.setText(movie.getOpen());
            holder.close.setText(movie.getClose());
            holder.high.setText(movie.getHigh());
            holder.low.setText(movie.getLow());
            holder.year.setText(movie.getYear());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }