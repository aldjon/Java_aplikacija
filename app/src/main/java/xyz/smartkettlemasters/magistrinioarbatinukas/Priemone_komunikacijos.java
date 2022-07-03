package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

public class Priemone_komunikacijos extends AppCompatActivity {

    String stkom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.komunikacijos_priemone);
    }
    public void  BluetoothSelect (View view){

        Intent i2=new Intent(Priemone_komunikacijos.this,Tolesne_komunikacijos_priemone.class);
        stkom="Bluetooth";
        i2.putExtra("Bluetooth1", stkom);
        startActivity(i2);
        finish();
    }

    public void  WifiSelect (View view){

        Intent i2=new Intent(Priemone_komunikacijos.this,Tolesne_komunikacijos_priemone.class);
        stkom="Wi-FI";
        i2.putExtra("Bluetooth1", stkom);
        startActivity(i2);
        finish();
    }
    public void  LoraSelect (View view){

        Intent i2=new Intent(Priemone_komunikacijos.this,Tolesne_komunikacijos_priemone.class);
        stkom="Lo-Ra";
        i2.putExtra("Bluetooth1", stkom);
        startActivity(i2);
        finish();
    }
    public void  IseitiSelect (View view){
        Intent i8=new Intent(Priemone_komunikacijos.this,page_2.class);
        Boolean selected_Comms = false;
        i8.putExtra("comm", selected_Comms);
        startActivity(i8);
        finish();
    }






}