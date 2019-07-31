package com.secoo.product.api.query.dict.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.product.api.query.dict.dto.ProductCategoryDto;
import com.secoo.product.api.query.dict.dto.SimpleCategoryDto;
import com.secoo.product.api.query.dict.service.CategoryQueryRpcService;

import java.util.*;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:48
 * @desc
 */
@Service
public class CategoryQueryRpcServiceImpl implements CategoryQueryRpcService {
    @Override
    public SimpleCategoryDto queryById(Long var1) {
        return null;
    }

    @Override
    public List<SimpleCategoryDto> queryByParentId(Long var1) {
        return null;
    }

    @Override
    public HashMap<Long, SimpleCategoryDto> queryListByIds(Collection<Long> var1) {
        return null;
    }

    @Override
    public List<SimpleCategoryDto> queryAll() {
        return null;
    }

    @Override
    public List<ProductCategoryDto> queryCategoryByLastModifyDate(Date var1) {
        return null;
    }

    @Override
    public List<SimpleCategoryDto> selectAllParentList() throws Exception {
        return null;
    }

    @Override
    public Map<Long, SimpleCategoryDto> selectAllParentListMap() throws Exception {
        return null;
    }
}
