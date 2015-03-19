/**
 * 
 */
package org.hamster.weixinmp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 29, 2013
 *
 */
@Configuration
public class WxConfig {
	public static final String TABLE_PREFIX = "wx_";
	public static final int COL_LEN_URL  = 1024;
	public static final int COL_LEN_CONTENT  = 4000;
	public static final int COL_LEN_TITLE  = 200;
	public static final int COL_LEN_USER_NAME  = 100;
	public static final int COL_LEN_INDICATOR  = 64;
	
	private @Value("#{wxProperties.wx_token}") String token;
	private @Value("#{wxProperties.wx_appid}") String appid;
	private @Value("#{wxProperties.wx_appsecret}") String appsecret;
	
	private @Value("#{wxProperties.wx_menu_create_url}") String menuCreateUrl;
	private @Value("#{wxProperties.wx_menu_get_url}") String menuGetUrl;
	private @Value("#{wxProperties.wx_menu_delete_url}") String menuDeleteUrl;
	
	private @Value("#{wxProperties.wx_access_token_create_url}") String accessTokenCreateUrl;
	
	private @Value("#{wxProperties.wx_custom_send_url}") String customSendUrl;

	private @Value("#{wxProperties.wx_media_upload_url}") String mediaUploadUrl;
	
	private @Value("#{wxProperties.wx_qrcode_create_url}") String qrcodeCreateUrl;
	
	private @Value("#{wxProperties.wx_user_info_url}") String userInfoUrl;
	private @Value("#{wxProperties.wx_user_get_url}") String userGetUrl;
	
	private @Value("#{wxProperties.wx_groups_create_url}") String groupsCreateUrl;
	private @Value("#{wxProperties.wx_groups_get_url}") String groupsGetUrl;
	private @Value("#{wxProperties.wx_groups_getid_url}") String groupsGetIdUrl;
	private @Value("#{wxProperties.wx_groups_update_url}") String groupsUpdateUrl;
	private @Value("#{wxProperties.wx_groups_members_update_url}") String groupsMembersUpdateUrl;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	public String getMenuCreateUrl() {
		return menuCreateUrl;
	}
	public void setMenuCreateUrl(String menuCreateUrl) {
		this.menuCreateUrl = menuCreateUrl;
	}
	public String getMenuGetUrl() {
		return menuGetUrl;
	}
	public void setMenuGetUrl(String menuGetUrl) {
		this.menuGetUrl = menuGetUrl;
	}
	public String getMenuDeleteUrl() {
		return menuDeleteUrl;
	}
	public void setMenuDeleteUrl(String menuDeleteUrl) {
		this.menuDeleteUrl = menuDeleteUrl;
	}
	public String getAccessTokenCreateUrl() {
		return accessTokenCreateUrl;
	}
	public void setAccessTokenCreateUrl(String accessTokenCreateUrl) {
		this.accessTokenCreateUrl = accessTokenCreateUrl;
	}
	public String getCustomSendUrl() {
		return customSendUrl;
	}
	public void setCustomSendUrl(String customSendUrl) {
		this.customSendUrl = customSendUrl;
	}
	public String getMediaUploadUrl() {
		return mediaUploadUrl;
	}
	public void setMediaUploadUrl(String mediaUploadUrl) {
		this.mediaUploadUrl = mediaUploadUrl;
	}
	public String getQrcodeCreateUrl() {
		return qrcodeCreateUrl;
	}
	public void setQrcodeCreateUrl(String qrcodeCreateUrl) {
		this.qrcodeCreateUrl = qrcodeCreateUrl;
	}
	public String getUserInfoUrl() {
		return userInfoUrl;
	}
	public void setUserInfoUrl(String userInfoUrl) {
		this.userInfoUrl = userInfoUrl;
	}
	public String getUserGetUrl() {
		return userGetUrl;
	}
	public void setUserGetUrl(String userGetUrl) {
		this.userGetUrl = userGetUrl;
	}
	public String getGroupsCreateUrl() {
		return groupsCreateUrl;
	}
	public void setGroupsCreateUrl(String groupsCreateUrl) {
		this.groupsCreateUrl = groupsCreateUrl;
	}
	public String getGroupsGetUrl() {
		return groupsGetUrl;
	}
	public void setGroupsGetUrl(String groupsGetUrl) {
		this.groupsGetUrl = groupsGetUrl;
	}
	public String getGroupsGetIdUrl() {
		return groupsGetIdUrl;
	}
	public void setGroupsGetIdUrl(String groupsGetIdUrl) {
		this.groupsGetIdUrl = groupsGetIdUrl;
	}
	public String getGroupsUpdateUrl() {
		return groupsUpdateUrl;
	}
	public void setGroupsUpdateUrl(String groupsUpdateUrl) {
		this.groupsUpdateUrl = groupsUpdateUrl;
	}
	public String getGroupsMembersUpdateUrl() {
		return groupsMembersUpdateUrl;
	}
	public void setGroupsMembersUpdateUrl(String groupsMembersUpdateUrl) {
		this.groupsMembersUpdateUrl = groupsMembersUpdateUrl;
	}
	public static String getTablePrefix() {
		return TABLE_PREFIX;
	}
	public static int getColLenUrl() {
		return COL_LEN_URL;
	}
	public static int getColLenContent() {
		return COL_LEN_CONTENT;
	}
	public static int getColLenTitle() {
		return COL_LEN_TITLE;
	}
	public static int getColLenUserName() {
		return COL_LEN_USER_NAME;
	}
	public static int getColLenIndicator() {
		return COL_LEN_INDICATOR;
	}
	public WxConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxConfig(String token, String appid, String appsecret,
			String menuCreateUrl, String menuGetUrl, String menuDeleteUrl,
			String accessTokenCreateUrl, String customSendUrl,
			String mediaUploadUrl, String qrcodeCreateUrl, String userInfoUrl,
			String userGetUrl, String groupsCreateUrl, String groupsGetUrl,
			String groupsGetIdUrl, String groupsUpdateUrl,
			String groupsMembersUpdateUrl) {
		super();
		this.token = token;
		this.appid = appid;
		this.appsecret = appsecret;
		this.menuCreateUrl = menuCreateUrl;
		this.menuGetUrl = menuGetUrl;
		this.menuDeleteUrl = menuDeleteUrl;
		this.accessTokenCreateUrl = accessTokenCreateUrl;
		this.customSendUrl = customSendUrl;
		this.mediaUploadUrl = mediaUploadUrl;
		this.qrcodeCreateUrl = qrcodeCreateUrl;
		this.userInfoUrl = userInfoUrl;
		this.userGetUrl = userGetUrl;
		this.groupsCreateUrl = groupsCreateUrl;
		this.groupsGetUrl = groupsGetUrl;
		this.groupsGetIdUrl = groupsGetIdUrl;
		this.groupsUpdateUrl = groupsUpdateUrl;
		this.groupsMembersUpdateUrl = groupsMembersUpdateUrl;
	}
	@Override
	public String toString() {
		return "WxConfig [token=" + token + ", appid=" + appid + ", appsecret="
				+ appsecret + ", menuCreateUrl=" + menuCreateUrl
				+ ", menuGetUrl=" + menuGetUrl + ", menuDeleteUrl="
				+ menuDeleteUrl + ", accessTokenCreateUrl="
				+ accessTokenCreateUrl + ", customSendUrl=" + customSendUrl
				+ ", mediaUploadUrl=" + mediaUploadUrl + ", qrcodeCreateUrl="
				+ qrcodeCreateUrl + ", userInfoUrl=" + userInfoUrl
				+ ", userGetUrl=" + userGetUrl + ", groupsCreateUrl="
				+ groupsCreateUrl + ", groupsGetUrl=" + groupsGetUrl
				+ ", groupsGetIdUrl=" + groupsGetIdUrl + ", groupsUpdateUrl="
				+ groupsUpdateUrl + ", groupsMembersUpdateUrl="
				+ groupsMembersUpdateUrl + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((accessTokenCreateUrl == null) ? 0 : accessTokenCreateUrl
						.hashCode());
		result = prime * result + ((appid == null) ? 0 : appid.hashCode());
		result = prime * result
				+ ((appsecret == null) ? 0 : appsecret.hashCode());
		result = prime * result
				+ ((customSendUrl == null) ? 0 : customSendUrl.hashCode());
		result = prime * result
				+ ((groupsCreateUrl == null) ? 0 : groupsCreateUrl.hashCode());
		result = prime * result
				+ ((groupsGetIdUrl == null) ? 0 : groupsGetIdUrl.hashCode());
		result = prime * result
				+ ((groupsGetUrl == null) ? 0 : groupsGetUrl.hashCode());
		result = prime
				* result
				+ ((groupsMembersUpdateUrl == null) ? 0
						: groupsMembersUpdateUrl.hashCode());
		result = prime * result
				+ ((groupsUpdateUrl == null) ? 0 : groupsUpdateUrl.hashCode());
		result = prime * result
				+ ((mediaUploadUrl == null) ? 0 : mediaUploadUrl.hashCode());
		result = prime * result
				+ ((menuCreateUrl == null) ? 0 : menuCreateUrl.hashCode());
		result = prime * result
				+ ((menuDeleteUrl == null) ? 0 : menuDeleteUrl.hashCode());
		result = prime * result
				+ ((menuGetUrl == null) ? 0 : menuGetUrl.hashCode());
		result = prime * result
				+ ((qrcodeCreateUrl == null) ? 0 : qrcodeCreateUrl.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result
				+ ((userGetUrl == null) ? 0 : userGetUrl.hashCode());
		result = prime * result
				+ ((userInfoUrl == null) ? 0 : userInfoUrl.hashCode());
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
		WxConfig other = (WxConfig) obj;
		if (accessTokenCreateUrl == null) {
			if (other.accessTokenCreateUrl != null)
				return false;
		} else if (!accessTokenCreateUrl.equals(other.accessTokenCreateUrl))
			return false;
		if (appid == null) {
			if (other.appid != null)
				return false;
		} else if (!appid.equals(other.appid))
			return false;
		if (appsecret == null) {
			if (other.appsecret != null)
				return false;
		} else if (!appsecret.equals(other.appsecret))
			return false;
		if (customSendUrl == null) {
			if (other.customSendUrl != null)
				return false;
		} else if (!customSendUrl.equals(other.customSendUrl))
			return false;
		if (groupsCreateUrl == null) {
			if (other.groupsCreateUrl != null)
				return false;
		} else if (!groupsCreateUrl.equals(other.groupsCreateUrl))
			return false;
		if (groupsGetIdUrl == null) {
			if (other.groupsGetIdUrl != null)
				return false;
		} else if (!groupsGetIdUrl.equals(other.groupsGetIdUrl))
			return false;
		if (groupsGetUrl == null) {
			if (other.groupsGetUrl != null)
				return false;
		} else if (!groupsGetUrl.equals(other.groupsGetUrl))
			return false;
		if (groupsMembersUpdateUrl == null) {
			if (other.groupsMembersUpdateUrl != null)
				return false;
		} else if (!groupsMembersUpdateUrl.equals(other.groupsMembersUpdateUrl))
			return false;
		if (groupsUpdateUrl == null) {
			if (other.groupsUpdateUrl != null)
				return false;
		} else if (!groupsUpdateUrl.equals(other.groupsUpdateUrl))
			return false;
		if (mediaUploadUrl == null) {
			if (other.mediaUploadUrl != null)
				return false;
		} else if (!mediaUploadUrl.equals(other.mediaUploadUrl))
			return false;
		if (menuCreateUrl == null) {
			if (other.menuCreateUrl != null)
				return false;
		} else if (!menuCreateUrl.equals(other.menuCreateUrl))
			return false;
		if (menuDeleteUrl == null) {
			if (other.menuDeleteUrl != null)
				return false;
		} else if (!menuDeleteUrl.equals(other.menuDeleteUrl))
			return false;
		if (menuGetUrl == null) {
			if (other.menuGetUrl != null)
				return false;
		} else if (!menuGetUrl.equals(other.menuGetUrl))
			return false;
		if (qrcodeCreateUrl == null) {
			if (other.qrcodeCreateUrl != null)
				return false;
		} else if (!qrcodeCreateUrl.equals(other.qrcodeCreateUrl))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (userGetUrl == null) {
			if (other.userGetUrl != null)
				return false;
		} else if (!userGetUrl.equals(other.userGetUrl))
			return false;
		if (userInfoUrl == null) {
			if (other.userInfoUrl != null)
				return false;
		} else if (!userInfoUrl.equals(other.userInfoUrl))
			return false;
		return true;
	}
	
}
