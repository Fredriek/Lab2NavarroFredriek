package com.navarro.lab2navarrofredriek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUser1, etUser2, etUser3, etUser4, etUser5, etUser6, etUser7,etUser8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser1 = findViewById(R.id.editText1);
        etUser2 = findViewById(R.id.editText2);
        etUser3 = findViewById(R.id.editText3);
        etUser4 = findViewById(R.id.editText4);
        etUser5 = findViewById(R.id.editText5);
        etUser6 = findViewById(R.id.editText6);
        etUser7 = findViewById(R.id.editText7);
        etUser8 = findViewById(R.id.editText8);
    }
    public void saveData(View view) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String user1 = etUser1.getText().toString();
        String user2 = etUser2.getText().toString();
        String user3 = etUser3.getText().toString();
        String user4 = etUser4.getText().toString();
        String user5 = etUser5.getText().toString();
        String user6 = etUser6.getText().toString();
        String user7 = etUser7.getText().toString();
        String user8 = etUser8.getText().toString();
        editor.putString("user1", user1);
        editor.putString("user2", user2);
        editor.putString("user3", user3);
        editor.putString("user4", user4);
        editor.putString("user5", user5);
        editor.putString("user6", user6);
        editor.putString("user7", user7);
        editor.putString("user8", user8);

        editor.commit();
        Toast.makeText(this, "data was saved...", Toast.LENGTH_LONG).show();
    }
    public void buttonNext(View view){
        Intent i = new Intent(getApplicationContext(),

                SecondActivity.class);

        startActivity(i);
    }

}
