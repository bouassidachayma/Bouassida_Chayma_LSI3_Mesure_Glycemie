package com.payassistai.bouassida_chayma_lsi3_mesure_glycemie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnConsulter ;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConsulter = findViewById(R.id.btnConsulter);
        msg = findViewById(R.id.msg);
        // btnConsulter.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) { msg.setText("Félicitations !");}
        // });

    }
    public void calculer(View view) {
        // logique à exécuter lors du clic sur le bouton "Consulter"
        // Remplacez par le code que vous souhaitez exécuter.
        // Par exemple, vous pouvez afficher un message d'information.
        Toast.makeText(this, "Le bouton Consulter a été cliqué !", Toast.LENGTH_SHORT).show();

    }
}