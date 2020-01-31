package com.tutorials180.tourthecity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tutorials180.tourthecity.Pages.HospitalPage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToHospital(View view)
    {
        Intent objectIntent=new Intent(this, HospitalPage.class);
        startActivity(objectIntent);

        this.finish();
    }
}
