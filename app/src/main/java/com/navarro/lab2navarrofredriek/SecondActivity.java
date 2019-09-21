package com.navarro.lab2navarrofredriek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userInput = findViewById(R.id.editText);
        this.setTitle("Validate");
    }

    public void buttonBack(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void validate(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);

        String CourseFirst = sp.getString("user1",null);
        String CourseSecond = sp.getString("user2",null);
        String CourseThird = sp.getString("user3",null);
        String CourseFourth = sp.getString("user4",null);
        String CourseFifth = sp.getString("user5",null);
        String CourseSixth = sp.getString("user6",null);
        String CourseSeventh = sp.getString("user7",null);
        String CourseEighth = sp.getString("user8",null);

        String courseInput = userInput.getText().toString();

        if(courseInput.equals(CourseFirst) || courseInput.equals(CourseSecond) || courseInput.equals(CourseThird) || courseInput.equals(CourseFourth) || courseInput.equals(CourseFifth) || courseInput.equals(CourseSixth) || courseInput.equals(CourseSeventh) || courseInput.equals(CourseEighth)) {
            Toast.makeText(this, "Course is offered in UST", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Course is NOT offered in UST", Toast.LENGTH_LONG).show();
        }
    }
}
