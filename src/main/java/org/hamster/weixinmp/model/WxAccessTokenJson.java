/**
 * 
 */
package org.hamster.weixinmp.model;


/**
 * @author honey.zhao@aliyun.com
 * @version Aug 4, 2013
 * 
 */
public class WxAccessTokenJson {

	private String access_token;
	private String expires_in;
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public WxAccessTokenJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxAccessTokenJson(String access_token, String expires_in) {
		super();
		this.access_token = access_token;
		this.expires_in = expires_in;
	}

}
