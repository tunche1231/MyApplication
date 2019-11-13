package com.example.codigo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText moza1;
    EditText moza2;
    EditText moza3;
    EditText moza4;

    EditText venta1efectivo;
    EditText venta2efectivo;
    EditText venta3efectivo;
    EditText venta4efectivo;

    EditText venta1izipay;
    EditText venta2izipay;
    EditText venta3izipay;
    EditText venta4izipay;

    EditText caja1;
    EditText caja2;

    Button informe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moza1 = findViewById(R.id.edt_moza1);
        moza2 = findViewById(R.id.edt_moza2);
        moza3 = findViewById(R.id.edt_moza3);
        moza4 = findViewById(R.id.edt_moza4);

        venta1efectivo = findViewById(R.id.edt_venta1efectivo);
        venta2efectivo = findViewById(R.id.edt_venta2efectivo);
        venta3efectivo = findViewById(R.id.edt_venta3efectivo);
        venta4efectivo = findViewById(R.id.edt_venta4efectivo);

        venta1izipay = findViewById(R.id.edt_venta1izipay);
        venta2izipay = findViewById(R.id.edt_venta2izipay);
        venta3izipay = findViewById(R.id.edt_venta3izipay);
        venta4izipay = findViewById(R.id.edt_venta4izipay);

        caja1 = findViewById(R.id.edt_caja1);
        caja2 = findViewById(R.id.edt_caja2);

        informe = findViewById(R.id.btn_informe);

        informe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent informe = new Intent(MainActivity.this,com.example.codigo.myapplication.informe.class);

                informe.putExtra("moza1", moza1.getText().toString());
                informe.putExtra("venta1efectivo",venta1efectivo.getText().toString());
                informe.putExtra("venta1izipay",venta1izipay.getText().toString());

                informe.putExtra("moza2", moza2.getText().toString());
                informe.putExtra("venta2efectivo",venta2efectivo.getText().toString());
                informe.putExtra("venta2izipay",venta2izipay.getText().toString());

                informe.putExtra("moza3", moza3.getText().toString());
                informe.putExtra("venta3efectivo",venta3efectivo.getText().toString());
                informe.putExtra("venta3izipay",venta3izipay.getText().toString());

                informe.putExtra("moza4", moza4.getText().toString());
                informe.putExtra("venta4efectivo",venta4efectivo.getText().toString());
                informe.putExtra("venta4izipay",venta4izipay.getText().toString());

                informe.putExtra("caja1",caja1.getText().toString());
                informe.putExtra("caja2",caja2.getText().toString());

                startActivity(informe);

            }
        });

    }
}
