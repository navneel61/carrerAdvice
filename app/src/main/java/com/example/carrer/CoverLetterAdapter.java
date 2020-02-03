package com.example.carrer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CoverLetterAdapter extends RecyclerView.Adapter<CoverLetterAdapter.CoverLetters> {

    ArrayList<CoverLetterModel> coverLetterModels=new ArrayList<>();
    public View.OnClickListener mOnClickListener = new MyOnClickListener();;
    Context context;


    public CoverLetterAdapter(Context context,ArrayList<CoverLetterModel> coverLetterModels)
    {
        this.context=context;
        this.coverLetterModels=coverLetterModels;
    }

    @NonNull
    @Override
    public CoverLetters onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.coverletterlayout,parent,false);
        return new CoverLetters(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull CoverLetters holder, int position) {


        CoverLetterModel model=coverLetterModels.get(position);
      //  int img=model.getMain_Image();
     //   String main_Topic=model.getText_Main();
        int imge=model.getContent_Image();
        String title_Content=model.getTitle_Content();
        String text_content=model.getText_Content();

        holder.setData(imge,text_content,title_Content);

    }

    @Override
    public int getItemCount() {
        return coverLetterModels.size();
    }

    public class CoverLetters extends RecyclerView.ViewHolder
    {
        ImageView imageView,imageView_C;
        TextView textView,textView_C;

        public CoverLetters(@NonNull View itemView) {

            super(itemView);

            imageView_C=itemView.findViewById(R.id.imageView_content);
            textView=itemView.findViewById(R.id.textView_content);
            textView_C=itemView.findViewById(R.id.textView_title);

        }
        private void setData(int imge,String text_Contents,String title_Content)
        {
            imageView_C.setImageResource(imge);
            textView.setText(text_Contents);
            textView_C.setText(title_Content);
        }
    }
    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {


        }
    }

}
