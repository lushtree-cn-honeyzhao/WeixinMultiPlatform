/**
 * 
 */
package org.hamster.weixinmp.dao.repository.auth;

import org.hamster.weixinmp.dao.entity.auth.WxAuthReq;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 */
@Repository
public interface WxAuthReqDao extends PagingAndSortingRepository<WxAuthReq, Long> {

}
