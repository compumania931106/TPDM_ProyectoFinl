package mx.edu.ittepic.tpdm_proyectofinal;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PantallaPrinCajero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_prin_cajero);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Debe cerrar sesion primero.", Toast.LENGTH_SHORT).show();
    }
}
