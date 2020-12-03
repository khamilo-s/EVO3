package com.example.evo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class menu_act extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);

        video = (VideoView)findViewById(R.id.vd);

        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.video;

        Uri uri = Uri.parse(ruta);

        video.setVideoURI(uri);

        MediaController media = new MediaController(this);
        video.setMediaController(media);
        video.start();
    }

    public void gestion (View v){

        Intent i = new Intent(this, firebase_act.class);
        startActivity(i);

    }

    public void promociones (View v){

        ArrayList<String> clientes = new ArrayList<String>();
        clientes.add("Ramiro");
        clientes.add("Rosa");
        clientes.add("Robert");

        Intent i = new Intent(this, promociones_act.class);
        i.putExtra("listaclientes", clientes);
        startActivity(i);

    }
}