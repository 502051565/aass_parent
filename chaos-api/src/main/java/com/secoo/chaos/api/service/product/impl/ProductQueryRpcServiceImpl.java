package com.secoo.chaos.api.service.product.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.base.PageQueryResult;
import com.secoo.chaos.api.bean.ProductQueryCriteria;
import com.secoo.chaos.api.bean.SkuSimpleBean;
import com.secoo.chaos.api.service.product.ProductQueryRpcService;


import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:55
 * @desc
 */
@Service
public class ProductQueryRpcServiceImpl implements ProductQueryRpcService {
    @Override
    public ApiRet<PageQueryResult<SkuSimpleBean>> querySkuSimple(ProductQueryCriteria var1) {
        return null;
    }

    @Override
    public ApiRet<List<SkuSimpleBean>> querySkuSimple(List<Long> var1) {


        ApiRet<List<SkuSimpleBean>> result= new ApiRet<List<SkuSimpleBean>>();

        SkuSimpleBean skuSimpleBean = new SkuSimpleBean();
        skuSimpleBean.setMainImgUri("123123132");
        skuSimpleBean.setName("测试");

        return result;
    }

    @Override
    public ApiRet<List<SkuSimpleBean>> querySkuSimple(List<Long> var1, Long var2) {
        return null;
    }
}
