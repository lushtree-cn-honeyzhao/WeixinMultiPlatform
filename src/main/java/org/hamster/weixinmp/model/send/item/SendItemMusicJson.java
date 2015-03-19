/**
 * 
 */
package org.hamster.weixinmp.model.send.item;


/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class SendItemMusicJson {
	private String title;
	private String description;
	private String musicurl;
	private String hqmusicurl;
	private String thumb_media_id;
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
	public String getMusicurl() {
		return musicurl;
	}
	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}
	public String getHqmusicurl() {
		return hqmusicurl;
	}
	public void setHqmusicurl(String hqmusicurl) {
		this.hqmusicurl = hqmusicurl;
	}
	public String getThumb_media_id() {
		return thumb_media_id;
	}
	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}
	public SendItemMusicJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SendItemMusicJson(String title, String description, String musicurl,
			String hqmusicurl, String thumb_media_id) {
		super();
		this.title = title;
		this.description = description;
		this.musicurl = musicurl;
		this.hqmusicurl = hqmusicurl;
		this.thumb_media_id = thumb_media_id;
	}
	
	
}
