/**
 * 
 */
package org.hamster.weixinmp.model.send.item;


/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendItemVoiceJson {
	private String mediaId;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public SendItemVoiceJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SendItemVoiceJson(String mediaId) {
		super();
		this.mediaId = mediaId;
	}
	
	
}
