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
 *
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "msg_text")
@DiscriminatorValue(WxMsgType.TEXT)
public class WxMsgTextEntity extends WxBaseMsgEntity {
	@Column(name = "content", length = WxConfig.COL_LEN_CONTENT, nullable = false)
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public WxMsgTextEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxMsgTextEntity(String content) {
		super();
		this.content = content;
	}

	@Override
	public String toString() {
		return "WxMsgTextEntity [content=" + content + "]";
	}
	
	
}
