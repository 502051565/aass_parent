package com.secoo.product.api.product.service;

import com.secoo.product.api.product.common.bean.RpcOperResult;
import com.secoo.product.api.product.dto.OuterProductDto;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:54
 * @desc
 */
public interface OuterProductRpcService {
    RpcOperResult<Long> addOuterProduct(OuterProductDto var1);

    RpcOperResult<Long> editOuterProduct(OuterProductDto var1);

    RpcOperResult<String> productOnSell(List<Long> var1, String var2);

    RpcOperResult<String> productOffSell(List<Long> var1, String var2);
}
