/**
 * 
 */
package org.hamster.weixinmp.model.send;

import org.hamster.weixinmp.model.send.item.SendItemVoiceJson;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendVideoJson {
	private String touser;
	private String msgtype;
	private SendItemVoiceJson voice;
	public String getTouser() {
		return touser;
	}
	public void setTouser(String touser) {
		this.touser = touser;
	}
	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public SendItemVoiceJson getVoice() {
		return voice;
	}
	public void setVoice(SendItemVoiceJson voice) {
		this.voice = voice;
	}
	public SendVideoJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SendVideoJson(String touser, String msgtype, SendItemVoiceJson voice) {
		super();
		this.touser = touser;
		this.msgtype = msgtype;
		this.voice = voice;
	}
	
	
}
