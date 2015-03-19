/**
 * 
 */
package org.hamster.weixinmp.dao.entity.auth;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamster.weixinmp.dao.entity.base.WxBaseEntity;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * 
 * @author honey.zhao@aliyun.com
 * @version Aug 3, 2013
 * 
 */
@Entity
@Table(name = "wx_auth")
public class WxAuth extends WxBaseEntity {
	@Column(name = "grant_type", length = 50, nullable = false)
	private String grantType;
	@Column(name = "appid", length = 100, nullable = false)
	private String appid;
	@Column(name = "secret", length = 100, nullable = false)
	private String secret;
	@SerializedName("access_token")
	@Column(name = "access_token", length = 200, nullable = false)
	private String accessToken;
	@SerializedName("expires_in")
	@Column(name = "expires_in", nullable = false)
	private Long expiresIn;
	public String getGrantType() {
		return grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Long getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public WxAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxAuth(Long id, Date createdDate) {
		super(id, createdDate);
		// TODO Auto-generated constructor stub
	}
	public WxAuth(String grantType, String appid, String secret,
			String accessToken, Long expiresIn) {
		super();
		this.grantType = grantType;
		this.appid = appid;
		this.secret = secret;
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
	}
	@Override
	public String toString() {
		return "WxAuth [grantType=" + grantType + ", appid=" + appid
				+ ", secret=" + secret + ", accessToken=" + accessToken
				+ ", expiresIn=" + expiresIn + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((accessToken == null) ? 0 : accessToken.hashCode());
		result = prime * result + ((appid == null) ? 0 : appid.hashCode());
		result = prime * result
				+ ((expiresIn == null) ? 0 : expiresIn.hashCode());
		result = prime * result
				+ ((grantType == null) ? 0 : grantType.hashCode());
		result = prime * result + ((secret == null) ? 0 : secret.hashCode());
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
		WxAuth other = (WxAuth) obj;
		if (accessToken == null) {
			if (other.accessToken != null)
				return false;
		} else if (!accessToken.equals(other.accessToken))
			return false;
		if (appid == null) {
			if (other.appid != null)
				return false;
		} else if (!appid.equals(other.appid))
			return false;
		if (expiresIn == null) {
			if (other.expiresIn != null)
				return false;
		} else if (!expiresIn.equals(other.expiresIn))
			return false;
		if (grantType == null) {
			if (other.grantType != null)
				return false;
		} else if (!grantType.equals(other.grantType))
			return false;
		if (secret == null) {
			if (other.secret != null)
				return false;
		} else if (!secret.equals(other.secret))
			return false;
		return true;
	}
	
	
}
