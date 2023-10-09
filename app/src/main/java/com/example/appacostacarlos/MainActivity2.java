package com.example.appacostacarlos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.appacostacarlos.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Double ingreso = Double.parseDouble((binding.inputMinutos.getText().toString()));
        Double resultado = calcularMinutos( ingreso);
        binding.rptaMinutos.setText("Minutos total: "+ resultado);
    }

    private Double calcularMinutos(Double horasTotal)  {
        Double totalMinutos = horasTotal / 60;
        return totalMinutos;}
}