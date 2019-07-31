package com.secoo.chaos.api.service.category;

import com.secoo.chaos.api.base.ApiRet;
import com.secoo.chaos.api.bean.CategoryBrandBean;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:34
 * @desc
 */
public interface CategoryQueryRpcService {
    ApiRet<List<CategoryBrandBean>> listVendorCategoryByStoreId(Long var1);

    ApiRet<List<CategoryBrandBean>> queryVendorCategoryBrand(Long var1);

}
