/**
 * 
 */
package org.hamster.weixinmp.model.qr;


/**
 * @author honey.zhao@aliyun.com
 * @version Jan 4, 2014
 * 
 */
public class WxQrActionInfoJson {
	private WxQrSceneJson scene;

	public WxQrSceneJson getScene() {
		return scene;
	}

	public void setScene(WxQrSceneJson scene) {
		this.scene = scene;
	}

	public WxQrActionInfoJson(WxQrSceneJson scene) {
		super();
		this.scene = scene;
	}

	public WxQrActionInfoJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
