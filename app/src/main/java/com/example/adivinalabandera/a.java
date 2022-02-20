package com.example.adivinalabandera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class a extends AppCompatActivity {
Button Mexico,Japon,China,Venezuela,Colombia,Brasil;
int puntos,aciertos,fallos;
TextView mpuntos, mfallos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
Mexico= (Button) findViewById(R.id.Mexico);
        Japon= (Button) findViewById(R.id.Japon);
        China= (Button) findViewById(R.id.China);
        Venezuela= (Button) findViewById(R.id.Venezuela);
        Colombia= (Button) findViewById(R.id.Colombia);
        Brasil= (Button) findViewById(R.id.Brasil);
        mpuntos= (TextView) findViewById(R.id.txtpuntos);
        mfallos=(TextView) findViewById(R.id.txtfallos);

    }
    public void BotonMexico (View view) {
        String Vcorrecta="MEXICO";
        if (Vcorrecta.equals("MEXICO")){
         puntos++;
         aciertos++;
         mpuntos.setText(String.valueOf(puntos));
        }

        else if (puntos==0) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==1) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==2) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==3) {
            mpuntos.setText("2");
            puntos=0;
        }

        Mexico.setEnabled(false);
        Japon.setEnabled(false);
        China.setEnabled(false);


        Toast.makeText(getApplicationContext(), "¡BANDERA CORRECTA!...+1", Toast.LENGTH_LONG).show();
    }
    public void BotonJapon (View view) {


         if (puntos==0) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==1) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==2) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==3) {
            mpuntos.setText("2");
            puntos=0;
        }
        fallos++;

        mfallos.setText(String.valueOf(fallos));
        Mexico.setEnabled(false);
        Japon.setEnabled(false);
        China.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }
    public void BotonChina (View view) {
       if (puntos==0) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==1) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==2) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==3) {
            mpuntos.setText("2");
            puntos=0;
        }

        fallos++;
        mfallos.setText(String.valueOf(fallos));
        Mexico.setEnabled(false);
        Japon.setEnabled(false);
        China.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }

    public void BotonVenezuela (View view) {



         if (puntos==0) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==1) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==2) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==3) {
            mpuntos.setText("2");
            puntos=0;
        }
        fallos=fallos+1;


        mfallos.setText(String.valueOf(fallos));
        Venezuela.setEnabled(false);
        Colombia.setEnabled(false);
        Brasil.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }

    public void BotonColombia (View view) {
        String Vcorrecta="COLOMBIA";
        if (Vcorrecta.equals("COLOMBIA")){
            puntos=puntos+1;
            aciertos=aciertos+1;
            mpuntos.setText(String.valueOf(puntos));
        }

        else if (puntos==0) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==1) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==2) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==3) {
            mpuntos.setText("2");
            puntos=0;
        }

        Venezuela.setEnabled(false);
        Colombia.setEnabled(false);
        Brasil.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡BANDERA CORRECTA!...+1", Toast.LENGTH_LONG).show();
    }

    public void BotonBrasil (View view) {
       if (puntos==0) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==1) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==2) {
            mpuntos.setText("0");
            puntos=0;
        }

        else if (puntos==3) {
            mpuntos.setText("2");
            puntos=0;
        }
        fallos=fallos+1;
        mfallos.setText(String.valueOf(fallos));
        Venezuela.setEnabled(false);
        Colombia.setEnabled(false);
        Brasil.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }

    public void BotonSiguiente (View view) {
        Toast.makeText(getApplicationContext(), "¡Sigamos adelante!", Toast.LENGTH_LONG).show();
        Intent BotonSiguiente =new Intent(this, b.class);
        BotonSiguiente.putExtra("aciertos",aciertos);
        BotonSiguiente.putExtra("fallos",fallos);
        BotonSiguiente.putExtra("puntos",puntos);
        startActivity(BotonSiguiente);
    }
}