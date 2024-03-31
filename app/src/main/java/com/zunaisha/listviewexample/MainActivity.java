package com.zunaisha.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
Spinner spinner;
AutoCompleteTextView actxtView;
int[] arrNo =new int[]{1,2,3,4,5,6};
ArrayList<String> arrNames =new ArrayList<>();
ArrayList<String> arrIds = new ArrayList<>();
ArrayList<String> arrLanguages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);

        arrNames.add("Zunaisha Noor");
        arrNames.add("Zunaira Noor");
        arrNames.add("Abdul Haseeb");
        arrNames.add("Abdul Muqeet");
        arrNames.add("Meerab Noor");
        arrNames.add("Muniza Noor");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1 , arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this,"Clicked First Item" , Toast.LENGTH_SHORT).show();
                }
                else if(position==1){
                    Toast.makeText(MainActivity.this,"Clicked Second Item" , Toast.LENGTH_SHORT).show();
                }
                else if(position==2){
                    Toast.makeText(MainActivity.this,"Clicked Third Item" , Toast.LENGTH_SHORT).show();
                }
                else if(position==3){
                    Toast.makeText(MainActivity.this,"Clicked Fourth Item" , Toast.LENGTH_SHORT).show();
                }
                else if(position==4){
                    Toast.makeText(MainActivity.this,"Clicked Fifth Item" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Clicked Item" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Spinner
        arrIds.add("Aadhar Car");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");


        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);

//        Auto Complete TextView

        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("Java");
        arrLanguages.add("Python");
        arrLanguages.add("PHP");
        arrLanguages.add("Objective #");
        arrLanguages.add("CScript");
        arrLanguages.add("C#");
        arrLanguages.add("Html");
        arrLanguages.add("CSS");

        ArrayAdapter<String> actvAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,arrLanguages);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1);

    }
}