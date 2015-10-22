package me.xiaoqing.com.ex_1019_01_html;

import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	SpannableString value;
	private static final Pattern EMOTION_URLMethod = Pattern
			.compile("<F>.+?</F>");
	String message = "[����][����]�㷢���PK�ѽ���<mxgsa action='toPKConditionMyPk'>�鿴PK����</mxgsa>���㱻<#b1f249>�S݅�ա��绨</#b1f249>սʤ�ˣ�[����]ʧȥ<#fafa00>K��100<mxgsa>ǰ���ֵ|toPay</mxgsa>���ÿ���</#fafa00>����KO��<#b1f249>1��</#b1f249>��Ӯ��<#fafa00>K��80</#fafa00>��������ҳ��ȡ���ս��Ʒ��<mxgsa>�����С���|share#�������&http://hao.360.cn/?wd_xp1&��������&http://img3.redocn.com/20110418/20110416_6ad206b20544a083fdb0B6Kj0dud4sro.jpg</mxgsa>,�Ǻ�<mxgsa>����Ϸȥ|toGamesDetail#7</mxgsa> �Ǻ�<mxgsa>����һ�����»����|toActiveDetail#1&5</mxgsa>";
	private TextView textViewNew;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textViewOld = (TextView) findViewById(R.id.textView1);
		textViewOld.setText(message);
		textViewNew = (TextView) findViewById(R.id.textView2);
		   setData();
	}
	  private void setData() {
	        // TODO Auto-generated method stub
	        final String sText = "���ss��Զ���ds�ǩ��<br><h1><mxgsa>�����Զ����ǩ</mxgsa></h1>";
	        textViewNew.setText(Html.fromHtml(message, null, new MxgsaTagHandler(this)));
	        textViewNew.setClickable(true);
	        textViewNew.setMovementMethod(LinkMovementMethod.getInstance());
	    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
