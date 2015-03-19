/**
 * 
 */
package org.hamster.weixinmp.model.send;

import org.hamster.weixinmp.model.send.item.SendItemMusicJson;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendMusicJson {
	private String touser;
	private String msgtype;
	private SendItemMusicJson music;
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
	public SendItemMusicJson getMusic() {
		return music;
	}
	public void setMusic(SendItemMusicJson music) {
		this.music = music;
	}
	public SendMusicJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SendMusicJson(String touser, String msgtype, SendItemMusicJson music) {
		super();
		this.touser = touser;
		this.msgtype = msgtype;
		this.music = music;
	}
	
	

}
