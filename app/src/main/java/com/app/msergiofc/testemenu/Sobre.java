package com.app.msergiofc.testemenu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }
    public void Avaliar(View view) {
        Toast.makeText(this, "xxxxx fragmento 2", Toast.LENGTH_SHORT).show();
    }
}
