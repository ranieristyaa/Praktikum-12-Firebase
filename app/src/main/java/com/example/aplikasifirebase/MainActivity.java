package com.example.aplikasifirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onClick and get id, use switch case and intent
        findViewById(R.id.add_mhs).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TambahMhsActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.list_mhs).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ListMhsActivity.class);
            startActivity(intent);
        });
    }
}