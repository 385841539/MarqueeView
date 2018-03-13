![Image text](https://github.com/385841539/BarrageView/blob/master/app/src/main/res/mipmap-hdpi/xiahoushi.jpg)

# MarqueeView

自定义跑马灯MarqueeView，用TextView 出现了各种坑啊 ， 尤其是在页面中同时存在EditText 的时候，简单的用法，完善的功能，希望您能喜欢！

 效果图  ：
 
 ![Image text]( https://github.com/385841539/MarqueeView/blob/master/%E8%B7%91%E9%A9%AC%E7%81%AF.gif)</br>
  gif录制出来有点怪，可以安装看看实际效果
 
 ## HowTo Use?/如何使用?-
### 1: Download
 直接把MarqueeView这个类放到项目里面
 #### OR 
>> 1.先在 build.gradle(Project:XXXX) 的 repositories 添加:</br>
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

>> 2.然后在 build.gradle(Module:app) 的 dependencies 添加:</br>
 
 ```
 dependencies {
	        
	
		 compile 'com.github.385841539:MarqueeView:1.0.0'
   
	}
```

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


### 3:自定义属性(均设有默认值，可不使用)：


| 属性           	 		|    参数类型           	| 说明  					|
| ------------------------- |------------------ | --------------------- |
| marqueeview_repet_type				| enum 			|循环模式|
| marqueeview_text_distance		| integer       	    | 每个item之间的距离|
| marqueeview_text_startlocationdistance				| float      	| 开始的起始位置 按距离控件左边的百分比 0~1之间|
| marqueeview_text_speed			| float  |播放速度 也就是文字滚动速度|
| marqueeview_text_color| color|reference | 文字颜色|
|marqueeview_text_size|float|  文字大小|
|  marqueeview_isclickalbe_stop  |boolean|  是否点击暂停  |
|  marqueeview_is_resetLocation  |boolean | 重新改变内容的时候 ， 是否初始化 位置，默认为true，改变  |

### 4:添加 滚动文本：
```
mV3.setContent(content3);

```
### 5:java动态 设置属性值：

```
                mV3.setTextDistance(50);//设置间距
                mV3.setTextSpeed(5);//设置速度   
                mV3.setTextColor(R.color.colorAccent);//设置颜色
                mV3.setTextSize(17);//设置文字大小
                mV3.stopRoll();//停止滚动
                mV3.continueRoll();//继续滚动
 
           
 
```


## Tips:
 原理很简单，献丑了，方便大家调用，为了节省大家时间。
 [具体实现思路，可以查阅CSDN博客](http://blog.csdn.net/iamdingruihaha/article/details/79512997)
