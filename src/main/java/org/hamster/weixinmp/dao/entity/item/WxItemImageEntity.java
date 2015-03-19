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
 * @version Dec 29, 2013
 *
 */
@Entity
@Table(name=WxConfig.TABLE_PREFIX + "item_image")
public class WxItemImageEntity extends WxBaseItemMediaEntity {
	@Column(name = "media_id", length = WxConfig.COL_LEN_INDICATOR, nullable = true)
	private String mediaId;
	@Column(name="pic_url", length=WxConfig.COL_LEN_URL, nullable=true)
	private String picUrl;
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public WxItemImageEntity(String mediaId, String picUrl) {
		super();
		this.mediaId = mediaId;
		this.picUrl = picUrl;
	}
	public WxItemImageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WxItemImageEntity [mediaId=" + mediaId + ", picUrl=" + picUrl
				+ "]";
	}
	
	
}