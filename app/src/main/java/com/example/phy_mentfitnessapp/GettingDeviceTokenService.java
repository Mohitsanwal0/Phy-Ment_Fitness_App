package com.example.phy_mentfitnessapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
public  class GettingDeviceTokenService {

    public void OnNewToken(String s){

        Log.d("NEW_TOKEN", s);


    }
}
