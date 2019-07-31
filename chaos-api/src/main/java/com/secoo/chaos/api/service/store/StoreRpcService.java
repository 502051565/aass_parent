package com.secoo.chaos.api.service.store;

import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.bean.StoreBean;

import java.util.List;
import java.util.Map;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:35
 * @desc
 */
public interface StoreRpcService {
    ApiRet<Map<Long, StoreBean>> queryStoreMappingVendor(List<Long> var1);

    ApiRet<Map<Long, StoreBean>> queryStoreMappingVendor();

    ApiRet<StoreBean> queryStoreInfo(Long var1);

    ApiRet<List<StoreBean>> queryStoreInfo(List<Long> var1);

}
