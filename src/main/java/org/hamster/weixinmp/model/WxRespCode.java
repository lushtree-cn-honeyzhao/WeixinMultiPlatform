/**
 * 
 */
package org.hamster.weixinmp.model;


/**
 * @author honey.zhao@aliyun.com
 * @version Aug 4, 2013
 *
 */
public class WxRespCode {
	private Integer errcode;
	private String errmsg;
	public Integer getErrcode() {
		return errcode;
	}
	public void setErrcode(Integer errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public WxRespCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxRespCode(Integer errcode, String errmsg) {
		super();
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
	
	

}
