/**
 * 
 */
package org.hamster.weixinmp.dao.entity.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseItemMediaEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 29, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "item_video")
public class WxItemVideoEntity extends WxBaseItemMediaEntity {
	@Column(name = "media_id", length = WxConfig.COL_LEN_INDICATOR, nullable = true)
	private String mediaId;
	@Column(name = "title", length = WxConfig.COL_LEN_TITLE, nullable = true)
	private String title;
	@Column(name = "description", length = WxConfig.COL_LEN_CONTENT, nullable = true)
	private String description;
	@ManyToOne
	@JoinColumn(name = "thumb_id", nullable = true)
	WxItemThumbEntity thumb;
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
	public WxItemThumbEntity getThumb() {
		return thumb;
	}
	public void setThumb(WxItemThumbEntity thumb) {
		this.thumb = thumb;
	}
	public WxItemVideoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxItemVideoEntity(String mediaId, String title, String description,
			WxItemThumbEntity thumb) {
		super();
		this.mediaId = mediaId;
		this.title = title;
		this.description = description;
		this.thumb = thumb;
	}
	@Override
	public String toString() {
		return "WxItemVideoEntity [mediaId=" + mediaId + ", title=" + title
				+ ", description=" + description + ", thumb=" + thumb + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((mediaId == null) ? 0 : mediaId.hashCode());
		result = prime * result + ((thumb == null) ? 0 : thumb.hashCode());
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
		WxItemVideoEntity other = (WxItemVideoEntity) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (mediaId == null) {
			if (other.mediaId != null)
				return false;
		} else if (!mediaId.equals(other.mediaId))
			return false;
		if (thumb == null) {
			if (other.thumb != null)
				return false;
		} else if (!thumb.equals(other.thumb))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
