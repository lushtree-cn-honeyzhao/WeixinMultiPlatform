/**
 * 
 */
package org.hamster.weixinmp.dao.repository.item;

import org.hamster.weixinmp.dao.entity.item.WxItemVoiceEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author honey.zhao@aliyun.com
 * @version Jan 5, 2014
 * 
 */
@Repository
public interface WxItemVoiceDao extends
		PagingAndSortingRepository<WxItemVoiceEntity, Long> {

}
