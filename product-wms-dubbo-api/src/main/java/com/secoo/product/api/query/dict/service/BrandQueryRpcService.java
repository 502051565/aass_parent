package com.secoo.product.api.query.dict.service;

import com.secoo.product.api.query.dict.dto.ProductBrandDto;
import com.secoo.product.api.query.dict.dto.SimpleBrandDto;

import java.util.*;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:38
 * @desc
 */
public interface BrandQueryRpcService {
    SimpleBrandDto queryById(Long var1);

    HashMap<Long, SimpleBrandDto> queryListByIds(Collection<Long> var1);

    List<SimpleBrandDto> queryListByInitial(String var1);

    List<SimpleBrandDto> queryAll();

    List<ProductBrandDto> queryByLastModifyDate(Date var1);

    Long verifyProductIsExistsBrand(Map<String, Long> var1);
}
