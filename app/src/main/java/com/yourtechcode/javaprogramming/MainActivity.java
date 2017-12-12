package com.yourtechcode.javaprogramming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton tutorialBtn = findViewById(R.id.tutorialBtn);
        ImageButton exampleBtn = findViewById(R.id.exampleBtn);

        tutorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , nav_activity.class));
            }
        });
    }
}
