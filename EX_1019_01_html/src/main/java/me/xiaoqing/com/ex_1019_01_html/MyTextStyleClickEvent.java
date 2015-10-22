package me.xiaoqing.com.ex_1019_01_html;

public class MyTextStyleClickEvent {
	public int start;
	public int end;
	public String method;
	public String showStr;
	public MyTextStyleClickEvent(int start, int end, String method,
			String showStr) {
		super();
		this.start = start;
		this.end = end;
		this.method = method;
		this.showStr = showStr;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		method = method;
	}
	public String getShowStr() {
		return showStr;
	}
	public void setShowStr(String showStr) {
		this.showStr = showStr;
	}
	@Override
	public String toString() {
		return "MyTextStyleClickEvent [start=" + start + ", end=" + end
				+ ", method=" + method + ", showStr=" + showStr + "]";
	}
	

}
