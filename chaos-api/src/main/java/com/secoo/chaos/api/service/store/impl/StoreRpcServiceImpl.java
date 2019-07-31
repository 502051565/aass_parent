package com.secoo.chaos.api.service.store.impl;

import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.bean.StoreBean;
import com.secoo.chaos.api.service.store.StoreRpcService;

import java.util.List;
import java.util.Map;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:45
 * @desc
 */
public class StoreRpcServiceImpl implements StoreRpcService {
    @Override
    public ApiRet<Map<Long, StoreBean>> queryStoreMappingVendor(List<Long> var1) {
        return null;
    }

    @Override
    public ApiRet<Map<Long, StoreBean>> queryStoreMappingVendor() {
        return null;
    }

    @Override
    public ApiRet<StoreBean> queryStoreInfo(Long var1) {
        return null;
    }

    @Override
    public ApiRet<List<StoreBean>> queryStoreInfo(List<Long> var1) {
        return null;
    }
}
