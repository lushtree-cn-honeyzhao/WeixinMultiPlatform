/**
 * 
 */
package org.hamster.weixinmp.dao.entity.base;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 * 
 */

@Entity
@Table(name = WxConfig.TABLE_PREFIX + "msg_base")
@DiscriminatorColumn(name = "msg_type", length = 20)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class WxBaseMsgEntity extends WxBaseEntity {

	@Column(name = "to_user_name", length = WxConfig.COL_LEN_USER_NAME, nullable = false)
	protected String toUserName;
	@Column(name = "from_user_name", length = WxConfig.COL_LEN_USER_NAME, nullable = false)
	protected String fromUserName;
	@Column(name = "create_time", nullable = false)
	protected Long createTime;
	@Column(name = "msg_type", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	protected String msgType;
	@Column(name = "msg_id", nullable = true)
	protected Long msgId;
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
	public Long getMsgId() {
		return msgId;
	}
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public WxBaseMsgEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId) {
		super();
		this.toUserName = toUserName;
		this.fromUserName = fromUserName;
		this.createTime = createTime;
		this.msgType = msgType;
		this.msgId = msgId;
	}
	public WxBaseMsgEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WxBaseMsgEntity [toUserName=" + toUserName + ", fromUserName="
				+ fromUserName + ", createTime=" + createTime + ", msgType="
				+ msgType + ", msgId=" + msgId + "]";
	}
	
	
}
