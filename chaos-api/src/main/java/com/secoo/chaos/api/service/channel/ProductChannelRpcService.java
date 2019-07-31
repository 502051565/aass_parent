package com.secoo.chaos.api.service.channel;

import com.secoo.chaos.api.base.ApiRet;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:35
 * @desc
 */
public interface ProductChannelRpcService {

    ApiRet<List<Long>> queryChannelExistSkuId(String var1, List<Long> var2);
}
