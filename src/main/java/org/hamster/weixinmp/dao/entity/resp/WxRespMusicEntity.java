/**
 * 
 */
package org.hamster.weixinmp.dao.entity.resp;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.base.WxBaseRespEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemMusicEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemThumbEntity;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 * 
 */
@Entity
@Table(name = WxConfig.TABLE_PREFIX + "resp_music")
public class WxRespMusicEntity extends WxBaseRespEntity {
	@ManyToOne
	@JoinColumn(name = "music_id", nullable = false)
	private WxItemMusicEntity music;
	@ManyToOne
	@JoinColumn(name = "thumb_id", nullable = false)
	private WxItemThumbEntity thumb;
	public WxItemMusicEntity getMusic() {
		return music;
	}
	public void setMusic(WxItemMusicEntity music) {
		this.music = music;
	}
	public WxItemThumbEntity getThumb() {
		return thumb;
	}
	public void setThumb(WxItemThumbEntity thumb) {
		this.thumb = thumb;
	}
	public WxRespMusicEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WxRespMusicEntity(WxItemMusicEntity music, WxItemThumbEntity thumb) {
		super();
		this.music = music;
		this.thumb = thumb;
	}
	@Override
	public String toString() {
		return "WxRespMusicEntity [music=" + music + ", thumb=" + thumb + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((music == null) ? 0 : music.hashCode());
		result = prime * result + ((thumb == null) ? 0 : thumb.hashCode());
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
		WxRespMusicEntity other = (WxRespMusicEntity) obj;
		if (music == null) {
			if (other.music != null)
				return false;
		} else if (!music.equals(other.music))
			return false;
		if (thumb == null) {
			if (other.thumb != null)
				return false;
		} else if (!thumb.equals(other.thumb))
			return false;
		return true;
	}
	
	
}
