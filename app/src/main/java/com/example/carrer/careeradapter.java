package com.example.carrer;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class careeradapter extends RecyclerView.Adapter<careeradapter.careerss> {

    ArrayList<carreermodel> carreermodels;
    Context context;
    ImageView imageView;
    TextView textView;
    CardView cardView,cardVieww,cardViewww;

    public careeradapter(Context context,ArrayList<carreermodel> carreermodels)
    {
        this.context=context;
        this.carreermodels=carreermodels;
        Log.d("thus",String.valueOf(carreermodels.size()));
    }

    @NonNull
    @Override
    public careerss onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_category,parent,false);
        return new careerss(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull careerss holder, int position) {

        carreermodel mo=carreermodels.get(position);
        imageView.setImageResource(mo.getImg());
        textView.setText(mo.getTopic());
        cardView.setCardBackgroundColor(mo.getColor());
        Log.d("colouris",String.valueOf(mo.getColor()));
    }

    @Override
    public int getItemCount() {
        return carreermodels.size();
    }

    public class careerss extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public careerss(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.topic);
            cardView=itemView.findViewById(R.id.cardview);
            cardVieww=itemView.findViewById(R.id.cardvieww);
            cardViewww=itemView.findViewById(R.id.cardviewww);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            context.startActivity(new Intent(context,CoverLetter.class));
        }
    }


}
