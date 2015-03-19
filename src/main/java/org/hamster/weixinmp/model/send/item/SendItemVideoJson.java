/**
 * 
 */
package org.hamster.weixinmp.model.send.item;


/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendItemVideoJson {
	private String mediaId;
	private String title;
	private String description;
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SendItemVideoJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SendItemVideoJson(String mediaId, String title, String description) {
		super();
		this.mediaId = mediaId;
		this.title = title;
		this.description = description;
	}
	
	
}
