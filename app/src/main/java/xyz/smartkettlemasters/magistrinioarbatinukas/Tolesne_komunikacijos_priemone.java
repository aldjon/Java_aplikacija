package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tolesne_komunikacijos_priemone extends AppCompatActivity {
    Boolean selected_Comms = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tolesne_komunikacijos_priemone);
        TextView komunikPriemone = findViewById(R.id.txtKomunik);
        String komunik = getIntent().getStringExtra("Bluetooth1");
        komunikPriemone.setText("Jūs pasirinkote " + komunik + " komunikacijos priemonę, tęsti?");


    }

    public void onJungtisClick (View view){
        final LoadingActivity2 loadingActivity2 = new LoadingActivity2(Tolesne_komunikacijos_priemone.this);
        selected_Comms = true;
        loadingActivity2.startLoadingDialog();
        Button button = findViewById(R.id.junkis);
        button.setText("Prisijungta");
        Button button1 = findViewById(R.id.button20);
        button1.setText("Atsijungti");
    }

    public void onAtsijungtiClick (View view){
        selected_Comms = false;
        Button button = findViewById(R.id.button20);
        button.setText("Atsijungta");
        Button button1 = findViewById(R.id.junkis);
        button1.setText("Jungtis");
    }

    public void onIseitiClick (View view){
        Intent i3 = new Intent(this, page_2.class);
        i3.putExtra("comm", selected_Comms);
        this.startActivity(i3);
        finish();
    }
}