package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick (View view){
        //TextView txtInterfeis = findViewById(R.id.intro_interfeis);
        EditText edtTxtName = findViewById(R.id.editTxtName);
        Button preButClick = findViewById(R.id.pasirinktigėrimą);
        Intent i=new Intent(MainActivity.this,page_2.class);
        String st_text = edtTxtName.getText().toString();
        i.putExtra("Value", st_text);
        startActivity(i);
        finish();
        //txtInterfeis.setText("Sveiki prisijungę prie aplikacijos " + edtTxtName.getText().toString());
        //setContentView(R.layout.page_2); //jei pasirenka nepasrinkus komu/nikacijos priemones, ismeta prasyma pasirinkti kom

    }
}