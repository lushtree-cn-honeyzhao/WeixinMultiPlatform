/**
 * 
 */
package org.hamster.weixinmp.dao.entity.resp;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseRespEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemVideoEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 29, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "resp_video")
public class WxRespVideoEntity extends WxBaseRespEntity {

	@ManyToOne
	@JoinColumn(name = "video_id")
	WxItemVideoEntity video;

	public WxItemVideoEntity getVideo() {
		return video;
	}

	public void setVideo(WxItemVideoEntity video) {
		this.video = video;
	}

	public WxRespVideoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WxRespVideoEntity [video=" + video + "]";
	}

	public WxRespVideoEntity(WxItemVideoEntity video) {
		super();
		this.video = video;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((video == null) ? 0 : video.hashCode());
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
		WxRespVideoEntity other = (WxRespVideoEntity) obj;
		if (video == null) {
			if (other.video != null)
				return false;
		} else if (!video.equals(other.video))
			return false;
		return true;
	}
	
	
}
