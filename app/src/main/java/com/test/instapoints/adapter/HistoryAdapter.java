package com.test.instapoints.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.test.instapoints.R;
import com.test.instapoints.model.Payment;

import java.util.ArrayList;

/**
 * Created by eder on 7/28/16.
 */
public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.ViewHolder> {

    private ArrayList<Payment> dataSet;

    public HistoryAdapter(ArrayList<Payment> dataSet){
        this.dataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_payment_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Payment payment = dataSet.get(position);
        //Picasso.with(holder.imgCity.getContext()).load(city.getImgUrl()).into(holder.imgCity);
        holder.txtCost.setText("Costo: " + String.valueOf(payment.getCosto()));
        holder.txtPoints.setText("Puntos: " + String.valueOf(payment.getPuntos()));
        holder.txtDescription.setText("Producto: " + String.valueOf(payment.getDescripcion()));

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtCost;
        public TextView txtPoints;
        public TextView txtDescription;


        public ViewHolder(View v) {
            super(v);
            txtCost = (TextView) v.findViewById(R.id.textViewCost);
            txtPoints = (TextView) v.findViewById(R.id.textViewPoints);
            txtDescription = (TextView) v.findViewById(R.id.textViewDescription);
        }
    }
}
