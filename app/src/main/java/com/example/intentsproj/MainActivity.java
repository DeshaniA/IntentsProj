package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mybutton;
    Toast toast;
    String mystring = "You just clicked the OK button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickbuttonListner();

/*
                T
            }

*/


    }

    public void OnclickbuttonListner() {

        mybutton = (Button) findViewById(R.id.button);
        mybutton.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toast = Toast.makeText(getApplicationContext(), mystring, Toast.LENGTH_SHORT);
                toast.show();
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }


        });

    }
}