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
@Table(name = WxConfig.TABLE_PREFIX + "user")
public class WxUserEntity extends WxBaseEntity {
	@SerializedName("openid")
	@Column(name = "open_id", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	private String openId;
	@Column(name = "subscribe", nullable = false)
	private Integer subscribe;
	@SerializedName("nickname")
	@Column(name = "nickname", length = WxConfig.COL_LEN_USER_NAME, nullable = false)
	private String nickName;
	@Column(name = "sex", nullable = false)
	private Integer sex;
	@Column(name = "language", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	private String language;
	@Column(name = "city", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	private String city;
	@Column(name = "province", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	private String province;
	@Column(name = "country", length = WxConfig.COL_LEN_INDICATOR, nullable = false)
	private String country;
	@SerializedName("headimgurl")
	@Column(name = "head_img_url", length = WxConfig.COL_LEN_URL, nullable = false)
	private String headImgUrl;
	@SerializedName("subscribe_time")
	@Column(name = "subscribe_time", nullable = false)
	private Long subscribeTime;
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Integer getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(Integer subscribe) {
		this.subscribe = subscribe;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	public Long getSubscribeTime() {
		return subscribeTime;
	}
	public void setSubscribeTime(Long subscribeTime) {
		this.subscribeTime = subscribeTime;
	}
	public WxUserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxUserEntity(Long id, Date createdDate) {
		super(id, createdDate);
		// TODO Auto-generated constructor stub
	}
	public WxUserEntity(String openId, Integer subscribe, String nickName,
			Integer sex, String language, String city, String province,
			String country, String headImgUrl, Long subscribeTime) {
		super();
		this.openId = openId;
		this.subscribe = subscribe;
		this.nickName = nickName;
		this.sex = sex;
		this.language = language;
		this.city = city;
		this.province = province;
		this.country = country;
		this.headImgUrl = headImgUrl;
		this.subscribeTime = subscribeTime;
	}
	@Override
	public String toString() {
		return "WxUserEntity [openId=" + openId + ", subscribe=" + subscribe
				+ ", nickName=" + nickName + ", sex=" + sex + ", language="
				+ language + ", city=" + city + ", province=" + province
				+ ", country=" + country + ", headImgUrl=" + headImgUrl
				+ ", subscribeTime=" + subscribeTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((headImgUrl == null) ? 0 : headImgUrl.hashCode());
		result = prime * result
				+ ((language == null) ? 0 : language.hashCode());
		result = prime * result
				+ ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((openId == null) ? 0 : openId.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result
				+ ((subscribe == null) ? 0 : subscribe.hashCode());
		result = prime * result
				+ ((subscribeTime == null) ? 0 : subscribeTime.hashCode());
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
		WxUserEntity other = (WxUserEntity) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (headImgUrl == null) {
			if (other.headImgUrl != null)
				return false;
		} else if (!headImgUrl.equals(other.headImgUrl))
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (openId == null) {
			if (other.openId != null)
				return false;
		} else if (!openId.equals(other.openId))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (subscribe == null) {
			if (other.subscribe != null)
				return false;
		} else if (!subscribe.equals(other.subscribe))
			return false;
		if (subscribeTime == null) {
			if (other.subscribeTime != null)
				return false;
		} else if (!subscribeTime.equals(other.subscribeTime))
			return false;
		return true;
	}
	
	
	

}
