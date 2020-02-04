package com.example.carrer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> mainContent=new ArrayList<>();
    ArrayList<Integer> iconImage=new ArrayList<>();
    ArrayList<String> viewContent=new ArrayList<>();
    ArrayList<Integer> backColor=new ArrayList<>();
    String[] topicList = {"How To Write Cover Letter","Resume Tips","Job Interviews","Finding Your Dream Company","Finding Your Passion","Self Empowerment","Enterpreneurship","Job Search","Career Advancement","Networking", "Personal Branding","Employers Corner"};
    Integer[] drawableImages = {R.drawable.coverrletter,R.drawable.resumetip,R.drawable.jobinterviews,R.drawable.findcompany,R.drawable.findpassions,R.drawable.selfimprovement,R.drawable.entrepreneurship,R.drawable.jobsearchs,R.drawable.careeradvancements,R.drawable.networkings,R.drawable.brand,R.drawable.employee};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        int[] colorList = this.getResources().getIntArray(R.array.colors);


     /*   categoryList.put("title","How To Write Cover Letter");
        categoryList.put("image",R.drawable.coverrletter);
        categoryList.put("view","view");
        categoryList.put("color",ContextCompat.getColor(this,R.color.colorSkyBlue));

        categoryHashMapList.add(categoryList);

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

        iconImage.add(R.drawable.coverrletter);
        iconImage.add(R.drawable.resumetip);
        iconImage.add(R.drawable.jobinterviews);
        iconImage.add(R.drawable.findcompany);
        iconImage.add(R.drawable.findpassions);
        iconImage.add(R.drawable.selfimprovement);
        iconImage.add(R.drawable.entrepreneurship);
        iconImage.add(R.drawable.jobsearchs);
        iconImage.add(R.drawable.careeradvancements);
        iconImage.add(R.drawable.networkings);
        iconImage.add(R.drawable.brand);
        iconImage.add(R.drawable.employee);

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
        backColor.add(ContextCompat.getColor(this,R.color.colorGreen)); */




        ArrayList<carreermodel> carreermodels=new ArrayList<>();
        for(int i=0;i<colorList.length;i++)
        {
            carreermodel model=new carreermodel();
            model.setTopic(topicList[i]);
            model.setImg(drawableImages[i]);
            model.setColor(colorList[i]);
            Log.d("colouractivity", String.valueOf(colorList[i]));
            carreermodels.add(model);
        }




        careeradapter careeradapters=new careeradapter(MainActivity.this,carreermodels);
        recyclerView.setAdapter(careeradapters);


    }

    }
