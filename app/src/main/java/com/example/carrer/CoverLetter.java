package com.example.carrer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CoverLetter extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<String> mainContent=new ArrayList<>();
    ArrayList<Integer> iconImage=new ArrayList<>();
    ArrayList<String> titleContent=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover_letter);

        recyclerView=findViewById(R.id.recyclerView_CoverLetter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(CoverLetter.this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        titleContent.add("5 Easy Steps to Writing a Cover Letter");
        titleContent.add("How To Write A Cover Letter");
        titleContent.add("One Common Cover Letter Mistake to Avoid");

        mainContent.add("Writing a cover letter doesn't have to be so difficult. Here, we break down the cover letter into 5 sections to make sure you impress that recruiter.");
        mainContent.add("Knowing how to write a cover letter will make the difference between landing a job interview or not. Although not all job postings require a cover letter, se");
        mainContent.add("My Secret Tip to Fix It When I was working in Career Services, the thing I got the most questions about was cover letters. No one seemed to know why they needed one, if they needed one");

        iconImage.add(R.drawable.coverbasic);
        iconImage.add(R.drawable.coversecond);
        iconImage.add(R.drawable.images);


        ArrayList<CoverLetterModel> coverLetterModels=new ArrayList<>();
       //   coverLetterModels.add(model);

        for(int i=0;i<mainContent.size();i++)
        {
            CoverLetterModel model1=new CoverLetterModel();
            coverLetterModels.add(model1);
            model1.setText_Content(mainContent.get(i));
            model1.setContent_Image(iconImage.get(i));
            model1.setTitle_Content(titleContent.get(i));

        }


        CoverLetterAdapter coverLetterAdapter=new CoverLetterAdapter(CoverLetter.this,coverLetterModels);
        recyclerView.setAdapter(coverLetterAdapter);
    }
}
