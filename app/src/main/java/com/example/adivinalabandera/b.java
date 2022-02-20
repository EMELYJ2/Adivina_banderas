package com.example.adivinalabandera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class b extends AppCompatActivity {
    Button Panam,Salvador,B,Ecuador,Italia,ElSalvador;
    int puntos,aciertos,fallos;
    int daa,fa,pa;
    TextView mpuntos, mfallos, resa, resf, aciertosb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Panam= (Button) findViewById(R.id.P);
        Salvador= (Button) findViewById(R.id.Sv);
        B= (Button) findViewById(R.id.B);
        Ecuador= (Button) findViewById(R.id.E);
        Italia= (Button) findViewById(R.id.I);
        ElSalvador= (Button) findViewById(R.id.Elsv);
        mpuntos= (TextView) findViewById(R.id.txtaciertosb);
        mfallos=(TextView) findViewById(R.id.txtfallosb);
        resa=(TextView) findViewById(R.id.txtresa);
        resf=(TextView) findViewById(R.id.txtresf);
        aciertosb=(TextView) findViewById(R.id.txtaciertosb3);
        info();

    }


    public void BotonPanam (View view) {


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


fallos=fallos+fa;
        mfallos.setText(String.valueOf(fallos));
        Panam.setEnabled(false);
        Salvador.setEnabled(false);
        B.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }
    public void BotonSalvador (View view) {
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
        fallos=fallos+fa;
        mfallos.setText(String.valueOf(fallos));
        Panam.setEnabled(false);
        Salvador.setEnabled(false);
        B.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }
    public void BotonB (View view) {
        String Vcorrecta="BRASIL";
        if (Vcorrecta.equals("BRASIL")){


            if (pa>=1){
                puntos++;
                puntos=puntos+pa;
                aciertos++;
                aciertos=aciertos+daa;
                mpuntos.setText(String.valueOf(puntos));
            }
            else {
                puntos=puntos+1;
                aciertos=aciertos+1;
                mpuntos.setText(String.valueOf(puntos));
            }


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

        Panam.setEnabled(false);
        Salvador.setEnabled(false);
        B.setEnabled(false);
        Toast.makeText(getApplicationContext(), "¡BANDERA CORRECTA!...+1", Toast.LENGTH_LONG).show();
    }


    public void BotonEcuador (View view) {
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
        Italia.setEnabled(false);
        ElSalvador.setEnabled(false);
        Ecuador.setEnabled(false);
        resa.setVisibility(View.VISIBLE);
        resf.setVisibility(View.VISIBLE);
        aciertosb.setText(String.valueOf(aciertos));
        aciertosb.setVisibility(View.VISIBLE);
         mfallos.setVisibility(View.VISIBLE);

        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }

    public void BotonItalia (View view) {
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
        Italia.setEnabled(false);
        ElSalvador.setEnabled(false);
        Ecuador.setEnabled(false);
        resa.setVisibility(View.VISIBLE);
        resf.setVisibility(View.VISIBLE);
        aciertosb.setText(String.valueOf(aciertos));
        aciertosb.setVisibility(View.VISIBLE);
        mfallos.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(), "¡OHH NO! BANDERA INCORRECTA...-2", Toast.LENGTH_LONG).show();
    }

    public void BotonElsalvador (View view) {
        String Vcorrecta="EL SALVADOR";
        if (Vcorrecta.equals("EL SALVADOR")){

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

        Italia.setEnabled(false);
        ElSalvador.setEnabled(false);
        Ecuador.setEnabled(false);
        resa.setVisibility(View.VISIBLE);
        resf.setVisibility(View.VISIBLE);
        aciertosb.setText(String.valueOf(aciertos));
        aciertosb.setVisibility(View.VISIBLE);
        mfallos.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(), "¡BANDERA CORRECTA!...+1", Toast.LENGTH_LONG).show();
    }
public void info(){
        Bundle extras=getIntent().getExtras();
        int d1=extras.getInt("aciertos");
    int d2=extras.getInt("fallos");
    int d3=extras.getInt("puntos");

    daa=d1;
    fa=d2;
    pa=d3;
    mpuntos.setText(String.valueOf(pa));
    mfallos.setText(String.valueOf(fa));

}
    public void BotonSiguient (View view) {
        Toast.makeText(getApplicationContext(), "¡Sigamos adelante!", Toast.LENGTH_LONG).show();
    }
}