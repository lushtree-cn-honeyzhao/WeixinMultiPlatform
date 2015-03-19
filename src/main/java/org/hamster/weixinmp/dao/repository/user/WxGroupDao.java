/**
 * 
 */
package org.hamster.weixinmp.dao.repository.user;

import org.hamster.weixinmp.dao.entity.user.WxGroupEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * @author honey.zhao@aliyun.com
 * @version Jul 28, 2013
 *
 *
 */
@Repository
public interface WxGroupDao extends PagingAndSortingRepository<WxGroupEntity, Long> {
}
