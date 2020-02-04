package com.example.carrer;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CoverLetterAdapter extends RecyclerView.Adapter<CoverLetterAdapter.CoverLetters> {

    ArrayList<CoverLetterModel> coverLetterModels;
    Context context;
    int type;

    public CoverLetterAdapter(Context context,ArrayList<CoverLetterModel> coverLetterModels,int type)
    {
        this.context=context;
        this.coverLetterModels=coverLetterModels;
        Log.d("conssize", String.valueOf(this.coverLetterModels.size()));
        this.type=type;
    }

    @NonNull
    @Override
    public CoverLetters onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_coverletter,parent,false);
        return new CoverLetters(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull CoverLetters holder, int position) {
        CoverLetterModel model=coverLetterModels.get(position);
        holder.imageViewC.setImageResource(model.getContent_Image());
        holder.textViewC.setText(model.getTitle_Content());
        if(type==0)
        {
            holder.textView.setText(model.getText_Content());
            Log.d("type0size", String.valueOf(coverLetterModels.size()));
            holder.buttonRead.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(new Intent(context,SummaryActivity.class));
                }
            });
        }
        else if(type==1)
        {
            holder.textView.setVisibility(View.GONE);
            holder.buttonRead.setVisibility(View.GONE);
            Log.d("type1size", String.valueOf(coverLetterModels.size()));
        }
    }

    @Override
    public int getItemCount() {
        return coverLetterModels.size();
    }

    public class CoverLetters extends RecyclerView.ViewHolder
    {
        ImageView imageView,imageViewC;
        TextView textView,textViewC;
        Button buttonRead;
        ImageView imgRelatedAticles;
        TextView textViewRelatedArticleTitle;
        public CoverLetters(@NonNull View itemView) {

            super(itemView);
            imageViewC=itemView.findViewById(R.id.image_view);
            textView=itemView.findViewById(R.id.text_description);
            textViewC=itemView.findViewById(R.id.text_title);
            buttonRead=itemView.findViewById(R.id.button_read);
            imgRelatedAticles=itemView.findViewById(R.id.image_view_related);
            textViewRelatedArticleTitle=itemView.findViewById(R.id.text_title_related);
        }
    }
}
