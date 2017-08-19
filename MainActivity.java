package com.example.nika.scouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;
    Button button1;
    TextView display1;
    CheckBox box1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializes objects
        display1 = (TextView) findViewById(R.id.displayAdd); //finds correct object based on id
        box1 = (CheckBox) findViewById(R.id.checkBox);
        button1 = (Button) findViewById(R.id.addbutton);

        display1.setText("0");
        counter = 0;

        //sets function for button when clicked
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adds and displays counter in textview
                counter++;
                display1.setText(Integer.toString(counter));

                //sets check box to checked if counter is even, blank if counter is odd
                if (counter % 2 == 0)
                    box1.setChecked(true);
                else
                    box1.setChecked(false);
            }
        });

    }
}
