package com.example.rafiqul.thirdclass.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DownloadedService extends Service {
    public DownloadedService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("service has started");
        return START_STICKY;
    }
}
