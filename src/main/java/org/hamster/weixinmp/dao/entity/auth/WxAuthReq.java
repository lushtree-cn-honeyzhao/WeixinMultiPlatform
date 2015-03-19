/**
 * 
 */
package org.hamster.weixinmp.dao.entity.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamster.weixinmp.dao.entity.base.WxBaseEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 27, 2013
 */
@Entity
@Table(name = "wx_auth_req")
public class WxAuthReq extends WxBaseEntity {
	@Column(name = "signature", length = 100, nullable = false)
	private String signature;
	@Column(name = "timestamp", length = 50, nullable = false)
	private String timestamp;
	@Column(name = "nonce", length = 50, nullable = false)
	private String nonce;
	@Column(name = "echostr", length = 200, nullable = false)
	private String echostr;
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public String getEchostr() {
		return echostr;
	}
	public void setEchostr(String echostr) {
		this.echostr = echostr;
	}
	public WxAuthReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WxAuthReq [signature=" + signature + ", timestamp=" + timestamp
				+ ", nonce=" + nonce + ", echostr=" + echostr + "]";
	}
}
