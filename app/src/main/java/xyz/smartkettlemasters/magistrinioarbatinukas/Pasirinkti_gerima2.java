package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Pasirinkti_gerima2 extends AppCompatActivity {

    LinearLayout layoutList;
    Button buttonAdd;
    Button buttonAdd1;

    List<String> gerimuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasirinkti_gerima2);

        layoutList = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.button_prideti);

        gerimuList.add("Kava");
        gerimuList.add("Arbata");
        gerimuList.add("Kakava");
        gerimuList.add("Zoleliu");
    }

    public void onButtonPriClick (View view){
        addView();

    }

    public void onButtonJungtisClick (View view){
        final LoadingActivity2 loadingActivity2 = new LoadingActivity2(Pasirinkti_gerima2.this);
        loadingActivity2.startLoadingDialog();
        //Intent i11 = new Intent(this, Gerimo_validacija.class);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingActivity2.dismissDialog();
                redirect();
            }
        }, 5000);

    }

    private void redirect() {
        Intent i11 = new Intent(this, Gerimo_validacija.class);
        i11.putExtra("ImageID", 3);
        this.startActivity(i11);
        finish();
    }

    private void addView() {

        final View gerimoView = getLayoutInflater().inflate(R.layout.row_add_gerima,null,false);

        EditText editText = (EditText)gerimoView.findViewById(R.id.edit_gerimo_pavadinima);
        AppCompatSpinner spinnerTeam = (AppCompatSpinner)gerimoView.findViewById(R.id.spinner_team);
        ImageView imageClose = (ImageView)gerimoView.findViewById(R.id.image_remove);
        buttonAdd1 = findViewById(R.id.button_jungtis);



        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,gerimuList);
        spinnerTeam.setAdapter(arrayAdapter);


        imageClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeView(gerimoView);
            }
        });

        layoutList.addView(gerimoView);

    }

    private void removeView(View view){

        layoutList.removeView(view);

    }

    public void onIseiti4Click (View view){
        Intent i3 = new Intent(this, page_2.class);
        Boolean selected_Comms = true;
        i3.putExtra("comm", selected_Comms);
        startActivity(i3);
        finish();
    }

}