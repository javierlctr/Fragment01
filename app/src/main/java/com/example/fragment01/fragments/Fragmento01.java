package com.example.fragment01.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.fragment01.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Fragmento01 extends Fragment {

    private EscuchadorFragmento01 myListener;
    private TextView txtFragmento01;
    private Button btnFragmento01;



    public Fragmento01() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        myListener = (EscuchadorFragmento01) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragmento01, container, false);
        if (vista != null) {
            txtFragmento01 = (TextView) vista.findViewById(R.id.txtFragmento01);
            btnFragmento01 = (Button) vista.findViewById(R.id.btnFragmento01);
            btnFragmento01.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    myListener.notificarCambiosAlFragmento02("Cambiado");
                }
            });
        }
        return vista;
    }

    public void cambiarContenidoCajaTexto(String cadena) {

        txtFragmento01.setText(cadena);
    }
}