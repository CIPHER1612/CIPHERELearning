
package com.example.sammy.ciphere_learning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Sem5EE extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_ee);
        findViewById(R.id.Subj1EE).setOnClickListener(this);
        findViewById(R.id.Subj2EE).setOnClickListener(this);
        findViewById(R.id.Subj3EE).setOnClickListener(this);
        findViewById(R.id.Subj4EE).setOnClickListener(this);
        findViewById(R.id.Subj5EE).setOnClickListener(this);
        findViewById(R.id.Subj6EE).setOnClickListener(this);
        findViewById(R.id.Subj7EE).setOnClickListener(this);
        findViewById(R.id.Subj8EE).setOnClickListener(this);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);


    }


    @Override
    public void onClick(View view) {/*
        switch (view.getId()) {
            case R.id.Subj1EE:
                startActivity(new Intent(this, EES5S1.class));
                break;
            case R.id.Subj2EE:
                startActivity(new Intent(this, EES5S2.class));
                break;
            case R.id.Subj3EE:
                startActivity(new Intent(this, EES5S3.class));
                break;
            case R.id.Subj4EE:
                startActivity(new Intent(this, EES5S4.class));
                break;
            case R.id.Subj5EE:
                startActivity(new Intent(this, EES5S5.class));
                break;
            case R.id.Subj6EE:
                startActivity(new Intent(this, EES5S6.class));
                break;
            case R.id.Subj7EE:
                startActivity(new Intent(this, EES5S7.class));
                break;
            case R.id.Subj8EE:
                startActivity(new Intent(this, EES5S8.class));
                break;



        */
    }

}
//}
