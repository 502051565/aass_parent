package com.secoo.chaos.api.service.store;

import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.bean.StoreSkuBean;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:36
 * @desc
 */
public interface StoreSkuRpcService {

    ApiRet<List<StoreSkuBean>> selectStoreSkuBySkuId(List<Long> var1);
}
