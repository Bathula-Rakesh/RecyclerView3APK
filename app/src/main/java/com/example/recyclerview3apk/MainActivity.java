package com.example.recyclerview3apk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomModel customModel;
    CustomAdapter customAdapter;

    List<CustomModel> customModels= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_view_1);
        recyclerView.setHasFixedSize(true);
        //Layout Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //Adapters set to recylerview
        customAdapter=new CustomAdapter(getApplicationContext(),customModels);
        recyclerView.setAdapter(customAdapter);

        loadData();
    }

    private void loadData() {
        customModel =new CustomModel(R.drawable.facebook,"Facebook");
        customModels.add(customModel);
        customModel =new CustomModel(R.drawable.instagram,"Instagram");
        customModels.add(customModel);
        customModel =new CustomModel(R.drawable.linkedin,"Linkedin");
        customModels.add(customModel);
        customModel =new CustomModel(R.drawable.snapchat,"Snapchat");
        customModels.add(customModel);
        customModel =new CustomModel(R.drawable.telegram,"Telegram");
        customModels.add(customModel);
        customModel =new CustomModel(R.drawable.whatsapp,"Whatsapp");
        customModels.add(customModel);
        customModel =new CustomModel(R.drawable.youtube,"Youtube");
        customModels.add(customModel);
    }
}