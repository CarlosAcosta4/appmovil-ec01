package com.example.appacostacarlos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.appacostacarlos.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btncalcular.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {
    Double ingreso = Double.parseDouble((binding.respuesta.getText().toString()));
    Double resultado = calcularSalario( ingreso);
    binding.txtResultado.setText("Su salario semanal es: "+ resultado);
    }

    private Double calcularSalario(Double horasTotal)  {
        Double salario;
        Double horaExtra;
        if(horasTotal <= 40){
            salario = 16 * horasTotal; }
        else {
            horaExtra = 20 * (horasTotal - 40);
            salario = (16*40) + horaExtra;
        }
        return salario;}

}