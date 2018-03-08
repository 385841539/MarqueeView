package com.marquee.dingrui.marqueeviewlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.List;
import java.util.Random;

/**
 * Created by ruedy on 2018/3/8.
 */

public class MarqueeView extends View implements Runnable {
    private static final String TAG = "MarqueeView";
    Random random = new Random();//随机数,用于取得x,y坐标,颜色值，以及移动速度
    private Paint paint;//画笔
    private int width;
    private int height;
    private Context context;
    private String string="快捷支付付款账号，需要先绑定为消费卡方可进行消费，点击本文本可查看已绑定的消费卡。   " +
            "           快捷支付时间为每天00:00至21:30，且快捷付款金额要大于3.6元，请知晓。          " +
            "    所有快捷支付的付款、绑卡操作都是直接跳转中国银联进行操作，A九用户可放心使用";
    private float speed=1;
    private int textColor;
    private int textdistance;
//    private boolean isResversable;
    private boolean isContinuable;
    private boolean isClickStop;
    private float xLocation=0;


    public MarqueeView(Context context) {
        this(context, null);
    }

    public MarqueeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MarqueeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initpaint();
        new Thread(this).start();//开启死循环线程让文字动起来

    }

    /**
     * 刻字机修改
     */
    private void initpaint() {

        paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);//初始化文本画笔
        paint.setColor(Color.RED);//文字颜色值,可以不设定
        paint.setTextSize(dp2px(11));//文字大小

    }

    public int dp2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //把文字画出来
        if (string != null) {
            Log.e(TAG, "onDraw: " );
            canvas.drawText(string,xLocation, getMeasuredHeight() / 2 + height / 2, paint);

        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                if (string != null) {
                    xLocation=xLocation-speed;
                }
                postInvalidate();//每隔500毫秒重绘视图
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * 继续滚动
     */
    private void continueRoll() {

    }

    /**
     * 停止滚动
     */
    private void stopRoll() {
    }

    /**
     * 点击是否暂停，默认是不
     *
     * @param isClickStop
     */
    private void setClickStop(boolean isClickStop) {
        this.isClickStop = isClickStop;
    }


    /**
     * 是否循环滚动
     *
     * @param isContinuable
     */
    private void setContinueble(boolean isContinuable) {
        this.isContinuable = isContinuable;
    }

//    /**
//     * 是否反向
//     *
//     * @param isResversable
//     */
//    private void setReversalble(boolean isResversable) {
//        this.isResversable = isResversable;
//    }


    /**
     * 设置文字间距
     *
     * @param textdistance
     */
    private void setTextDistance(int textdistance) {

        this.textdistance = textdistance;
    }

    /**
     * 设置文字颜色
     *
     * @param textColor
     */
    private void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    /**
     * 设置滚动速度
     *
     * @param speed
     */
    private void setTextSpeed(float speed) {

        this.speed = speed;

    }


    /**
     * |设置滚动的条目内容 ， 集合形式的
     *
     * @param strings
     */
    public void setContent(List<String> strings) {

    }

    /**
     * |设置滚动的条目内容  字符串形式的
     *
     * @param string
     */
    public void setContent(String string) {
        this.string = string;
    }
}
