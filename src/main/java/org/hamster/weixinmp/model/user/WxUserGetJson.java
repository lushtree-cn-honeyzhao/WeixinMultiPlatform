/**
 * 
 */
package org.hamster.weixinmp.model.user;


/**
 * {"total":2,"count":2,"data":{"openid":["","OPENID1","OPENID2"]},"next_openid":"NEXT_OPENID"}
 * 
 * @author honey.zhao@aliyun.com
 * @version Jan 4, 2014
 *
 */
public class WxUserGetJson {
	private Long total;
	private Long count;
	WxOpenIdListJson data;
	private String next_openid;
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public WxOpenIdListJson getData() {
		return data;
	}
	public void setData(WxOpenIdListJson data) {
		this.data = data;
	}
	public String getNext_openid() {
		return next_openid;
	}
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}
	public WxUserGetJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxUserGetJson(Long total, Long count, WxOpenIdListJson data,
			String next_openid) {
		super();
		this.total = total;
		this.count = count;
		this.data = data;
		this.next_openid = next_openid;
	}
	
	
}
