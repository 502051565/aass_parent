package com.secoo.chaos.api.service.category.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.bean.CategoryBrandBean;
import com.secoo.chaos.api.service.category.CategoryQueryRpcService;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:44
 * @desc
 */
@Service
public class CategoryQueryRpcServiceImpl implements CategoryQueryRpcService {
    @Override
    public ApiRet<List<CategoryBrandBean>> listVendorCategoryByStoreId(Long var1) {
        return null;
    }

    @Override
    public ApiRet<List<CategoryBrandBean>> queryVendorCategoryBrand(Long var1) {
        return null;
    }
}
