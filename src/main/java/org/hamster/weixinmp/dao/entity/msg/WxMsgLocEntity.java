/**
 * 
 */
package org.hamster.weixinmp.dao.entity.msg;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.constant.WxMsgType;
import org.hamster.weixinmp.dao.entity.base.WxBaseMsgEntity;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "msg_loc")
@DiscriminatorValue(WxMsgType.LOCATION)
public class WxMsgLocEntity extends WxBaseMsgEntity {
	@Column(name = "location_x", nullable = false)
	private Double locationX;
	@Column(name = "location_y", nullable = false)
	private Double locationY;
	@Column(name = "scale", nullable = false)
	private Double scale;
	@Column(name = "label", length = WxConfig.COL_LEN_TITLE, nullable = false)
	private String label;
	public Double getLocationX() {
		return locationX;
	}
	public void setLocationX(Double locationX) {
		this.locationX = locationX;
	}
	public Double getLocationY() {
		return locationY;
	}
	public void setLocationY(Double locationY) {
		this.locationY = locationY;
	}
	public Double getScale() {
		return scale;
	}
	public void setScale(Double scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public WxMsgLocEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxMsgLocEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		// TODO Auto-generated constructor stub
	}
	public WxMsgLocEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId, Double locationX,
			Double locationY, Double scale, String label) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		this.locationX = locationX;
		this.locationY = locationY;
		this.scale = scale;
		this.label = label;
	}
	@Override
	public String toString() {
		return "WxMsgLocEntity [locationX=" + locationX + ", locationY="
				+ locationY + ", scale=" + scale + ", label=" + label + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result
				+ ((locationX == null) ? 0 : locationX.hashCode());
		result = prime * result
				+ ((locationY == null) ? 0 : locationY.hashCode());
		result = prime * result + ((scale == null) ? 0 : scale.hashCode());
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
		WxMsgLocEntity other = (WxMsgLocEntity) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (locationX == null) {
			if (other.locationX != null)
				return false;
		} else if (!locationX.equals(other.locationX))
			return false;
		if (locationY == null) {
			if (other.locationY != null)
				return false;
		} else if (!locationY.equals(other.locationY))
			return false;
		if (scale == null) {
			if (other.scale != null)
				return false;
		} else if (!scale.equals(other.scale))
			return false;
		return true;
	}
	
	
}
