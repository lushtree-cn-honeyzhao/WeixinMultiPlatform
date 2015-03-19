/**
 * 
 */
package org.hamster.weixinmp.dao.repository.msg;

import org.hamster.weixinmp.dao.entity.msg.WxMsgLinkEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 */
@Repository
public interface WxMsgLinkDao extends PagingAndSortingRepository<WxMsgLinkEntity, Long> {

}
