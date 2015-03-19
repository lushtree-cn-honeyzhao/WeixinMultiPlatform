/**
 * 
 */
package org.hamster.weixinmp.dao.entity.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 27, 2013
 * 
 */
@MappedSuperclass
public abstract class WxBaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose(serialize = false, deserialize = false)
	@SerializedName("_id")
	protected Long id;
	@Column(name = "created_date")
	@Expose(serialize = false, deserialize = false)
	@SerializedName("_createddate")
	protected Date createdDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public WxBaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxBaseEntity(Long id, Date createdDate) {
		super();
		this.id = id;
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "WxBaseEntity [id=" + id + ", createdDate=" + createdDate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WxBaseEntity other = (WxBaseEntity) obj;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
