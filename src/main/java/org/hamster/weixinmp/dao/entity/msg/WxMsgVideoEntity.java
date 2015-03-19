/**
 * 
 */
package org.hamster.weixinmp.dao.entity.msg;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.constant.WxMsgType;
import org.hamster.weixinmp.dao.entity.base.WxBaseMsgEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemVideoEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 24, 2013
 *
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "msg_video")
@DiscriminatorValue(WxMsgType.VIDEO)
public class WxMsgVideoEntity extends WxBaseMsgEntity {
	@ManyToOne
	@JoinColumn(name="video_id")
	private WxItemVideoEntity video;

	public WxItemVideoEntity getVideo() {
		return video;
	}

	public void setVideo(WxItemVideoEntity video) {
		this.video = video;
	}

	public WxMsgVideoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxMsgVideoEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		// TODO Auto-generated constructor stub
	}

	public WxMsgVideoEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId, WxItemVideoEntity video) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		this.video = video;
	}

	@Override
	public String toString() {
		return "WxMsgVideoEntity [video=" + video + "]";
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
		WxMsgVideoEntity other = (WxMsgVideoEntity) obj;
		if (video == null) {
			if (other.video != null)
				return false;
		} else if (!video.equals(other.video))
			return false;
		return true;
	}
	
	
}
