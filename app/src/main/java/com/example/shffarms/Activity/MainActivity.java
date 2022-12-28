package com.example.shffarms.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shffarms.Adaptor.CategoryAdaptor;
import com.example.shffarms.Adaptor.PopularAdaptor;
import com.example.shffarms.Domain.CategoryDomain;
import com.example.shffarms.Domain.FoodDomain;
import com.example.shffarms.Interface.SelectListner;
import com.example.shffarms.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SelectListner {
private RecyclerView.Adapter adapter,adapter2;
private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        recyclerViewCategory();
        recycyclerViewPopular();
        bottomNavigation();
    }

    private void bottomNavigation(){
        FloatingActionButton floatingActionButton=findViewById(R.id.cartBtn);
        LinearLayout homebtn=findViewById(R.id.homebtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,CartListActivity.class));
            }
        });
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain(" Dry Fruits","dry_fruits"));
        category.add(new CategoryDomain("Grains","grains"));
        category.add(new CategoryDomain("Spices","spices"));
        category.add(new CategoryDomain("Juices","juices"));
        category.add(new CategoryDomain("Seeds","seeds"));
        category.add(new CategoryDomain("Oils","oils"));

        adapter=new CategoryAdaptor(category,this);
        recyclerViewCategoryList.setAdapter(adapter);
    }
    private void recycyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);
        ArrayList<FoodDomain> foodList=new ArrayList<>();
        foodList.add(new FoodDomain("A2 Desi Cow Ghee","a2_desi_cow_ghee","SterlingHills Farms A2 desi cow ghee is made using the Vedic 5000-year-old Bilona method wherein fresh curd is churned bi-directionally in gentle movements to obtain butter.",548.00));
        foodList.add(new FoodDomain("Almonds","almond","Badam is one of the most renowned dried fruits accessible almost everywhere in the world. These modest-sized nuts are a nutrient-dense powerhouse that makes them a staple in most people's diets for breakfast.",567.00));
        foodList.add(new FoodDomain("Basmati Rice","basmatirice","Basmati rice is a long-grain, sweet-smelling rice with a low glycemic index that aids in lowering blood sugar levels, packed with high fiber that reduces the risk of type 2 diabetes and contributes to better brain health. When cooked, this rice lets out a flavorful aroma as it retains all its nutrients and delectable trimmings.",190.00));
        foodList.add(new FoodDomain("Bay Leaf","bay_leaf","ORGANIC BAY LEAVES – No Preservatives, Vegan, Gluten Free, hand harvested from the bay leaves tree produces broad, smooth leaves commonly referred to as a bay leaf, beautifully packed to preserve the freshness and taste, delivered right to your door.",59.00));
        foodList.add(new FoodDomain("Besan Flour","besan_flour","Besan is all you need in the kitchen to enjoy an all-natural, authentic taste of 100% unpolished chana dal in all your favourite recipes. This besan lets you indulge in dishes like dhokla, kadhi, fafda, sev and other namkeens without any compromise. Besan undergoes a 5 step purity process to ensure that besan in every packet you buy is uniform and of premium quality.",100.00));
        foodList.add(new FoodDomain("Biryani Masala","biryani_masala","We bring to you recipes inspired from the master chefs. Our range of cooking pastes ensure that you can enjoy a fragrant biryani to a flavour-packed butter masala gravy all at the comfort of your home. No added preservatives - authentic recipes- vegetarian product- natural ingredients, no artificial flavours",146.00));
        foodList.add(new FoodDomain("Cumin Whole","cumin_whole","Our organic black cumin, aka kalonji seeds, is a flavorful spice that elevates the taste of your food. These seeds are even added as a colorant or topping to enhance the presentation of food. Apart from their taste, these seeds have several health benefits",76.00));
        foodList.add(new FoodDomain("Black Mustard Seeds","black_mustard","Our mustard black are organically grown and possess a rich flavor and scent. They are commonly used in pickles and tadkas in Indian cooking, whereas they're used as sauces and other condiments in Western cuisine. Mustard seeds are abundant in fiber which aids bowel movement and aids the body's digestion capacity. ",30.00));
        adapter2=new PopularAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }


    @Override
    public void onItemClicked(CategoryDomain categoryDomain) {
        Intent intent=new Intent(getApplicationContext(),CategoryActivity.class);
        startActivity(intent);
    }
}