package com.example.carrer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> mainContent=new ArrayList<>();
    ArrayList<Integer> iconImage=new ArrayList<>();
    ArrayList<String> viewContent=new ArrayList<>();
    ArrayList<Integer> backColor=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);



        mainContent.add("How To Write Cover Letter");
        mainContent.add("Resume Tips");
        mainContent.add("Job Interviews");
        mainContent.add("Finding Your Dream Company");
        mainContent.add("Finding Your Passion");
        mainContent.add("Self Empowerment");
        mainContent.add("Enterpreneurship");
        mainContent.add("Job Search");
        mainContent.add("Career Advancement");
        mainContent.add("Networking");
        mainContent.add("Personal Branding");
        mainContent.add("Employers Corner");

        iconImage.add(R.drawable.msg);
        iconImage.add(R.drawable.resume);
        iconImage.add(R.drawable.jobinterview);
        iconImage.add(R.drawable.find);
        iconImage.add(R.drawable.findpassion);
        iconImage.add(R.drawable.selfempowerment);
        iconImage.add(R.drawable.enterpreneur);
        iconImage.add(R.drawable.jobsearch);
        iconImage.add(R.drawable.careeradvancement);
        iconImage.add(R.drawable.networking);
        iconImage.add(R.drawable.personalbranding);
        iconImage.add(R.drawable.employerwork);

        for(int i=0;i<mainContent.size();i++)
        {
            viewContent.add("View");
        }


        backColor.add(ContextCompat.getColor(this,R.color.colorSkyBlue));
        backColor.add(ContextCompat.getColor(this,R.color.colorRed));
        backColor.add(ContextCompat.getColor(this,R.color.colorOrange));
        backColor.add(ContextCompat.getColor(this,R.color.colorVoilet));
        backColor.add(ContextCompat.getColor(this,R.color.colorDarkRed));
        backColor.add(ContextCompat.getColor(this,R.color.colorGreen));
        backColor.add(ContextCompat.getColor(this,R.color.colorLightSkyBlue));
        backColor.add(ContextCompat.getColor(this,R.color.colorDarkerRed));
        backColor.add(ContextCompat.getColor(this,R.color.colorLightOrange));
        backColor.add(ContextCompat.getColor(this,R.color.colorVoilet));
        backColor.add(ContextCompat.getColor(this,R.color.colorRed));
        backColor.add(ContextCompat.getColor(this,R.color.colorGreen));




        ArrayList<carreermodel> carreermodels=new ArrayList<>();
      //  carreermodels.add(model);

        for(int i=0;i<mainContent.size();i++)
        {
            carreermodel model=new carreermodel();
            carreermodels.add(model);
            model.setTopic(mainContent.get(i));
            model.setImg(iconImage.get(i));
            model.setView(viewContent.get(i));
            model.setColor(backColor.get(i));

        }




        careeradapter careeradapters=new careeradapter(MainActivity.this,carreermodels);
        recyclerView.setAdapter(careeradapters);


    }

    }
