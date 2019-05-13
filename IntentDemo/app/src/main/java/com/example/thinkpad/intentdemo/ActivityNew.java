package com.example.thinkpad.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityNew extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
		// 获取应用程序中的bn按钮
		Button bn = (Button) findViewById(R.id.bn);
		// 为bn按钮绑定事件监听器
		bn.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View source)
			{
				// 创建需要启动的Activity对应的Intent
				Intent intent = new Intent(ActivityNew.this,
						SecondActivity.class);
				// 启动intent对应的Activity
				startActivity(intent);
			}
		});
	}
}
