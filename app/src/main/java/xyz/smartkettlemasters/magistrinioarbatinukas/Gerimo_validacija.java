package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Gerimo_validacija extends AppCompatActivity {

    int verte;
    Boolean selected_Comms1 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerimo_validacija);
        ImageView imageView;
        Boolean selected_Comms3 = getIntent().getBooleanExtra("comm3", false);
        if (selected_Comms3){
            Button button = findViewById(R.id.gamintiMygt);
            button.setText("Kaitinama");
            selected_Comms1 = true;
        }
        TextView txtinterfeis2 = findViewById(R.id.introscreen);
        TextView txtinterfeis3 = findViewById(R.id.descriptionView);
        String str = getIntent().getExtras().getString("Tekstas1", "Gėrimas");
        verte = getIntent().getIntExtra("ImageID",0);
        imageView = findViewById(R.id.imageView2);
        txtinterfeis2.setText(str);

        if (verte == 1){
            imageView.setImageResource(R.drawable.baltaarbata);
            txtinterfeis3.setText("Tai, kas šiandien žinoma kaip balta arbata, galėjo būti sukurta per pastaruosius du šimtmečius. Baltoji arbata dažnai parduodama kaip „Silvery Tip Pekoe“ pagal arbatos lapų klasifikavimo sistemą, taip pat paprastais pavadinimais „China White“ ir „Fujian White.\n Ideali temperatūra šios arbatos yra 82°C\n" );
        }
        else if (verte == 2){
            imageView.setImageResource(R.drawable.vaisinearbata);
            txtinterfeis3.setText("Vaisių arbata gaminama supjaustant arba sutarkuojant pasirinktus vaisius smulkiais gabalėliais, o po to juos džiovinant. Arbata gaminama maišant įvairius džiovintus vaisius, o kai kuriuose yra iki dešimties skirtingų ingredientų.\n Ideali temperatūra šios arbatos yra 90°C\n");
        }
        else {
            imageView.setImageResource(R.drawable.neragerimo);
            txtinterfeis3.setText("Pasirinkote gėrimą, ar pradėti kaitinimą?");
        }

    }

    public void onGamintiClick (View view){
        final LoadingActivity2 loadingActivity2 = new LoadingActivity2(Gerimo_validacija.this);
        loadingActivity2.startLoadingDialog();
        Button button = findViewById(R.id.gamintiMygt);
        button.setText("Kaitinama");
        selected_Comms1 = true;
    }

    public void onIseiti3Click (View view){
        Intent i3 = new Intent(this, page_2.class);
        Boolean selected_Comms = true;
        i3.putExtra("verte", verte);
        i3.putExtra("comm", selected_Comms);
        i3.putExtra("comm1", selected_Comms1);
        startActivity(i3);
        finish();
    }
}