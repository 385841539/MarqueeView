package com.marquee.dingrui.marqueeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.marquee.dingrui.marqueeviewlib.MarqueeView;

public class MainActivity extends AppCompatActivity {

    private View btCpntrol;
    private MarqueeView mV;
    private View btStop;
    private View textContent;
    private View textContent2;
    private MarqueeView mV2;
    private MarqueeView mV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCpntrol = findViewById(R.id.bt_control);
        textContent = findViewById(R.id.bt_control0);
        textContent2 = findViewById(R.id.bt_control00);
        mV = ((MarqueeView) findViewById(R.id.mv_main1));
        mV2 = ((MarqueeView) findViewById(R.id.mv_main2));
        mV3 = ((MarqueeView) findViewById(R.id.mv_main3));
        textContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mV.setContent("111第一个跑马灯");
                mV2.setContent("222第二个跑马灯");
                mV3.setContent("333第三个跑马灯");
            }
        });
        textContent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mV.setContent("222快捷支付付款账号222");
            }
        });
        btStop = findViewById(R.id.bt_control2);

        btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mV3.stopRoll();
            }
        });

        btCpntrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mV3.continueRoll();
            }
        });
    }
}
