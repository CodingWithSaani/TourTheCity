package com.tutorials180.tourthecity.Pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tutorials180.tourthecity.MainActivity;
import com.tutorials180.tourthecity.R;

public class HospitalPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_page);
    }

    public void moveToMain(View view)
    {
        Intent objectIntent=new Intent(this, MainActivity.class);
        startActivity(objectIntent);

        this.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Back Pressed", Toast.LENGTH_SHORT).show();
    }
}
