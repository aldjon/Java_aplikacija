package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class page_2 extends AppCompatActivity {

    boolean selected_Comms;
    boolean selected_Comms2;
    Button butinterfeis;
    Button butinterfeis2;
    Button butinterfeis3;
    Button butinterfeis4;
    int verte = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        TextView txtinterfeis2 = findViewById(R.id.intro_interfeis);
        butinterfeis = findViewById(R.id.atsijungtiNuoKom);
        butinterfeis2 = findViewById(R.id.button3);
        butinterfeis3 = findViewById(R.id.button);
        butinterfeis4 = findViewById(R.id.stabdytiGamyba);

        selected_Comms = getIntent().getBooleanExtra("comm", false);
        selected_Comms2 = getIntent().getBooleanExtra("comm1", false);
        if (selected_Comms != true) {
            String str = getIntent().getExtras().getString("Value", "nieko");
            txtinterfeis2.setText("Sveiki prisijungę prie aplikacijos " + str);
        }
        else if (selected_Comms && selected_Comms2 != true){
            butinterfeis.setVisibility(View.VISIBLE);
            butinterfeis2.setVisibility(View.INVISIBLE);
        }
        else if (selected_Comms && selected_Comms2 ){
            butinterfeis.setVisibility(View.VISIBLE);
            butinterfeis2.setVisibility(View.INVISIBLE);
            butinterfeis3.setVisibility(View.INVISIBLE);
            butinterfeis4.setVisibility(View.VISIBLE);
            verte = getIntent().getIntExtra("verte", 0);
        }
    }

    public void onPasirinktiGerimaClick(View view) {
        if (selected_Comms) {
            // Start ActivityB, user has logged in
                Intent i4 = new Intent(this, Pasirinkti_gerima.class);
                startActivity(i4);

             } else {
            // Redirect to LoginActivity, user hasn't logged in
                Intent i5 = new Intent(this, Priemone_komunikacijos.class);
              startActivity(i5);

             }
        }

    public void onPasirinktiKomClick (View view){
        Intent i5 = new Intent(this, Priemone_komunikacijos.class);

        startActivity(i5);

    }

    public void onStebetiGerimoStatClick (View view){
        if (selected_Comms != true) {
            Button butinterfeis4 = findViewById(R.id.button2);
            butinterfeis4.setText("Pasirinkite komunikacijos priemonę");
        }
        else if (selected_Comms && selected_Comms2 != true){
            Intent i4 = new Intent(this, Pasirinkti_gerima.class);
            startActivity(i4);
        }
        else if (selected_Comms && selected_Comms2 ){
            Boolean selected_comms3 = true;
            Intent i14 = new Intent(this, Gerimo_validacija.class);
            i14.putExtra("ImageID", verte);
            i14.putExtra("comm3", selected_comms3);
            startActivity(i14);
        }

        final LoadingActivity2 loadingActivity2 = new LoadingActivity2(page_2.this);
        loadingActivity2.startLoadingDialog();
    }

    public void onIseitiClick (View view){
        Intent i7 = new Intent(this, MainActivity.class);
        this.startActivity(i7);

    }

    public void onAtsijungtiNuoKomClick (View view){
        butinterfeis.setVisibility(View.INVISIBLE);
        butinterfeis2.setVisibility(View.VISIBLE);
        butinterfeis3.setVisibility(View.VISIBLE);
        butinterfeis4.setVisibility(View.INVISIBLE);
        selected_Comms = false;
        selected_Comms2 = false;
    }

    public void onStabdytiGamClick (View view){
        butinterfeis3.setVisibility(View.VISIBLE);
        butinterfeis4.setVisibility(View.INVISIBLE);
        selected_Comms2 = false;
        verte = 0;
    }

}
