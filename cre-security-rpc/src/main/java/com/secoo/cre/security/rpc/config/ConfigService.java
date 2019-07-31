package com.secoo.cre.security.rpc.config;

import com.secoo.cre.security.entity.config.ConfigEntity;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:31
 * @desc
 */
public interface ConfigService {
    List<ConfigEntity> getList(String var1);

    List<ConfigEntity> getList(String var1, String var2);

    <T> List<List<T>> getListList(Class<T> var1, String var2, String var3);

    <T> List<T> getList(Class<T> var1, String var2, String var3);

    ConfigEntity saveJson(ConfigEntity var1, Object var2);

    String val(String var1, String var2);

    void update(String var1, String var2, String var3);
}
