/**
 * 
 */
package org.hamster.weixinmp.dao.entity.resp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseRespEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemPicDescEntity;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "resp_pic_desc")
public class WxRespPicDescEntity extends WxBaseRespEntity {

	@ManyToMany
	@JoinTable(name = "wx_resp_pic_desc_item")
	private List<WxItemPicDescEntity> articles;

	public List<WxItemPicDescEntity> getArticles() {
		return articles;
	}

	public void setArticles(List<WxItemPicDescEntity> articles) {
		this.articles = articles;
	}

	public WxRespPicDescEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WxRespPicDescEntity(List<WxItemPicDescEntity> articles) {
		super();
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "WxRespPicDescEntity [articles=" + articles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((articles == null) ? 0 : articles.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WxRespPicDescEntity other = (WxRespPicDescEntity) obj;
		if (articles == null) {
			if (other.articles != null)
				return false;
		} else if (!articles.equals(other.articles))
			return false;
		return true;
	}
	
	
}
