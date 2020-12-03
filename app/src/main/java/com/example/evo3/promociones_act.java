package com.example.evo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import Clases.Promociones;

public class promociones_act extends AppCompatActivity {

    Spinner spin;
    EditText edit1, edit2;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones_act);

        spin = (Spinner)findViewById(R.id.spn);
        ArrayList<String> listaClientes = (ArrayList<String>)getIntent().getSerializableExtra("listaclientes");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaClientes);

        spin.setAdapter(adapt);

        edit1 = (EditText)findViewById(R.id.editpromo);
        edit2 = (EditText)findViewById(R.id.editenvio);

        text1 = (TextView)findViewById(R.id.tv1);
        text2 = (TextView)findViewById(R.id.tv2);

    }

    public void calcular (View v){

        String cliente = spin.getSelectedItem().toString();
        String promo = ((EditText) findViewById(R.id.editpromo)).getText().toString();

        Promociones listapromociones = new Promociones();

        if (cliente.equals("Ramiro")){
            if (promo.equals("Pizzas promo")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getPizzas_promo() + promos;
                int fin = (int)resultado;

                text1.setText("Estimado Ramiro, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else if (promo.equals("Master pizza")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getMaster_pizza() + promos;
                int fin = (int)resultado;

                text1.setText("Estimado Ramiro, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else if (promo.equals("Pizza max")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getPizza_max() + promos;
                int fin = (int)resultado;

                text1.setText("Estimado Ramiro, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else{
                Toast.makeText(this,"Promocion escrita incorrectamente, prueba con Pizza promo - Master pizza o Pizza max",Toast.LENGTH_LONG).show();
            }
        }
        if (cliente.equals("Rosa")){
            if (promo.equals("Pizzas promo")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getPizzas_promo() + promos;
                int fin = (int)resultado;

                text1.setText("Estimada Rosa, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else if (promo.equals("Master pizza")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getMaster_pizza() + promos;
                int fin = (int)resultado;

                text1.setText("Estimada Rosa, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else if (promo.equals("Pizza max")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getPizza_max() + promos;
                int fin = (int)resultado;

                text1.setText("Estimada Rosa, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else{
                Toast.makeText(this,"Promocion escrita incorrectamente, prueba con Pizza promo - Master pizza o Pizza max",Toast.LENGTH_LONG).show();
            }
        }
        if (cliente.equals("Robert")){
            if (promo.equals("Pizzas promo")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getPizzas_promo() + promos;
                int fin = (int)resultado;

                text1.setText("Estimado Robert, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else if (promo.equals("Master pizza")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getMaster_pizza() + promos;
                int fin = (int)resultado;

                text1.setText("Estimado Robert, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else if (promo.equals("Pizza max")){
                int promos = Integer.parseInt(edit2.getText().toString());
                double resultado = listapromociones.getPizza_max() + promos;
                int fin = (int)resultado;

                text1.setText("Estimado Robert, el final segun promocion y envio es:");
                text2.setText("$" + fin);
            }
            else{
                Toast.makeText(this,"Promocion escrita incorrectamente, prueba con Pizza promo - Master pizza o Pizza max",Toast.LENGTH_LONG).show();
            }
        }
    }
}