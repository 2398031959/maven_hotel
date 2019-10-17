package com.lv.util;

import java.util.HashMap;
import java.util.Map;

public class Message{
	private int code;
	private String msg;
	private Map<String,Object> map=new HashMap<String,Object>();
	public static Message success(){
		Message message = new Message();
		message.setCode(200);
		message.setMsg("success");
		return message;
	}
	public static Message fail(){
		Message message = new Message();
		message.setCode(400);
		message.setMsg("error");
		return message;
	}
	public Message add(String key,Object value){
		this.getMap().put(key,value);
		return this;
	}
	@Override
	public String toString() {
		return "Message [code=" + code + ", msg=" + msg + ", map=" + map + "]";
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
}
