package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化扩展区删除接口
 *
 * @author auto create
 * @since 1.0, 2017-08-07 17:59:55
 */
public class AlipayOpenPublicPersonalizedExtensionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1179768276841935327L;

	/**
	 * 一套扩展区的key，删除默认扩展区时传入default ，查询扩展区列表可以获得每套扩展区的key
	 */
	@ApiField("extension_key")
	private String extensionKey;

	public String getExtensionKey() {
		return this.extensionKey;
	}
	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}

}
