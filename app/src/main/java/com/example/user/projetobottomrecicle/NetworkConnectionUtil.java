package com.example.user.projetobottomrecicle;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.R.attr.duration;
import static android.provider.Settings.System.getString;

/**
 * Created by User on 16/06/2017.
 */

public class NetworkConnectionUtil {

    public static Context context;



    boolean connectionChecker;

    public NetworkConnectionUtil() {
        final DatabaseReference connectedRef = FirebaseDatabase.getInstance().getReference(".info/connected");
        connectedRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                connectionChecker = snapshot.getValue(Boolean.class);
                if (connectionChecker) {

                    Log.i("teste", "conectado");


                } else {
                    Log.i("teste", "desconectado");
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }

    public boolean isConnectionChecker() {
        Log.d("Remote","Connection Checker: "+ String.valueOf(connectionChecker));
        return connectionChecker;
    }


}





