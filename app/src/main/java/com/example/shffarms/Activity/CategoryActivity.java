package com.example.shffarms.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shffarms.Adaptor.CategoryActivityAdaptor;
import com.example.shffarms.Domain.Category_Activity_Domain;
import com.example.shffarms.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity{
    RecyclerView categoryActivityRecyclerView;
    LinearLayoutManager layoutManager;
    List<Category_Activity_Domain> itemList;
    CategoryActivityAdaptor adapterCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initData();
        initRecyclerView();
    }
    private void initData() {
        itemList=new ArrayList<>();
        itemList.add(new Category_Activity_Domain(R.drawable.almond,"Almonds","100gm","Rs. 100",R.drawable.add_btn,R.drawable.almond,"Almonds","100gm","Rs. 100",R.drawable.add_btn));
        itemList.add(new Category_Activity_Domain(R.drawable.almond,"Almonds","100gm","Rs. 100",R.drawable.add_btn,R.drawable.almond,"Almonds","100gm","Rs. 100",R.drawable.add_btn));
        itemList.add(new Category_Activity_Domain(R.drawable.almond,"Almonds","100gm","Rs. 100",R.drawable.add_btn,R.drawable.almond,"Almonds","100gm","Rs. 100",R.drawable.add_btn));
    }
    private void initRecyclerView() {
        categoryActivityRecyclerView=findViewById(R.id.categoryActivityRecyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        categoryActivityRecyclerView.setLayoutManager(layoutManager);
        adapterCategory=new CategoryActivityAdaptor(itemList);
        categoryActivityRecyclerView.setAdapter(adapterCategory);
        adapterCategory.notifyDataSetChanged();
    }
}