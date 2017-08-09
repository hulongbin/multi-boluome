package iflyer.core;

import java.util.Map;

/**
 * [Todo...]
 * Created by 胡龙宾<Vivian> on 2017/8/7.
 */
public class AJaxJson {

	private boolean success = true;// 是否成功
	private String msg = "操作成功";// 提示信息
	private Object obj = null;// 其他信息
	private Map<String, Object> attributes;// 其他参数
	private int total;
	private Object summaryRecord;

	public AJaxJson() {
	}

	public AJaxJson(int total, Object obj, boolean success) {
		this.total = total;
		this.obj = obj;
		this.success = success;
	}

	public AJaxJson(int total, Object obj, boolean success, String msg) {
		this.total = total;
		this.obj = obj;
		this.success = success;
		this.msg = msg;
	}

	public AJaxJson(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getSummaryRecord() {
		return summaryRecord;
	}

	public void setSummaryRecord(Object summaryRecord) {
		this.summaryRecord = summaryRecord;
	}

}
