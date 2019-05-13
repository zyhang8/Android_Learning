package com.example.thinkpad.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {
    EditText address;
    EditText content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // 获取页面中收件人地址、短信内容
        address = (EditText)findViewById(R.id.address);
        content = (EditText)findViewById(R.id.content);
        Button bn = (Button)findViewById(R.id.send);
        // 使用外部类的实例作为事件监听器
        bn.setOnLongClickListener(new org.crazyit.event.third(
                 this , address, content));
    //发短信
    Button  button2= (Button) findViewById(R.id.send);
        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String addressStr = address.getText().toString();
            String contentStr = content.getText().toString();
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:"+addressStr));
            intent.putExtra("sms_body",contentStr);
            startActivity(intent);
        }
    });
    }
}
