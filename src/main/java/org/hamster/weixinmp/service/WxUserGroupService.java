/**
 * 
 */
package org.hamster.weixinmp.service;

import static org.hamster.weixinmp.util.WxUtil.getAccessTokenParams;
import static org.hamster.weixinmp.util.WxUtil.sendRequest;
import static org.hamster.weixinmp.util.WxUtil.toJsonStringEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamster.weixinmp.config.WxConfig;
import org.hamster.weixinmp.dao.entity.user.WxGroupEntity;
import org.hamster.weixinmp.exception.WxException;
import org.hamster.weixinmp.model.WxRespCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * @author honey.zhao@aliyun.com
 * @version Jan 1, 2014
 * 
 */
@Service
public class WxUserGroupService {
	@Autowired
	private WxConfig config;

	/**
	 * http请求方式: POST（请使用https协议）<br />
	 * https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN<br />
	 * POST数据格式：json<br />
	 * POST数据例子：{"group":{"name":"test"}}<br />
	 * 
	 * { "group": { "id": 107, "name": "test" } } <br />
	 * 
	 * @param groupName
	 * @return
	 * @throws WxException
	 */
	public WxGroupEntity remoteGroupsCreate(String accessToken, String groupName)
			throws WxException {
		Map<String, Object> requestJson = new HashMap<String, Object>();
		Map<String, Object> l1Json = new HashMap<String, Object>();
		l1Json.put("name", groupName);
		requestJson.put("group", l1Json);

		ResultMapper result = sendRequest(config.getGroupsCreateUrl(),
				HttpMethod.POST, getAccessTokenParams(accessToken),
				toJsonStringEntity(requestJson), ResultMapper.class);
		return result.getGroup();
	}

	/**
	 * http请求方式: GET（请使用https协议）<br />
	 * https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN<br />
	 * 
	 * { "groups": [ { "id": 0, "name": "未分组", "count": 72596 }, { "id": 1,
	 * "name": "黑名单", "count": 36 }, { "id": 2, "name": "星标组", "count": 8 }, {
	 * "id": 104, "name": "华东媒", "count": 4 }, { "id": 106, "name": "★不测试组★",
	 * "count": 1 } ] }<br />
	 * 
	 * @return
	 * @throws WxException
	 */
	public List<WxGroupEntity> remoteGroupsGet(String accessToken)
			throws WxException {
		return sendRequest(config.getGroupsGetUrl(), HttpMethod.GET,
				getAccessTokenParams(accessToken), null, ResultMapper.class)
				.getGroups();
	}

	/**
	 * http请求方式: POST（请使用https协议）<br />
	 * https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN<br />
	 * POST数据格式：json POST数据例子：{"openid":"od8XIjsmk6QdVTETa9jLtGWA6KBc"} <br />
	 * {"groupid": 102 }<br />
	 * 
	 * @param openId
	 * @return
	 * @throws WxException
	 */
	public Long remoteGroupsGetId(String accessToken, String openId)
			throws WxException {
		Map<String, Object> requestJson = new HashMap<String, Object>();
		requestJson.put("openid", openId);
		return sendRequest(config.getGroupsGetIdUrl(), HttpMethod.POST,
				getAccessTokenParams(accessToken), toJsonStringEntity(requestJson),
				ResultMapper.class).getGroupid();
	}

	/**
	 * http请求方式: POST（请使用https协议）<br>
	 * https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN<br>
	 * POST数据格式：json<br>
	 * POST数据例子：{"group":{"id":108,"name":"test2_modify2"}}<br>
	 * 
	 * {"errcode": 0, "errmsg": "ok"}<br>
	 * 
	 * @param id
	 * @param name
	 * @return
	 * @throws WxException
	 */
	public WxRespCode remoteGroupsUpdate(String accessToken, Long id,
			String name) throws WxException {
		Map<String, Object> requestJson = new HashMap<String, Object>();
		Map<String, Object> l1Json = new HashMap<String, Object>();
		l1Json.put("id", id);
		l1Json.put("name", name);
		requestJson.put("group", l1Json);
		return sendRequest(config.getGroupsUpdateUrl(), HttpMethod.POST,
				getAccessTokenParams(accessToken), toJsonStringEntity(requestJson),
				WxRespCode.class);
	}

	/**
	 * http请求方式: POST（请使用https协议）<br>
	 * https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=
	 * ACCESS_TOKEN<br>
	 * POST数据格式：json<br>
	 * POST数据例子：{"openid":"oDF3iYx0ro3_7jD4HFRDfrjdCM58","to_groupid":108}<br>
	 * {"errcode": 0, "errmsg": "ok"}<br>
	 * 
	 * @param openid
	 * @param to_groupid
	 * @return
	 * @throws WxException
	 */
	public WxRespCode remoteGroupsMembersUpdate(String accessToken,
			String openid, Long to_groupid) throws WxException {
		Map<String, Object> requestJson = new HashMap<String, Object>();
		requestJson.put("openid", openid);
		requestJson.put("to_groupid", to_groupid);
		return sendRequest(config.getGroupsMembersUpdateUrl(), HttpMethod.POST,
				getAccessTokenParams(accessToken), toJsonStringEntity(requestJson),
				WxRespCode.class);
	}

}

final class ResultMapper {
	private WxGroupEntity group;
	private List<WxGroupEntity> groups;
	private Long groupid;
	public WxGroupEntity getGroup() {
		return group;
	}
	public void setGroup(WxGroupEntity group) {
		this.group = group;
	}
	public List<WxGroupEntity> getGroups() {
		return groups;
	}
	public void setGroups(List<WxGroupEntity> groups) {
		this.groups = groups;
	}
	public Long getGroupid() {
		return groupid;
	}
	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}
	public ResultMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultMapper(WxGroupEntity group, List<WxGroupEntity> groups,
			Long groupid) {
		super();
		this.group = group;
		this.groups = groups;
		this.groupid = groupid;
	}
	@Override
	public String toString() {
		return "ResultMapper [group=" + group + ", groups=" + groups
				+ ", groupid=" + groupid + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((groupid == null) ? 0 : groupid.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
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
		ResultMapper other = (ResultMapper) obj;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (groupid == null) {
			if (other.groupid != null)
				return false;
		} else if (!groupid.equals(other.groupid))
			return false;
		if (groups == null) {
			if (other.groups != null)
				return false;
		} else if (!groups.equals(other.groups))
			return false;
		return true;
	}
	
	
}