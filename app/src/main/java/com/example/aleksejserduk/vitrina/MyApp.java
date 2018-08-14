package com.example.aleksejserduk.vitrina;

import android.app.Application;

import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class MyApp extends Application {



    @Override
    public void onCreate() {
        super.onCreate();
        YandexMetricaConfig.Builder configBuilder = YandexMetricaConfig.newConfigBuilder("0ab82597-7c1c-4569-a04d-cf76dff6fd4d");
        YandexMetrica.activate(getApplicationContext(), configBuilder.build());

        YandexMetrica.enableActivityAutoTracking(this);

    }
}
