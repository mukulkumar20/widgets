package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
//    private EditText edittext1, edittext2;
//    private Button buttonSum;
    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;
    private Button buttonSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }

//    private void addListenerOnButton() {
//        edittext1 = (EditText) findViewById(R.id.editText1);
//        edittext2 = (EditText) findViewById(R.id.editText2);
//        buttonSum = (Button) findViewById(R.id.button);


//        buttonSum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String value1=edittext1.getText().toString();
//                String value2=edittext2.getText().toString();
//                int a=Integer.parseInt(value1);
//                int b=Integer.parseInt(value2);
//                int sum=a+b;
//                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
//            }
//        });

//    }

    private void addListenerOnButton(){
        toggleButton1 =  (ToggleButton)findViewById(R.id.toggleButton);
        toggleButton2=  (ToggleButton)findViewById(R.id.toggleButton2);
        buttonSubmit= (Button)findViewById(R.id.button);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Toggle Button 1 : ").append(toggleButton1.getText());
                result.append("\n Toggle Button 2 : ").append(toggleButton2.getText());
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}