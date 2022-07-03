package xyz.smartkettlemasters.magistrinioarbatinukas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

class LoadingActivity2 {

    private Activity activity;
    private AlertDialog dialog;

    LoadingActivity2(Activity myActivity){
        activity = myActivity;
    }

    void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate (R.layout.activity_loading2, null));
        builder.setCancelable(true);
        dialog = builder.create();
        dialog.show();
    }

    void dismissDialog(){
        dialog.dismiss();
    }
}


//Possible ikisti mygtuka kuris cancellins action ane?