package com.example.retrofit.adapter;

import static android.graphics.Color.parseColor;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private ArrayList<CryptoModel> cryptoList;

    String[] colors = {"#DFFF00","#FFBF00","#FF7F50","#DE3163","#DE3163","#9FE2BF","#40E0D0","#40E0D0","#CCCCFF"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
    holder.bind(cryptoList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class  RowHolder extends RecyclerView.ViewHolder{

        TextView textName;
        TextView textPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);


        }
        public void bind(CryptoModel cryptoModel,String[] colors, Integer Position){
            textName = itemView.findViewById(R.id.text_name);
            textPrice = itemView.findViewById(R.id.text_price);
            textName.setText(cryptoModel.getCurrency());
            textPrice.setText(cryptoModel.getPrice());
        }

    }


}
