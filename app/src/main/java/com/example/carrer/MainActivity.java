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
