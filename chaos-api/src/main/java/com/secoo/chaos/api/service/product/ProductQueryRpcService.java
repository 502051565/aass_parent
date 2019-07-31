package com.secoo.chaos.api.service.product;

import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.base.PageQueryResult;
import com.secoo.chaos.api.bean.ProductQueryCriteria;
import com.secoo.chaos.api.bean.SkuSimpleBean;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:46
 * @desc
 */
public interface ProductQueryRpcService {

    ApiRet<PageQueryResult<SkuSimpleBean>> querySkuSimple(ProductQueryCriteria var1);

    ApiRet<List<SkuSimpleBean>> querySkuSimple(List<Long> var1);

    ApiRet<List<SkuSimpleBean>> querySkuSimple(List<Long> var1, Long var2);
}
