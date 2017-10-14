package com.example.android.personasmaterialdiplomado;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class EditarPersona extends AppCompatActivity {
    private Persona p;
    private EditText ced, nomb, apell;
    private String cedula, nombre, apellido;
    private Spinner sex;
    private String[] opc;
    private Resources res;
    private Bundle bundle;
    private Intent i;
    private int sexo;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_persona);



        ced =(EditText) findViewById(R.id.etxtCedula);
        nomb = (EditText)findViewById(R.id.etxtNombre);
        apell = (EditText)findViewById(R.id.etxtApellido);
        sex = (Spinner)findViewById(R.id.ecmbSexo);

        res = this.getResources();
        i = getIntent();
        bundle = i.getBundleExtra("datos");

        cedula = bundle.getString("cedula");
        nombre = bundle.getString("nombre");
        apellido = bundle.getString("apellido");
        //sexo = bundle.getInt("sexo");
        opc = res.getStringArray(R.array.sexo);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opc);
        sex.setAdapter(adapter);

        ced.setText(cedula);
        nomb.setText(nombre);
        apell.setText(apellido);
        sex.setSelection(sexo);

    }

    /*public void modificar (View v){
        //int pos = Metodos.posicion(Datos.obtenerPersonas(), p);
        int pos = Metodos.posicion(Datos.obtenerPersonas(),p);
        Persona Edit = new Persona(p.getFoto(), ced.getText().toString(),
                nomb.getText().toString(), apell.getText().toString(), sex.getSelectedItemPosition());


    }*/
}
