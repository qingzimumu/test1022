package me.xiaoqing.com.ex_1019_01_html;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

import android.content.Context;
import android.text.Editable;
import android.text.Html.TagHandler;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MxgsaTagHandler implements TagHandler {
	private int sIndex = 0;
	private int eIndex = 0;
	private final Context mContext;

	public MxgsaTagHandler(Context context) {
		mContext = context;
	}
	@Override
	public void handleTag(boolean opening, String tag, Editable output,
			XMLReader xmlReader) {
		// TODO Auto-generated method stub
		if (tag.toLowerCase().equals("mxgsa")) {
			if (opening) {
				sIndex = output.length();
			} else {
				eIndex = output.length();
				String mxgsa = "";
				try {
					 mxgsa = (String) xmlReader.getProperty("action");
					Log.e("mxgsa", mxgsa + "");
				} catch (SAXNotRecognizedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				output.setSpan(new MxgsaSpan(mxgsa), sIndex, eIndex,
						Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
			}
		}
	
		
	}

	private class MxgsaSpan extends ClickableSpan implements OnClickListener {
		String strMethod;

		public MxgsaSpan() {
			super();
		}

		public MxgsaSpan(String strMethod) {
			super();
			this.strMethod = strMethod;
		}

		@Override
		public void onClick(View widget) {
			// TODO Auto-generated method stub
			// 具体代码，可以是跳转页面，可以是弹出对话框，下面是跳转页面
			Toast.makeText(mContext, strMethod, Toast.LENGTH_SHORT).show();
		}
	}

	private class McgColor extends ClickableSpan implements OnClickListener {
		@Override
		public void onClick(View widget) {
			// TODO Auto-generated method stub
			// 具体代码，可以是跳转页面，可以是弹出对话框，下面是跳转页面
			Toast.makeText(mContext, "!!!!", Toast.LENGTH_SHORT).show();
		}
	}

}
