package com.example.calculator;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText Num1;
    private EditText Num2;
    private TextView OutputValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Num1 = findViewById(R.id.FirstNumber);
        Num2 = findViewById(R.id.SecondNumber);

        OutputValue = findViewById(R.id.Output);
    }

    public void add(View view) {
        try {
            int result = Integer.parseInt(Num1.getText().toString()) + Integer.parseInt(Num2.getText().toString());
            OutputValue.setText(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void subtract(View view) {
        try {
            int result = Integer.parseInt(Num1.getText().toString()) - Integer.parseInt(Num2.getText().toString());
            OutputValue.setText(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void multiply(View view) {
        try {
            int result = Integer.parseInt(Num1.getText().toString()) * Integer.parseInt(Num2.getText().toString());
            OutputValue.setText(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void divide(View view) {
        try {
            int result = Integer.parseInt(Num1.getText().toString()) / Integer.parseInt(Num2.getText().toString());
            OutputValue.setText(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}