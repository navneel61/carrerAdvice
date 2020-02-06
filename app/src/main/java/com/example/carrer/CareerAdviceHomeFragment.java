package com.example.carrer;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareerAdviceHomeFragment extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private RecyclerView recyclerView1,recyclerView2;
    private ImageView imageView1;
    private TextView textView1;
    ArrayList<CoverLetterModel> modelList=new ArrayList<>();

    String[] titleList = {"How To Write Cover Letter","Resume Tips","Job Interviews","Finding Your Dream Company","Finding Your Passion","Self Empowerment","Enterpreneurship","Job Search","Career Advancement","Networking", "Personal Branding","Employers Corner"};
    Integer[] drawableImages = {R.drawable.coverrletter,R.drawable.resumetip,R.drawable.jobinterviews,R.drawable.findcompany,R.drawable.findpassions,R.drawable.selfimprovement,R.drawable.entrepreneurship,R.drawable.jobsearchs,R.drawable.careeradvancements,R.drawable.networkings,R.drawable.brand,R.drawable.employee};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_career_advice_home, container, false);
        ButterKnife.bind(this, view);
        initCategory1(view);
//        recyclerView2 = view.findViewById(R.id.cat2).findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        toolbar.setTitleTextColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        //recyclerView1.setAdapter(new AdapterCareerAdviceCategoryView());
//        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
//        recyclerView2.setAdapter(new AdapterCareerAdviceCategoryView());
    }

    private void initCategory1 (View view){
        CoverLetterModel model=new CoverLetterModel();
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        CoverLetterModel model1=new CoverLetterModel();
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        CoverLetterModel model2=new CoverLetterModel();
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView1 = view.findViewById(R.id.cat1).findViewById(R.id.recyclerView);
        imageView1=view.findViewById(R.id.cat1).findViewById(R.id.image_category_icon);
        textView1=view.findViewById(R.id.cat1).findViewById(R.id.text_view_title);
        imageView1.setImageResource(drawableImages[0]);
        textView1.setText(titleList[0]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(CareerAdviceHomeFragment.this,modelList);
        recyclerView1.setAdapter(adapterCareerAdviceCategoryView);
    }
}
