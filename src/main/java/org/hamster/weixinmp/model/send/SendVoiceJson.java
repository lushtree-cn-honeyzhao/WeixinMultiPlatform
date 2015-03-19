/**
 * 
 */
package org.hamster.weixinmp.model.send;

import org.hamster.weixinmp.model.send.item.SendItemVideoJson;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendVoiceJson {
	private String touser;
	private String msgtype;
	private SendItemVideoJson video;
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
	public SendItemVideoJson getVideo() {
		return video;
	}
	public void setVideo(SendItemVideoJson video) {
		this.video = video;
	}
	public SendVoiceJson(String touser, String msgtype, SendItemVideoJson video) {
		super();
		this.touser = touser;
		this.msgtype = msgtype;
		this.video = video;
	}
	public SendVoiceJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
