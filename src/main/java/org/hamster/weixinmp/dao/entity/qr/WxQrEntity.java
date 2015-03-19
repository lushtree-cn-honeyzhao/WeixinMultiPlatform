/**
 * 
 */
package org.hamster.weixinmp.dao.entity.qr;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseEntity;

import com.google.gson.annotations.SerializedName;

/**
 * @author honey.zhao@aliyun.com
 * @version Jan 4, 2014
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "qr")
public class WxQrEntity extends WxBaseEntity {
	@Column(name = "ticket", length = WxConfig.COL_LEN_TITLE, nullable = true)
	private String ticket;
	@Column(name = "scene", nullable = false)
	private Long scene;
	@Column(name = "expire_seconds", nullable = true)
	@SerializedName("expire_seconds")
	private Long expireSeconds;
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public Long getScene() {
		return scene;
	}
	public void setScene(Long scene) {
		this.scene = scene;
	}
	public Long getExpireSeconds() {
		return expireSeconds;
	}
	public void setExpireSeconds(Long expireSeconds) {
		this.expireSeconds = expireSeconds;
	}
	public WxQrEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxQrEntity(Long id, Date createdDate) {
		super(id, createdDate);
		// TODO Auto-generated constructor stub
	}
	public WxQrEntity(String ticket, Long scene, Long expireSeconds) {
		super();
		this.ticket = ticket;
		this.scene = scene;
		this.expireSeconds = expireSeconds;
	}
	@Override
	public String toString() {
		return "WxQrEntity [ticket=" + ticket + ", scene=" + scene
				+ ", expireSeconds=" + expireSeconds + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((expireSeconds == null) ? 0 : expireSeconds.hashCode());
		result = prime * result + ((scene == null) ? 0 : scene.hashCode());
		result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
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
		WxQrEntity other = (WxQrEntity) obj;
		if (expireSeconds == null) {
			if (other.expireSeconds != null)
				return false;
		} else if (!expireSeconds.equals(other.expireSeconds))
			return false;
		if (scene == null) {
			if (other.scene != null)
				return false;
		} else if (!scene.equals(other.scene))
			return false;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		return true;
	}
	
	
	
}
