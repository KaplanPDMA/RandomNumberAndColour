package com.kaplan.pdma.randomnumberandcolour;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        Button button = (Button) findViewById(R.id.button);

        final String[] colours = {"#F44336", "#E91E63", "#9C27B0", "#673AB7",
                "#3F51B5", "#2196F3", "#03A9F4", "#00BCD4","#009688", "#4CAF50","#8BC34A",
                "#CDDC39"};

        final Random r = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = r.nextInt(colours.length);
                background.setBackgroundColor(Color.parseColor(colours[i]));
            }
        });
    }
}
