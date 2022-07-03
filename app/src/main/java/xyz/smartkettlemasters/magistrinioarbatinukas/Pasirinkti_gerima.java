package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pasirinkti_gerima extends AppCompatActivity {

    Button butTXT;
    String tekstas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.pasirinkti_gerima);
    }

    public void onItrauktiSavoClick (View view){
        Intent i9 = new Intent(this, Pasirinkti_gerima2.class);
        this.startActivity(i9);
        finish();
    }

    public void onIseiti2Click (View view){
        Intent i3 = new Intent(this, page_2.class);
        Boolean selected_Comms = true;
        i3.putExtra("comm", selected_Comms);
        this.startActivity(i3);
        finish();
    }

    public void onBaltaArbataClick (View view){
        butTXT = findViewById(R.id.button11);
        tekstas = butTXT.getText().toString();
        Intent i11 = new Intent(this, Gerimo_validacija.class);
        i11.putExtra("Tekstas1", tekstas);
        i11.putExtra("ImageID", 1);
        this.startActivity(i11);
        finish();
    }

    public void onVaisineArClick (View view){
        butTXT = findViewById(R.id.button9);
        tekstas = butTXT.getText().toString();
        Intent i11 = new Intent(this, Gerimo_validacija.class);
        i11.putExtra("Tekstas1", tekstas);
        i11.putExtra("ImageID", 2);
        this.startActivity(i11);
        finish();
    }

    public void onJuodaKavClick (View view){
        butTXT = findViewById(R.id.button8);
        tekstas = butTXT.getText().toString();
        Intent i11 = new Intent(this, Gerimo_validacija.class);
        i11.putExtra("ImageID", 3);
        i11.putExtra("Tekstas1", tekstas);
        this.startActivity(i11);
        finish();
    }

    public void onUlongoArClick (View view){
        Intent i11 = new Intent(this, Gerimo_validacija.class);
        i11.putExtra("ImageID", 4);
        this.startActivity(i11);
        finish();
    }

}

