package com.example.fragment01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fragment01.fragments.EscuchadorFragmento01;
import com.example.fragment01.fragments.EscuchadorFragmento02;
import com.example.fragment01.fragments.Fragmento01;
import com.example.fragment01.fragments.Fragmento02;

public class MainActivity extends AppCompatActivity implements EscuchadorFragmento01, EscuchadorFragmento02 {

    private Fragmento01 fragmento01;
    private Fragmento02 fragmento02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmento01 = new Fragmento01();
        fragmento02 = new Fragmento02();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedorFragmento01, fragmento01)
                .replace(R.id.contenedorFragmento02, fragmento02)
                .commit();
    }

    @Override
    public void notificarCambiosAlFragmento02(String cadena) {
        fragmento02.cambiarContenidoCajaTexto(cadena);
    }

    @Override
    public void notificarCambiosAlFragmento01(String cadena) {
        fragmento01.cambiarContenidoCajaTexto(cadena);
    }
}
