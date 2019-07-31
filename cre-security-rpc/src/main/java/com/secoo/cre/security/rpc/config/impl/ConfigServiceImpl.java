package com.secoo.cre.security.rpc.config.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.cre.security.entity.config.ConfigEntity;
import com.secoo.cre.security.rpc.config.ConfigService;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:33
 * @desc
 */
@Service
public class ConfigServiceImpl implements ConfigService {
    @Override
    public List<ConfigEntity> getList(String var1) {
        return null;
    }

    @Override
    public List<ConfigEntity> getList(String var1, String var2) {
        return null;
    }

    @Override
    public <T> List<List<T>> getListList(Class<T> var1, String var2, String var3) {
        return null;
    }

    @Override
    public <T> List<T> getList(Class<T> var1, String var2, String var3) {
        return null;
    }

    @Override
    public ConfigEntity saveJson(ConfigEntity var1, Object var2) {
        return null;
    }

    @Override
    public String val(String var1, String var2) {
        return null;
    }

    @Override
    public void update(String var1, String var2, String var3) {

    }
}
