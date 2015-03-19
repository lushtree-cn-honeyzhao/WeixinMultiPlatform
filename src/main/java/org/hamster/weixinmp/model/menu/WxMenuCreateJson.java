/**
 * 
 */
package org.hamster.weixinmp.model.menu;

import java.util.List;

import org.hamster.weixinmp.dao.entity.menu.WxMenuBtnEntity;

/**
 * @author honey.zhao@aliyun.com
 * @version Aug 4, 2013
 *
 */
public class WxMenuCreateJson {

	private List<WxMenuBtnEntity> button;

	public List<WxMenuBtnEntity> getButton() {
		return button;
	}

	public void setButton(List<WxMenuBtnEntity> button) {
		this.button = button;
	}

	public WxMenuCreateJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxMenuCreateJson(List<WxMenuBtnEntity> button) {
		super();
		this.button = button;
	}
	
	

}
