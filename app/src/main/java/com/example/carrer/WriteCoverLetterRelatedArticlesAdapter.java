package com.example.carrer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class WriteCoverLetterRelatedArticlesAdapter extends RecyclerView.Adapter<WriteCoverLetterRelatedArticlesAdapter.RelatedArticle> {
    List<RelatedArticlesModel> relatedArticleModelList=new ArrayList<>();
    Context context;
    ImageView imgRelatedAticles;
    TextView textViewRelatedArticleTitle;
    int type; // 0 for  1 for related
    public WriteCoverLetterRelatedArticlesAdapter(Context context, List<RelatedArticlesModel> relatedArticleModelList)
    {
        this.context=context;
        this.relatedArticleModelList=relatedArticleModelList;
    }

    @NonNull
    @Override
    public RelatedArticle onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View relateView=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_coverletter_related,parent,false);
        return new RelatedArticle(relateView);
    }

    @Override
    public void onBindViewHolder(@NonNull RelatedArticle holder, int position) {
                RelatedArticlesModel relatedArticleModel=new RelatedArticlesModel();
                imgRelatedAticles.setImageResource(relatedArticleModel.getImageMain());
                textViewRelatedArticleTitle.setText(relatedArticleModel.getTextTitle());
                relatedArticleModelList.add(relatedArticleModel);
    }

    @Override
    public int getItemCount() {
        return relatedArticleModelList.size();
    }

    public class RelatedArticle extends RecyclerView.ViewHolder {

        public RelatedArticle(@NonNull View itemView) {
            super(itemView);
            imgRelatedAticles=itemView.findViewById(R.id.image_view_related);
            textViewRelatedArticleTitle=itemView.findViewById(R.id.text_title_related);
        }
    }
}
