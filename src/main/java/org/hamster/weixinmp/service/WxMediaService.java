/**
 * 
 */
package org.hamster.weixinmp.service;

import java.util.Date;
import java.util.Map;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.constant.WxMediaTypeEnum;
import org.hamster.weixinmp.dao.entity.base.WxBaseItemMediaEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemImageEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemThumbEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemVideoEntity;
import org.hamster.weixinmp.dao.entity.item.WxItemVoiceEntity;
import org.hamster.weixinmp.exception.WxException;
import org.hamster.weixinmp.util.WxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * @author honey.zhao@aliyun.com
 * @version Jan 4, 2014
 * 
 */
@Service
public class WxMediaService {

	@Autowired
	WxConfig config;

	public WxBaseItemMediaEntity remoteMediaUpload(String accessToken,
			WxMediaTypeEnum type, byte[] content) throws WxException {
		MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
		String typeString = null;
		switch (type) {
		case IMAGE:
		case THUMB:
		case VIDEO:
		case VOICE:
			typeString = type.toString().toLowerCase();
			break;
		case MUSIC:
		case DEFAULT:
		case PIC_DESC:
			throw new WxException("Not supported upload type : "
					+ type.toString());
		default:
			break;
		}

		Map<String, String> params = WxUtil.getAccessTokenParams(accessToken);
		System.out.println(typeString);
		params.put("type", typeString);
		ContentBody contentBody = new ByteArrayBody(content, ContentType.MULTIPART_FORM_DATA, "name.jpg");
		entityBuilder.addPart("media", contentBody);
		MediaResultMapper result = WxUtil.sendRequest(
				config.getMediaUploadUrl(), HttpMethod.POST, params,
				entityBuilder.build(), MediaResultMapper.class);

		WxBaseItemMediaEntity resultEntity = null;
		switch (type) {
		case IMAGE:
			WxItemImageEntity imageEntity = new WxItemImageEntity();
			imageEntity.setMediaId(result.getMedia_id());
			imageEntity.setCreatedDate(new Date(result.getCreated_at() * 1000));
			resultEntity = imageEntity;
			break;
		case THUMB:
			WxItemThumbEntity thumbEntity = new WxItemThumbEntity();
			thumbEntity.setMediaId(result.getMedia_id());
			thumbEntity.setCreatedDate(new Date(result.getCreated_at() * 1000));
			resultEntity = thumbEntity;
			break;
		case VIDEO:
			WxItemVideoEntity videoEntity = new WxItemVideoEntity();
			videoEntity.setMediaId(result.getMedia_id());
			videoEntity.setCreatedDate(new Date(result.getCreated_at() * 1000));
			resultEntity = videoEntity;
			break;
		case VOICE:
			WxItemVoiceEntity voiceEntity = new WxItemVoiceEntity();
			voiceEntity.setMediaId(result.getMedia_id());
			voiceEntity.setCreatedDate(new Date(result.getCreated_at() * 1000));
			resultEntity = voiceEntity;
			break;
		case MUSIC:
		case DEFAULT:
		case PIC_DESC:
			throw new WxException("Not supported upload type : "
					+ type.toString());
		default:
			break;
		}
		return resultEntity;
	}

}

class MediaResultMapper {
	private String type;
	private String media_id;
	private Long created_at;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMedia_id() {
		return media_id;
	}
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
	public Long getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Long created_at) {
		this.created_at = created_at;
	}
	public MediaResultMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MediaResultMapper(String type, String media_id, Long created_at) {
		super();
		this.type = type;
		this.media_id = media_id;
		this.created_at = created_at;
	}
	@Override
	public String toString() {
		return "MediaResultMapper [type=" + type + ", media_id=" + media_id
				+ ", created_at=" + created_at + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((created_at == null) ? 0 : created_at.hashCode());
		result = prime * result
				+ ((media_id == null) ? 0 : media_id.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaResultMapper other = (MediaResultMapper) obj;
		if (created_at == null) {
			if (other.created_at != null)
				return false;
		} else if (!created_at.equals(other.created_at))
			return false;
		if (media_id == null) {
			if (other.media_id != null)
				return false;
		} else if (!media_id.equals(other.media_id))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}