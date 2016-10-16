package com.poc.google.nearby;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.Nearby;

/**
 * Created by jinal on 10/16/2016.
 */

public class NearbyImpl implements NearbyInterface {

    private GoogleApiClient mGoogleApiClient;

    public void connectGoogleApiClient(FragmentActivity callingActivity, GoogleApiClient.ConnectionCallbacks callback,
                                       GoogleApiClient.OnConnectionFailedListener connectionListener){
        mGoogleApiClient = new GoogleApiClient.Builder(callingActivity)
                .addApi(Nearby.MESSAGES_API)
                .addConnectionCallbacks(callback)
                .enableAutoManage(callingActivity, connectionListener)
                .build();
    }


}
