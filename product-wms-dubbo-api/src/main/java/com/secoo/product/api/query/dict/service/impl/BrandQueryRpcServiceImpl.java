package com.secoo.product.api.query.dict.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.product.api.query.dict.dto.ProductBrandDto;
import com.secoo.product.api.query.dict.dto.SimpleBrandDto;
import com.secoo.product.api.query.dict.service.BrandQueryRpcService;

import java.util.*;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:40
 * @desc
 */
@Service
public class BrandQueryRpcServiceImpl implements BrandQueryRpcService {
    @Override
    public SimpleBrandDto queryById(Long var1) {
        return null;
    }

    @Override
    public HashMap<Long, SimpleBrandDto> queryListByIds(Collection<Long> var1) {
        return null;
    }

    @Override
    public List<SimpleBrandDto> queryListByInitial(String var1) {
        return null;
    }

    @Override
    public List<SimpleBrandDto> queryAll() {
        return null;
    }

    @Override
    public List<ProductBrandDto> queryByLastModifyDate(Date var1) {
        return null;
    }

    @Override
    public Long verifyProductIsExistsBrand(Map<String, Long> var1) {
        return null;
    }
}
