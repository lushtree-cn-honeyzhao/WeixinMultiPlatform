/**
 * 
 */
package org.hamster.weixinmp.dao.entity.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseEntity;

import com.google.gson.annotations.SerializedName;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "user_group")
public class WxGroupEntity extends WxBaseEntity {
	@SerializedName("id")
	@Column(name="wx_id", nullable=false)
	private Long wxId;
	@Column(name="name", length=WxConfig.COL_LEN_TITLE, nullable=false)
	private String name;
	@Column(name="count", nullable=false)
	private String count;
	public Long getWxId() {
		return wxId;
	}
	public void setWxId(Long wxId) {
		this.wxId = wxId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public WxGroupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxGroupEntity(Long id, Date createdDate) {
		super(id, createdDate);
		// TODO Auto-generated constructor stub
	}
	public WxGroupEntity(Long wxId, String name, String count) {
		super();
		this.wxId = wxId;
		this.name = name;
		this.count = count;
	}
	@Override
	public String toString() {
		return "WxGroupEntity [wxId=" + wxId + ", name=" + name + ", count="
				+ count + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((wxId == null) ? 0 : wxId.hashCode());
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
		WxGroupEntity other = (WxGroupEntity) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wxId == null) {
			if (other.wxId != null)
				return false;
		} else if (!wxId.equals(other.wxId))
			return false;
		return true;
	}
	
	
}
