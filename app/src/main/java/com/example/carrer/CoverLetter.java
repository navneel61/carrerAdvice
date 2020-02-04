package com.example.carrer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class CoverLetter extends AppCompatActivity {

    private RecyclerView recyclerView;
    ArrayList<String> mainContent=new ArrayList<>();
    ArrayList<Integer> iconImage=new ArrayList<>();
    ArrayList<String> titleContent=new ArrayList<>();
    String[] titlesContent={"5 Easy Steps to Writing a Cover Letter","How To Write A Cover Letter","One Common Cover Letter Mistake to Avoid | My Secret Tip to Fix It","What to Write when Emailing a Resume - Perfectly Employed","7 tips for a beautiful authentic cover letter","7 SECRETS FOR WRITING THE PERFECT COVER LETTER","How to Write a Great Cover Letter in 6 Steps","How to Write a Brilliant Cover Letter | Life with Caitlyn","HOW TO QUICKLY WRITE A KILLER COVER LETTER","\n" +
            "How to Write a Cover Letter (With \"No\" Experience)"};
    String[] mainsContent={"Writing a cover letter doesn't have to be so difficult. Here, we break down the cover letter into 5 sections to make sure you impress that recruiter.","Knowing how to write a cover letter will make the difference between landing a job interview or not. Although not all job postings require a cover letter, se","When I was working in Career Services, the thing I got the most questions about was cover letters. No one seemed to know why they needed one, if they needed one","Applying for jobs can be awkward, especially when companies ask for an application process that feels disjointed. We often see employers ask for applicants to e","If you’re not comfortable tooting your own horn, writing a cover letter can be even worse than crafting a beautiful resume- telling your future employer why t","Do recruiters and hiring managers read cover letters today? Absolutely! The reason cover letters get such a bad reputation is because most job seekers don’t t","Your cover letter is an opportunity to impress. Get it right and a hiring manager will open your beautifully crafted resume with relish and a sense of optimism."
    ,"I had no idea what a cover letter was until about a month into my first semester of college when I went to apply to be an orientation leader. Then I was scrambl","As a professional resume writer, you’d think that writing a killer cover letter would come easily to me. Yet, I regularly dreaded having to sit down and write","By the time you’re looking for your first job that requires a cover letter, you’re likely at least 18 years old. In 18 years, you have acquired applicable e"};
    Integer[] imgProfile={R.drawable.coverbasic,R.drawable.coversecond,R.drawable.images,R.drawable.resumewriting,R.drawable.coverletterthree,R.drawable.writecoverlettertwo,R.drawable.writecoverletterthree,R.drawable.brilliantcoverletter,R.drawable.killcover,R.drawable.careerexperience};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_cover_letter);

        recyclerView=findViewById(R.id.recyclerView_CoverLetter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(CoverLetter.this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<CoverLetterModel> coverLetterModels=new ArrayList<>();

        for(int i=0;i<mainsContent.length;i++)
        {
            CoverLetterModel model1=new CoverLetterModel();
            model1.setText_Content(mainsContent[i]);
            model1.setContent_Image(imgProfile[i]);
            model1.setTitle_Content(titlesContent[i]);
            coverLetterModels.add(model1);
        }


        CoverLetterAdapter coverLetterAdapter=new CoverLetterAdapter(CoverLetter.this,coverLetterModels,0);
        recyclerView.setAdapter(coverLetterAdapter);
    }
}
