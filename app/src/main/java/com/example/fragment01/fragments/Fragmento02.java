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
public class Fragmento02 extends Fragment {

    private EscuchadorFragmento02 myListener;
    private TextView txtFragmento02;
    private Button btnFragmento02;

    public Fragmento02() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context){

        super.onAttach(context);

        myListener = (EscuchadorFragmento02) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragmento02, container, false);
        if(vista!=null) {
            txtFragmento02 = (TextView) vista.findViewById(R.id.txtFragmento02);
            btnFragmento02 = (Button) vista.findViewById(R.id.btnFragmento02);
            btnFragmento02.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    myListener.notificarCambiosAlFragmento01("Cambiado");
                }
            });
        }
        return vista;
    }
    public void cambiarContenidoCajaTexto(String cadena) {

        txtFragmento02.setText(cadena);
    }
}