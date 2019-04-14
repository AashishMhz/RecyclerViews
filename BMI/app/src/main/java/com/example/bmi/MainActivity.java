package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText weitxt, heitxt, bmi;
    Button btn;
    BMICalculator bmiCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        weitxt = findViewById(R.id.weitxt);
        heitxt = findViewById(R.id.heitxt);
        bmi = findViewById(R.id.bmi);
        bmiCalculator = new BMICalculator();
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast toast;
        switch (v.getId()){
            case R.id.btn:
                float value;
                bmiCalculator.setHeight(Float.parseFloat(heitxt.getText().toString()));
                bmiCalculator.setWeight(Float.parseFloat(weitxt.getText().toString()));
                value=bmiCalculator.bmiCalculate();
                bmi.setText(Float.toString(value));
                if (value < 18){
                    toast = Toast.makeText(this, "Under Weight", Toast.LENGTH_LONG);
                    toast.show();
                }else if (value > 18 && value < 24.9){
                    toast= Toast.makeText(this, "Normal Weight", Toast.LENGTH_LONG);
                    toast.show();
                }else if(value > 25 && value < 29.9){
                    toast = Toast.makeText(this, "Over Weight", Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    toast = Toast.makeText(this, "Obesity", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            default:
                break;
        }

    }
}
