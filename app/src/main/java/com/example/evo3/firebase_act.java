package com.example.evo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.FirebaseApp;

import java.util.UUID;

import Models.Clientes;

public class firebase_act extends AppCompatActivity {

    EditText edit1, edit2, edit3;
    Button button;

    FirebaseDatabase firebase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_act);

        edit1  =(EditText)findViewById(R.id.editnomfire);
        edit2  =(EditText)findViewById(R.id.editdesfire);
        edit3  =(EditText)findViewById(R.id.editpromofire);

        button = (Button)findViewById(R.id.btn);

        InicializarBase();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edit1.getText().equals("")){

                    Clientes c = new Clientes();

                    c.setId(UUID.randomUUID().toString());
                    c.setNombre(edit1.getText().toString());
                    c.setDestino(edit2.getText().toString());
                    c.setPromocion(edit3.getText().toString());

                    databaseReference.child("Clientes").child(c.getId()).setValue(c);

                    Toast.makeText(getBaseContext(),"Se ha guardado el cliente", Toast.LENGTH_LONG).show();

                    edit1.setText("");
                    edit2.setText("");
                    edit3.setText("");

                }
                else{
                    Toast.makeText(getBaseContext(),"Debe rellenar los campos", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public void InicializarBase(){
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getReference();
    }

    public void listado(View v){
        Intent i = new Intent(this,listado_clientes_act.class);
        startActivity(i);
    }

}