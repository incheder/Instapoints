package com.test.instapoints.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.test.instapoints.R;
import com.test.instapoints.models.Coupon;
import com.test.instapoints.models.Payment;

import java.util.ArrayList;

/**
 * Created by eder on 7/28/16.
 */
public class CouponsAdapter extends RecyclerView.Adapter<CouponsAdapter.ViewHolder> {

    private ArrayList<Coupon> dataSet;

    public CouponsAdapter(ArrayList<Coupon> dataSet){
        this.dataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_coupon_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Coupon coupon = dataSet.get(position);
        if(coupon.getImgUrl()!= null && !TextUtils.isEmpty(coupon.getImgUrl())){
            Picasso.with(holder.imgCoupon.getContext()).load(coupon.getImgUrl()).into(holder.imgCoupon);
        }

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgCoupon;


        public ViewHolder(View v) {
            super(v);
            imgCoupon = (ImageView) v.findViewById(R.id.imageViewCoupon);

        }
    }
}
