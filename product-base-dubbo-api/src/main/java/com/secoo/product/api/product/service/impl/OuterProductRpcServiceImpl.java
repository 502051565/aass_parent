package com.secoo.product.api.product.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.product.api.product.service.OuterProductRpcService;
import com.secoo.product.api.product.common.bean.RpcOperResult;
import com.secoo.product.api.product.dto.OuterProductDto;


import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:59
 * @desc
 */
@Service
public class OuterProductRpcServiceImpl implements OuterProductRpcService {
    @Override
    public RpcOperResult<Long> addOuterProduct(OuterProductDto var1) {
        return null;
    }

    @Override
    public RpcOperResult<Long> editOuterProduct(OuterProductDto var1) {
        return null;
    }

    @Override
    public RpcOperResult<String> productOnSell(List<Long> var1, String var2) {
        return null;
    }

    @Override
    public RpcOperResult<String> productOffSell(List<Long> var1, String var2) {
        return null;
    }
}
