/**
 * 
 */
package org.hamster.weixinmp.dao.entity.menu;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseEntity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author honey.zhao@aliyun.com
 * @version Aug 4, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "menu_btn")
public class WxMenuBtnEntity extends WxBaseEntity {
	@Column(name = "key_", length = 128, nullable = false)
	private String key;
	@Column(name = "url", length = 256, nullable = false)
	private String url;
	@Column(name = "name", length = 80, nullable = false)
	private String name;
	@Column(name = "type", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	private String type;
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "parent_button_id")
	@Expose(serialize = false, deserialize = false)
	private WxMenuBtnEntity parentButton;
	@OneToMany(mappedBy = "parentButton")
	@SerializedName("sub_button")
	private List<WxMenuBtnEntity> subButtons;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public WxMenuBtnEntity getParentButton() {
		return parentButton;
	}
	public void setParentButton(WxMenuBtnEntity parentButton) {
		this.parentButton = parentButton;
	}
	public List<WxMenuBtnEntity> getSubButtons() {
		return subButtons;
	}
	public void setSubButtons(List<WxMenuBtnEntity> subButtons) {
		this.subButtons = subButtons;
	}
	public WxMenuBtnEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxMenuBtnEntity(Long id, Date createdDate) {
		super(id, createdDate);
		// TODO Auto-generated constructor stub
	}
	public WxMenuBtnEntity(String key, String url, String name, String type,
			WxMenuBtnEntity parentButton, List<WxMenuBtnEntity> subButtons) {
		super();
		this.key = key;
		this.url = url;
		this.name = name;
		this.type = type;
		this.parentButton = parentButton;
		this.subButtons = subButtons;
	}
	@Override
	public String toString() {
		return "WxMenuBtnEntity [key=" + key + ", url=" + url + ", name="
				+ name + ", type=" + type + ", parentButton=" + parentButton
				+ ", subButtons=" + subButtons + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((parentButton == null) ? 0 : parentButton.hashCode());
		result = prime * result
				+ ((subButtons == null) ? 0 : subButtons.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		WxMenuBtnEntity other = (WxMenuBtnEntity) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parentButton == null) {
			if (other.parentButton != null)
				return false;
		} else if (!parentButton.equals(other.parentButton))
			return false;
		if (subButtons == null) {
			if (other.subButtons != null)
				return false;
		} else if (!subButtons.equals(other.subButtons))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	
}
