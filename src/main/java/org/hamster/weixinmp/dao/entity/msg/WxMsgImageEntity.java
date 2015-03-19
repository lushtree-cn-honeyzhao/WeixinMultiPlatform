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
import org.hamster.weixinmp.dao.entity.item.WxItemImageEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "msg_image")
@DiscriminatorValue(WxMsgType.IMAGE)
public class WxMsgImageEntity extends WxBaseMsgEntity {

	@ManyToOne
	@JoinColumn(name = "image_id")
	private WxItemImageEntity image;

	public WxItemImageEntity getImage() {
		return image;
	}

	public void setImage(WxItemImageEntity image) {
		this.image = image;
	}

	public WxMsgImageEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxMsgImageEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		// TODO Auto-generated constructor stub
	}

	public WxMsgImageEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId, WxItemImageEntity image) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		this.image = image;
	}

	@Override
	public String toString() {
		return "WxMsgImageEntity [image=" + image + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((image == null) ? 0 : image.hashCode());
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
		WxMsgImageEntity other = (WxMsgImageEntity) obj;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		return true;
	}
	
	
}
