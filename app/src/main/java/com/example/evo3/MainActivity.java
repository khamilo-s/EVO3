package com.example.evo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.editnom);
        edit2 = (EditText)findViewById(R.id.editcont);
    }
    public void menu (View v){
        if (("android").equalsIgnoreCase(edit1.getText().toString()) == true) {
            if (("123").equalsIgnoreCase(edit2.getText().toString()) == true) {
                Intent i = new Intent(this,menu_act.class);
                startActivity(i);
            } else {
                Toast.makeText(getBaseContext(), "Usuario o Contraseña Incorrecta", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getBaseContext(),"Usuario o Contraseña Incorrecta",Toast.LENGTH_SHORT).show();
        }
    }
}