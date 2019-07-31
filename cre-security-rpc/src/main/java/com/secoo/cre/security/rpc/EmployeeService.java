package com.secoo.cre.security.rpc;

import com.secoo.cre.security.entity.AuthorityEntity;
import com.secoo.cre.security.entity.EmployeeEntity;
import com.secoo.cre.security.enums.*;
import com.secoo.cre.security.enums.msg.SendMsgState;
import com.secoo.cre.security.vo.*;

import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:56
 * @desc
 */
public interface EmployeeService {

    void updateLastDate(String var1);

    EmployeeLogVo getLogVoByXLSLid(String var1);

    EmployeeLoginVo login(String var1, String var2, long var3, String var5, String var6);

    EmployeeLoginVo login(String var1, String var2, long var3, String var5, String var6, String var7, String var8, LoginType var9);

    EmployeeLoginVo login(String var1, String var2, String var3, String var4, long var5);

    EmployeeLoginVo login(String var1, String var2, String var3, String var4);

    VerifyPasswordState verifyPassword(String var1, String var2);

    EmployeeCodeVo getCode();

    boolean isPass(int var1, String var2, String var3, HttpMethod var4);

    List<EmployeeEntity> getList(int var1, int var2, EmployeeType... var3);

    EmployeeEntity getEmployee(String var1);

    int getEmployeeId(String var1);

    EmployeeEntity getPhone(String var1);

    EmployeeEntity getByUserId(long var1);

    List<EmployeeEntity> getList();

//    List<EmployeeEntity> getGroupList(PageIndex var1, int... var2);


    List<AuthorityEntity> getAllAuthoritys(int var1);

    List<EmployeeEntity> getListByIds(List<Integer> var1);

    int uniqueName(String var1);

    int uniquePhone(String var1);

    EmployeeVo getVo(int var1);

    List<EmployeeVo> getVos(Integer[] var1);

    List<EmployeeEntity> getList(int var1);

    LoginScanVo getLoginQrcode(String var1);

    EmployeeLoginVo getLoginState(String var1, String var2);

    LoginScanType scan(String var1);

    LoginVo getLoginVo(String var1, String var2);

    EmployeeLoginVo scanLogin(String var1, String var2, String var3);

    SendMsgState sendMsg(String var1);

    boolean untyingOpenid(int var1);

    void xlslidExpire(String var1);
}
