package com.example.carrer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SummaryActivity extends AppCompatActivity {

    private RecyclerView recyclerViewRelatedArticles;
    int[] images={R.drawable.coversecond,R.drawable.images,R.drawable.resumewriting,R.drawable.coverletterthree,R.drawable.writecoverlettertwo,R.drawable.writecoverletterthree,R.drawable.brilliantcoverletter,R.drawable.killcover,R.drawable.careerexperience};
    String[] title={"How To Write A Cover Letter","One Common Cover Letter Mistake to Avoid | My Secret Tip to Fix It","What to Write when Emailing a Resume - Perfectly Employed","7 tips for a beautiful authentic cover letter","7 SECRETS FOR WRITING THE PERFECT COVER LETTER","How to Write a Great Cover Letter in 6 Steps","How to Write a Brilliant Cover Letter | Life with Caitlyn","HOW TO QUICKLY WRITE A KILLER COVER LETTER","\n" +
            "How to Write a Cover Letter (With \"No\" Experience)"};
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        recyclerViewRelatedArticles = findViewById(R.id.recyclerView_relatedArticles);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewRelatedArticles.setLayoutManager(linearLayoutManager);
        recyclerViewRelatedArticles.setNestedScrollingEnabled(false);
        List<CoverLetterModel> relatedArticle = new ArrayList<>();
         CoverLetterModel article_model;
         Log.d("sizee", String.valueOf(images.length));
        for (int i = 0; i<images.length; i++)
        {
            article_model=new CoverLetterModel();
            article_model.setContent_Image(images[i]);
            article_model.setTitle_Content(title[i]);
            relatedArticle.add(article_model);
        }
        Log.d("relatedsize", String.valueOf(relatedArticle.size()));
        CoverLetterAdapter adapter=new CoverLetterAdapter(this, (ArrayList<CoverLetterModel>) relatedArticle,1);
        recyclerViewRelatedArticles.setAdapter(adapter);
    }
}
