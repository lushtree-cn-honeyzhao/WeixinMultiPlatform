/**
 * 
 */
package org.hamster.weixinmp.model.send;

import org.hamster.weixinmp.model.send.item.SendItemImageJson;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendImageJson {
	private String touser;
	private String msgtype;
	private SendItemImageJson image;
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
	public SendItemImageJson getImage() {
		return image;
	}
	public void setImage(SendItemImageJson image) {
		this.image = image;
	}
	public SendImageJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SendImageJson(String touser, String msgtype, SendItemImageJson image) {
		super();
		this.touser = touser;
		this.msgtype = msgtype;
		this.image = image;
	}
	
	

}
