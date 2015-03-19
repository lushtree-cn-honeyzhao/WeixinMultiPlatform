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
@Table(name = WxConfig.TABLE_PREFIX + "msg_link")
@DiscriminatorValue(WxMsgType.LINK)
public class WxMsgLinkEntity extends WxBaseMsgEntity {
	@Column(name = "title", length = WxConfig.COL_LEN_TITLE, nullable = false)
	private String title;
	@Column(name = "description", length = WxConfig.COL_LEN_CONTENT, nullable = false)
	private String description;
	@Column(name = "url", length = WxConfig.COL_LEN_URL, nullable = false)
	private String url;
	public WxMsgLinkEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxMsgLinkEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		// TODO Auto-generated constructor stub
	}
	public WxMsgLinkEntity(String toUserName, String fromUserName,
			Long createTime, String msgType, Long msgId, String title,
			String description, String url) {
		super(toUserName, fromUserName, createTime, msgType, msgId);
		this.title = title;
		this.description = description;
		this.url = url;
	}
	@Override
	public String toString() {
		return "WxMsgLinkEntity [title=" + title + ", description="
				+ description + ", url=" + url + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
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
		WxMsgLinkEntity other = (WxMsgLinkEntity) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
