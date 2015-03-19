/**
 * 
 */
package org.hamster.weixinmp.dao.repository.item;

import org.hamster.weixinmp.dao.entity.item.WxItemThumbEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author honey.zhao@aliyun.com
 * @version Jan 5, 2014
 * 
 */
@Repository
public interface WxItemThumbDao extends
		PagingAndSortingRepository<WxItemThumbEntity, Long> {

}
