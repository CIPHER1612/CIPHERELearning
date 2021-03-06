package com.example.sammy.ciphere_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSS2S1 extends AppCompatActivity {

    ExpandableListView Exp_list;
    MoviesAdapter adapterX;

    List<String> Movies_list;
    HashMap<String, List<String>> Movies_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs2_s1);
        Exp_list = findViewById(R.id.exp_list);
        Movies_category = DataProviderCSS2S1.getInfo();
        Movies_list = new ArrayList<String>(Movies_category.keySet());
        adapterX = new MoviesAdapter(this, Movies_category, Movies_list);
        Exp_list.setAdapter(adapterX);

        Exp_list.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                //Toast.makeText(getBaseContext(),Movies_list.get(i)+"is expanded",Toast.LENGTH_LONG).show();
            }
        });

        Exp_list.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {
                // Toast.makeText(getBaseContext(),Movies_list.get(i)+" is shrunk",Toast.LENGTH_LONG).show();

            }
        });
        Exp_list.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                int ps = i;
                Toast.makeText(getApplicationContext(), "vlaue is " + ps, Toast.LENGTH_LONG).show();
                return false;
            }
        });
        Exp_list.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                int fs = i1;
                int ps = i;
                Toast.makeText(getApplicationContext(), "vlaue is " + fs, Toast.LENGTH_LONG).show();
                /*if (i1==0&&i==0) {
                    Intent intent = new Intent(MainActivity.this, L101.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                if (i1==0&&i==1) {
                    Intent intent = new Intent(MainActivity.this, L102.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                if (i1==0&&i==2) {
                    Intent intent = new Intent(MainActivity.this, L103.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                if (i1==0&&i==3) {
                    Intent intent = new Intent(MainActivity.this, L104.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                if (i1==0&&i==4) {
                    Intent intent = new Intent(MainActivity.this, L105.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }*/

                //Toast.makeText(getBaseContext(),Movies_category.get(Movies_list.get(i)).get(i1)+"",Toast.LENGTH_LONG).show();

                return false;
            }
        });


    }
}
