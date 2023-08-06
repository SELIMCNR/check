package com.cinar.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    CheckBox checkBox;
    CheckBox checkBox2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        textView = findViewById(R.id.textView);


        checkBox.setText("Fenerbahçe");
        checkBox2.setText("Türkiye");
        imageView.setImageResource(R.drawable.tr);
    }

    public  void  check1(View view) {
        if (checkBox.isChecked()){
            textView.setText("Fenerbahçe");
            imageView.setImageResource(R.drawable.fb);
            checkBox2.setChecked(false);
            Toast.makeText(MainActivity.this,"İşlem başarılı",Toast.LENGTH_LONG);
        }
    }

    public  void  check2 (View view){
        if (checkBox2.isChecked()){
            textView.setText("Türkiye");
            imageView.setImageResource(R.drawable.tr);
            checkBox.setChecked(false);
            Toast.makeText(MainActivity.this,"İşlem başarılı",Toast.LENGTH_LONG);
        }
    }

}