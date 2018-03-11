![Image text](https://github.com/385841539/BarrageView/blob/master/app/src/main/res/mipmap-hdpi/xiahoushi.jpg)

# MarqueeView

自定义跑马灯MarqueeView，用TextView 出现了各种坑啊 ， 尤其是在页面中同时存在EditText 的时候，简单的用法，完善的功能，希望您能喜欢！

 效果图  ：
 
 ![Image text]( https://github.com/385841539/MarqueeView/blob/master/%E8%B7%91%E9%A9%AC%E7%81%AF.gif)</br>
 
 ## HowTo Use?/如何使用?-


### 1:直接把BarrageView这个类放到项目里面


### 2:布局文件

```
<com.marquee.dingrui.marqueeviewlib.MarqueeView
        android:id="@+id/mv_main3"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginTop="30dp"
        app:marqueeview_repet_type="repet_continuous"
        app:marqueeview_text_size="15"
        app:marqueeview_text_speed="2" />
```


### 3:自定义(均设有默认值，可不使用)：


| 属性           	 		|    参数类型           	| 说明  					|
| ------------------------- |------------------ | --------------------- |
| iciv_bigimage				| reference 			|大图片|
| iciv_smallimage		| reference       	    | 小图片(标识)|
| iciv_angle				| float      	| 标识的角度，默认为45度|
| iciv_radiusscale			| float  |大小图片比例,默认为0.2|
| iciv_isprogress|boolean flag | 是否有进度条,默认为false,如果要用，必须设置为true|
|iciv_progress_collor|Color Or reference|  进度条颜色|
|  iciv_border_color  |Color Or reference|  边框颜色  |
|  iciv_border_width  |integer | 边框和进度条宽度  |
|iciv_hint_smallimageview | boolean|  是否隐藏小图片|


### 4:添加 滚动文本：

mV3.setContent(content3);

## Tips:
 原理很简单，献丑了，方便大家调用，为了节省大家时间。
