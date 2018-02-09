package com.cyw.a2018020902;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//1. 在res新增xml的資料夾, 建立appwidget_provider.xml
//2. 在layout新增 mywidget.xml, 放入圖示 (只能用linearlayout or relative layout)
//3. 新增一個class MyWidgetProvider 繼承AppWidgetProvider
//4. 在manifest檔中,加入receiver 包含intent filter資訊
//5. 在MyWidghetProvider中實作onUpdate的方法,
//   a. 用remoteview取得mywedget.xml layout,
//   b. 取得 Widgets 管理器
//   c. 透過管理器來對指定的Widgets 實例進行單項更新
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
