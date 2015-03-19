/**
 * 
 */
package org.hamster.weixinmp.model.menu;


/**
 * @author honey.zhao@aliyun.com
 * @version Jan 4, 2014
 *
 */
public class WxMenuGetJson {
	private WxMenuCreateJson menu;

	public WxMenuCreateJson getMenu() {
		return menu;
	}

	public void setMenu(WxMenuCreateJson menu) {
		this.menu = menu;
	}

	public WxMenuGetJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxMenuGetJson(WxMenuCreateJson menu) {
		super();
		this.menu = menu;
	}

	
}
