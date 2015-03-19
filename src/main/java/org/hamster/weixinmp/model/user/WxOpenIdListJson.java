/**
 * 
 */
package org.hamster.weixinmp.model.user;

import java.util.List;

/**
 * @author honey.zhao@aliyun.com
 * @version Jan 4, 2014
 *
 */
public class WxOpenIdListJson {
	private List<String> openid;

	public List<String> getOpenid() {
		return openid;
	}

	public void setOpenid(List<String> openid) {
		this.openid = openid;
	}

	public WxOpenIdListJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxOpenIdListJson(List<String> openid) {
		super();
		this.openid = openid;
	}
	
	
}
