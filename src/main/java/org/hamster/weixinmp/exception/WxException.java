/**
 * 
 */
package org.hamster.weixinmp.exception;

import org.hamster.weixinmp.model.WxRespCode;

/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 */
public class WxException extends Exception {

	private static final long serialVersionUID = -5181800588832010641L;
	private WxRespCode error;

	/**
	 * 
	 */
	public WxException() {
	}

	/**
	 * @param message
	 */
	public WxException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public WxException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public WxException(String message, Throwable cause) {
		super(message, cause);
	}

	
	/**
	 * 
	 */
	public WxException(WxRespCode errorJson) {
		super(errorJson.getErrmsg());
		this.error = errorJson;
	}

	public WxRespCode getError() {
		return error;
	}

	public void setError(WxRespCode error) {
		this.error = error;
	}
	
	
}
