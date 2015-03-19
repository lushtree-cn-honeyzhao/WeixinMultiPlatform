/**
 * 
 */
package org.hamster.weixinmp.dao.entity.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hamster.weixinmp.config.WxConfig;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 */
@MappedSuperclass
public abstract class WxBaseRespEntity extends WxBaseEntity {
	@Column(name="func_flag", nullable = false)
	protected Integer funcFlag;
	@Column(name = "to_user_name", length = WxConfig.COL_LEN_USER_NAME, nullable = false)
	protected String toUserName;
	@Column(name = "from_user_name", length = WxConfig.COL_LEN_USER_NAME, nullable = false)
	protected String fromUserName;
	@Column(name = "create_time", nullable = false)
	protected Long createTime;
	@Column(name = "msg_type", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	protected String msgType;
	public WxBaseRespEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxBaseRespEntity(Long id, Date createdDate) {
		super(id, createdDate);
		// TODO Auto-generated constructor stub
	}
	public WxBaseRespEntity(Integer funcFlag, String toUserName,
			String fromUserName, Long createTime, String msgType) {
		super();
		this.funcFlag = funcFlag;
		this.toUserName = toUserName;
		this.fromUserName = fromUserName;
		this.createTime = createTime;
		this.msgType = msgType;
	}
	@Override
	public String toString() {
		return "WxBaseRespEntity [funcFlag=" + funcFlag + ", toUserName="
				+ toUserName + ", fromUserName=" + fromUserName
				+ ", createTime=" + createTime + ", msgType=" + msgType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((fromUserName == null) ? 0 : fromUserName.hashCode());
		result = prime * result
				+ ((funcFlag == null) ? 0 : funcFlag.hashCode());
		result = prime * result + ((msgType == null) ? 0 : msgType.hashCode());
		result = prime * result
				+ ((toUserName == null) ? 0 : toUserName.hashCode());
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
		WxBaseRespEntity other = (WxBaseRespEntity) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (fromUserName == null) {
			if (other.fromUserName != null)
				return false;
		} else if (!fromUserName.equals(other.fromUserName))
			return false;
		if (funcFlag == null) {
			if (other.funcFlag != null)
				return false;
		} else if (!funcFlag.equals(other.funcFlag))
			return false;
		if (msgType == null) {
			if (other.msgType != null)
				return false;
		} else if (!msgType.equals(other.msgType))
			return false;
		if (toUserName == null) {
			if (other.toUserName != null)
				return false;
		} else if (!toUserName.equals(other.toUserName))
			return false;
		return true;
	}
	public Integer getFuncFlag() {
		return funcFlag;
	}
	public void setFuncFlag(Integer funcFlag) {
		this.funcFlag = funcFlag;
	}
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	
}
