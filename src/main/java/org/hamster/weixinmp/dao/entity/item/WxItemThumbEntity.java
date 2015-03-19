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
@Table(name=WxConfig.TABLE_PREFIX + "item_thumb")
public class WxItemThumbEntity extends WxBaseItemMediaEntity {
	@Column(name = "media_id", length = WxConfig.COL_LEN_INDICATOR, nullable = true)
	private String mediaId;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public WxItemThumbEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxItemThumbEntity(String mediaId) {
		super();
		this.mediaId = mediaId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mediaId == null) ? 0 : mediaId.hashCode());
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
		WxItemThumbEntity other = (WxItemThumbEntity) obj;
		if (mediaId == null) {
			if (other.mediaId != null)
				return false;
		} else if (!mediaId.equals(other.mediaId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WxItemThumbEntity [mediaId=" + mediaId + "]";
	}
	
	
}
