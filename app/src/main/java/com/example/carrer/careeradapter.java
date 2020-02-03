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

    public careeradapter(Context context,ArrayList<carreermodel> carreermodels)
    {
        this.context=context;
        this.carreermodels=carreermodels;
        Log.d("thus",String.valueOf(carreermodels.size()));
    }

    @NonNull
    @Override
    public careerss onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.careeradvice,parent,false);
        return new careerss(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull careerss holder, int position) {

        carreermodel mo=carreermodels.get(position);
        int img=mo.getImg();
        String topic=mo.getTopic();
        String view=mo.getView();
        int color=mo.getColor();

        holder.setData(topic,view,img,color);
    }

    @Override
    public int getItemCount() {
        return carreermodels.size();
    }

    public class careerss extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView imageView;
        TextView textView;
        TextView textVieww;
        CardView cardView,cardVieww,cardViewww;

        public careerss(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.topic);
            textVieww=itemView.findViewById(R.id.view);
            cardView=itemView.findViewById(R.id.cardview);
            cardVieww=itemView.findViewById(R.id.cardvieww);
            cardViewww=itemView.findViewById(R.id.cardviewww);
            itemView.setOnClickListener(this);
        }

        private void setData(String topic, String view, int img, int color)
        {
            imageView.setImageResource(img);
            textView.setText(topic);
            textVieww.setText(view);
            cardView.setCardBackgroundColor(color);
        }

        @Override
        public void onClick(View v) {
            context.startActivity(new Intent(context,CoverLetter.class));
        }
    }


}
