package com.marquee.dingrui.marqueeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.marquee.dingrui.marqueeviewlib.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private View btCpntrol;
    private MarqueeView mV;
    private View btStop;
    private View textContent;
    private MarqueeView mV2;
    private MarqueeView mV3;
    private Button bt_control4;
    private Button bt_control24;
    private Button bt_control23;
private String content2;

private String content3;

private List<String> list1=new ArrayList<String>() {
};
    private Button bt_control00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        initClickListenser();
    }

    private void initData() {
        content2="让我掉下眼泪的，不止昨夜的酒";
        content3="窥天意竭心力，皆为吾主……";
        list1.add("风起日落，天行有常");
        list1.add("欲别去归隐，不复奢望");
        list1.add("只盼明日，能共沐晨光");

    }

    private void initClickListenser() {

        bt_control00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mV3.setTextDistance(50);//设置3的间距

            }
        });

        bt_control23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mV2.setTextSpeed(5);
            }
        });
        bt_control4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mV2.setTextColor(R.color.colorAccent);
            }
        });
        bt_control24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mV2.setTextSize(17);
            }
        });
        textContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mV.setContent(list1);
                mV2.setContent(content2);
                mV3.setContent(content3);
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

    private void initView() {
        btCpntrol = findViewById(R.id.bt_control);
        textContent = findViewById(R.id.bt_control0);
        mV = ((MarqueeView) findViewById(R.id.mv_main1));
        mV2 = ((MarqueeView) findViewById(R.id.mv_main2));
        mV3 = ((MarqueeView) findViewById(R.id.mv_main3));
        bt_control24 = ((Button) findViewById(R.id.bt_control24));
        bt_control4 = ((Button) findViewById(R.id.bt_control4));
        bt_control23 = ((Button) findViewById(R.id.bt_control23));
        bt_control00  = ((Button) findViewById(R.id.bt_control00));
    }
}
