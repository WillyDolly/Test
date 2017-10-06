package com.popland.pop.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edtMass, edtEnergy;
    Button btnCalculate;
float mass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMass = (EditText)findViewById(R.id.edtMass);
        edtEnergy = (EditText)findViewById(R.id.edtEnergy);
        btnCalculate = (Button)findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mass = Float.parseFloat(edtMass.getText().toString());
                EnergyCalculation ec = new EnergyCalculation();
                edtEnergy.setText(String.valueOf(ec.calculation(mass)));
            }
        });
    }


}
