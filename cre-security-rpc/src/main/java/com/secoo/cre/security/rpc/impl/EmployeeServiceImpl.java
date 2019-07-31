package com.secoo.cre.security.rpc.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.cre.security.entity.AuthorityEntity;
import com.secoo.cre.security.entity.EmployeeEntity;
import com.secoo.cre.security.enums.*;
import com.secoo.cre.security.enums.msg.SendMsgState;
import com.secoo.cre.security.rpc.EmployeeService;
import com.secoo.cre.security.vo.*;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:13
 * @desc
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void updateLastDate(String var1) {

    }

    @Override
    public EmployeeLogVo getLogVoByXLSLid(String var1) {
        return null;
    }

    @Override
    public EmployeeLoginVo login(String var1, String var2, long var3, String var5, String var6) {
        return null;
    }

    @Override
    public EmployeeLoginVo login(String var1, String var2, long var3, String var5, String var6, String var7, String var8, LoginType var9) {
        return null;
    }

    @Override
    public EmployeeLoginVo login(String var1, String var2, String var3, String var4, long var5) {
        return null;
    }

    @Override
    public EmployeeLoginVo login(String var1, String var2, String var3, String var4) {
        return null;
    }

    @Override
    public VerifyPasswordState verifyPassword(String var1, String var2) {
        return null;
    }

    @Override
    public EmployeeCodeVo getCode() {
        return null;
    }

    @Override
    public boolean isPass(int var1, String var2, String var3, HttpMethod var4) {
        return false;
    }

    @Override
    public List<EmployeeEntity> getList(int var1, int var2, EmployeeType... var3) {
        return null;
    }

    @Override
    public EmployeeEntity getEmployee(String var1) {
        return null;
    }

    @Override
    public int getEmployeeId(String var1) {
        return 0;
    }

    @Override
    public EmployeeEntity getPhone(String var1) {
        return null;
    }

    @Override
    public EmployeeEntity getByUserId(long var1) {
        return null;
    }

    @Override
    public List<EmployeeEntity> getList() {
        return null;
    }

    @Override
    public List<AuthorityEntity> getAllAuthoritys(int var1) {
        return null;
    }

    @Override
    public List<EmployeeEntity> getListByIds(List<Integer> var1) {
        return null;
    }

    @Override
    public int uniqueName(String var1) {
        return 0;
    }

    @Override
    public int uniquePhone(String var1) {
        return 0;
    }

    @Override
    public EmployeeVo getVo(int var1) {
        return null;
    }

    @Override
    public List<EmployeeVo> getVos(Integer[] var1) {
        return null;
    }

    @Override
    public List<EmployeeEntity> getList(int var1) {
        return null;
    }

    @Override
    public LoginScanVo getLoginQrcode(String var1) {
        return null;
    }

    @Override
    public EmployeeLoginVo getLoginState(String var1, String var2) {
        return null;
    }

    @Override
    public LoginScanType scan(String var1) {
        return null;
    }

    @Override
    public LoginVo getLoginVo(String var1, String var2) {
        return null;
    }

    @Override
    public EmployeeLoginVo scanLogin(String var1, String var2, String var3) {
        return null;
    }

    @Override
    public SendMsgState sendMsg(String var1) {
        return null;
    }

    @Override
    public boolean untyingOpenid(int var1) {
        return false;
    }

    @Override
    public void xlslidExpire(String var1) {

    }
}
