package com.example.android14;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void phone(View view){
        Uri uri = Uri.parse("tel:10086");
        Intent phoneIntent = new Intent(Intent.ACTION_CALL,uri);
        startActivity(phoneIntent);
    }
    public void map(View view){
        Uri uri = Uri.parse("geo:38.899533,-77.036476");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void google(View view){
        Uri uri = Uri.parse("https://www.google.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}