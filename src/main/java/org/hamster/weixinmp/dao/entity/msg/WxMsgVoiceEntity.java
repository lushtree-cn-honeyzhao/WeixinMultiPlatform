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
import org.hamster.weixinmp.dao.entity.item.WxItemVoiceEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 24, 2013
 *
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "msg_voice")
@DiscriminatorValue(WxMsgType.VOICE)
public class WxMsgVoiceEntity extends WxBaseMsgEntity {
	@ManyToOne
	@JoinColumn(name="voice_id")
	WxItemVoiceEntity voice;

	public WxItemVoiceEntity getVoice() {
		return voice;
	}

	public void setVoice(WxItemVoiceEntity voice) {
		this.voice = voice;
	}

	public WxMsgVoiceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxMsgVoiceEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		// TODO Auto-generated constructor stub
	}

	public WxMsgVoiceEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId, WxItemVoiceEntity voice) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		this.voice = voice;
	}

	@Override
	public String toString() {
		return "WxMsgVoiceEntity [voice=" + voice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((voice == null) ? 0 : voice.hashCode());
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
		WxMsgVoiceEntity other = (WxMsgVoiceEntity) obj;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}
	
	
}
