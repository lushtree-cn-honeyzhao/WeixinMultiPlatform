/**
 * 
 */
package org.hamster.weixinmp.dao.entity.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseItemMediaEntity;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 */
@Entity
@Table(name=WxConfig.TABLE_PREFIX + "item_music")
public class WxItemMusicEntity extends WxBaseItemMediaEntity {
	@Column(name = "media_id", length = WxConfig.COL_LEN_INDICATOR, nullable = true)
	private String mediaId;
	@Column(name="title", length = WxConfig.COL_LEN_TITLE, nullable = true)
	private String title;
	@Column(name="description", length = WxConfig.COL_LEN_CONTENT, nullable = true)
	private String description;
	@Column(name="music_url", length = WxConfig.COL_LEN_URL, nullable = true)
	private String musicUrl;
	@Column(name="hq_music_url", length = WxConfig.COL_LEN_URL, nullable = true)
	private String hqMusicUrl;
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
	public String getMusicUrl() {
		return musicUrl;
	}
	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}
	public String getHqMusicUrl() {
		return hqMusicUrl;
	}
	public void setHqMusicUrl(String hqMusicUrl) {
		this.hqMusicUrl = hqMusicUrl;
	}
	public WxItemMusicEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxItemMusicEntity(String mediaId, String title, String description,
			String musicUrl, String hqMusicUrl) {
		super();
		this.mediaId = mediaId;
		this.title = title;
		this.description = description;
		this.musicUrl = musicUrl;
		this.hqMusicUrl = hqMusicUrl;
	}
	@Override
	public String toString() {
		return "WxItemMusicEntity [mediaId=" + mediaId + ", title=" + title
				+ ", description=" + description + ", musicUrl=" + musicUrl
				+ ", hqMusicUrl=" + hqMusicUrl + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((hqMusicUrl == null) ? 0 : hqMusicUrl.hashCode());
		result = prime * result + ((mediaId == null) ? 0 : mediaId.hashCode());
		result = prime * result
				+ ((musicUrl == null) ? 0 : musicUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WxItemMusicEntity other = (WxItemMusicEntity) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (hqMusicUrl == null) {
			if (other.hqMusicUrl != null)
				return false;
		} else if (!hqMusicUrl.equals(other.hqMusicUrl))
			return false;
		if (mediaId == null) {
			if (other.mediaId != null)
				return false;
		} else if (!mediaId.equals(other.mediaId))
			return false;
		if (musicUrl == null) {
			if (other.musicUrl != null)
				return false;
		} else if (!musicUrl.equals(other.musicUrl))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
