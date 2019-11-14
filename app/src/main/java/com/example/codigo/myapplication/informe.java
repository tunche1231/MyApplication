package com.example.codigo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class informe extends AppCompatActivity {

    EditText informe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe);

        informe2 = findViewById(R.id.txt_informe);

        String moza1 = getIntent().getStringExtra("moza1");
        String venta1efectivo = getIntent().getStringExtra("venta1efectivo");
        Float venta1efectivo1 = Float.parseFloat(venta1efectivo);
        String venta1izipay = getIntent().getStringExtra("venta1izipay");
        Float venta1izipay1 = Float.parseFloat(venta1izipay);

        String moza2 = getIntent().getStringExtra("moza2");
        String venta2efectivo = getIntent().getStringExtra("venta2efectivo");
        Float venta2efectivo2 = Float.parseFloat(venta2efectivo);
        String venta2izipay = getIntent().getStringExtra("venta2izipay");
        Float venta2izipay2 = Float.parseFloat(venta2izipay);

        String moza3 = getIntent().getStringExtra("moza3");
        String venta3efectivo = getIntent().getStringExtra("venta3efectivo");
        Float venta3efectivo3 = Float.parseFloat(venta3efectivo);
        String venta3izipay = getIntent().getStringExtra("venta3izipay");
        Float venta3izipay3 = Float.parseFloat(venta3izipay);

        String moza4 = getIntent().getStringExtra("moza4");
        String venta4efectivo = getIntent().getStringExtra("venta4efectivo");
        Float venta4efectivo4 = Float.parseFloat(venta4efectivo);
        String venta4izipay = getIntent().getStringExtra("venta4izipay");
        Float venta4izipay4 = Float.parseFloat(venta4izipay);

        String caja1 = getIntent().getStringExtra("caja1");
        Float caja11 = Float.parseFloat(caja1);
        String caja2 = getIntent().getStringExtra("caja2");
        Float caja22 = Float.parseFloat(caja2);

        informe2.setText(
                "Turno Mañana Tarde\n" +
                "Mozas       "+moza1+"    "+moza2+"\n" +
                "Efectivo    "+venta1efectivo1+"    "+venta2efectivo2+"\n" +
                "Izipay        "+venta1izipay1+"    "+venta2izipay2+"\n" +
                "\n" +
                "Turno Tarde Noche\n" +
                "Mozas       "+moza3+" - "+moza4+"\n"+
                "Efectivo    "+venta3efectivo3+"    "+venta4efectivo4+"\n"+
                "Izipay        "+venta3izipay3+"    "+venta4izipay4+
                "\n"+
                "\nVenta Total del Dia\n"+
                "Efectivo    "+(venta1efectivo1+venta2efectivo2)+"\n"+
                "Izipay        "+(venta1izipay1+venta2izipay2)+"\n"+
                "Caja           "+(caja11+caja22));
    }
    
}
