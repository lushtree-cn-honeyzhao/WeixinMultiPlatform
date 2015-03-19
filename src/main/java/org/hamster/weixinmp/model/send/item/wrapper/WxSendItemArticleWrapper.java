/**
 * 
 */
package org.hamster.weixinmp.model.send.item.wrapper;

import java.util.List;

import org.hamster.weixinmp.model.send.item.SendItemArticleJson;

/**
 * @author honey.zhao@aliyun.com
 * @version Dec 30, 2013
 *
 */
public class WxSendItemArticleWrapper {

	private List<SendItemArticleJson> articles;

	public List<SendItemArticleJson> getArticles() {
		return articles;
	}

	public void setArticles(List<SendItemArticleJson> articles) {
		this.articles = articles;
	}

	public WxSendItemArticleWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxSendItemArticleWrapper(List<SendItemArticleJson> articles) {
		super();
		this.articles = articles;
	}
	
	
}
