package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class bai2 extends AppCompatActivity {
    private EditText txtNumber;
    private Spinner spnUnits;
    private TextView[] lblResults;

    private String[] units = {"Hải Lý","Dặm","Kilometer","Lý","Met","Yard","Foot","Inches"};
    private double[][] ratio = {
            {1.00000, 1.15077, 1.85200, 20.2537, 1852.00, 2025.37, 6076.16, 72913.4},
            {0.86897, 1.00000, 1.60934, 17.6000, 1609.34, 1760.00, 5280.00, 63360.0},
            {0.53996, 0.62137, 1.00000, 10.9361, 1000.00, 1093.61, 3280.84, 39370.1},
            {0.40937, 0.05682, 0.09144, 1.00000, 91.4400, 100.000, 300.000, 3600.00},
            {0.00054, 0.00062, 0.00100, 0.01094, 1.00000, 1.09361, 3.28084, 39.3701},
            {0.00049, 0.00057, 0.00091, 0.01000, 0.91440, 1.00000, 3.00000, 36.0000},
            {0.00016, 0.00019, 0.00030, 0.00333, 0.30480, 0.33333, 1.00000, 12.0000},
            {0.00001, 0,00002, 0.00003, 0.00003, 0.02540, 0.02778, 0.08333, 1.00000}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        innitView();
    }
    private void changeMoneyUnit()
    {
        int rowIdx = spnUnits.getSelectedItemPosition();
        if(rowIdx <0) rowIdx= 0;
        String input = txtNumber.getText().toString();
        if(input.isEmpty())
            input ="0";
        double number = Double.valueOf(input);
        for(int i = 0 ;i < lblResults.length; i++){
            double temp = number * ratio[rowIdx][i];
            lblResults[i].setText(String.valueOf(temp));
        }
    }
    private void innitView(){
        txtNumber =(EditText) findViewById(R.id.txt_number);
        spnUnits =(Spinner) findViewById(R.id.spnUnit);
        lblResults = new TextView[]{
                (TextView) findViewById(R.id.lblHaiLy),
                (TextView) findViewById(R.id.lblDam),
                (TextView) findViewById(R.id.lblKilometer),
                (TextView) findViewById(R.id.lblLy),
                (TextView) findViewById(R.id.lblMet),
                (TextView) findViewById(R.id.lblYard),
                (TextView) findViewById(R.id.lblFoot),
                (TextView) findViewById(R.id.lblInches)
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                bai2.this, R.layout.support_simple_spinner_dropdown_item, units);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spnUnits.setAdapter(adapter);
        spnUnits.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                changeMoneyUnit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        txtNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                changeMoneyUnit();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}