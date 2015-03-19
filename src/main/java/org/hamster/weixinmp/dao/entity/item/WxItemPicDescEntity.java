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
@Table(name=WxConfig.TABLE_PREFIX + "wx_item_pic_desc")
public class WxItemPicDescEntity extends WxBaseItemMediaEntity {
	@Column(name="title", length = WxConfig.COL_LEN_TITLE, nullable = false)
	private String title;
	@Column(name="description", length = WxConfig.COL_LEN_CONTENT, nullable = false)
	private String description;
	@Column(name="pic_url", length = WxConfig.COL_LEN_URL, nullable = false)
	private String picUrl;
	@Column(name="url", length = WxConfig.COL_LEN_URL, nullable = false)
	private String url;
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
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public WxItemPicDescEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxItemPicDescEntity(String title, String description, String picUrl,
			String url) {
		super();
		this.title = title;
		this.description = description;
		this.picUrl = picUrl;
		this.url = url;
	}
	@Override
	public String toString() {
		return "WxItemPicDescEntity [title=" + title + ", description="
				+ description + ", picUrl=" + picUrl + ", url=" + url + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((picUrl == null) ? 0 : picUrl.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		WxItemPicDescEntity other = (WxItemPicDescEntity) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (picUrl == null) {
			if (other.picUrl != null)
				return false;
		} else if (!picUrl.equals(other.picUrl))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	
}