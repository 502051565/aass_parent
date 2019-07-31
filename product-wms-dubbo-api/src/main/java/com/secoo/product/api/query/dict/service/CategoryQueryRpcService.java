package com.secoo.product.api.query.dict.service;

import com.secoo.product.api.query.dict.dto.ProductCategoryDto;
import com.secoo.product.api.query.dict.dto.SimpleCategoryDto;

import java.util.*;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:47
 * @desc
 */
public interface CategoryQueryRpcService {

    SimpleCategoryDto queryById(Long var1);

    List<SimpleCategoryDto> queryByParentId(Long var1);

    HashMap<Long, SimpleCategoryDto> queryListByIds(Collection<Long> var1);

    List<SimpleCategoryDto> queryAll();

    List<ProductCategoryDto> queryCategoryByLastModifyDate(Date var1);

    List<SimpleCategoryDto> selectAllParentList() throws Exception;

    Map<Long, SimpleCategoryDto> selectAllParentListMap() throws Exception;
}
