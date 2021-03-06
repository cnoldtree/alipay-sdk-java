package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶站点返回值
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:21:22
 */
public class FengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2549796281655943921L;

	/**
	 * 云凤蝶站点的 id
	 */
	@ApiField("activity_id")
	private Long activityId;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

}
