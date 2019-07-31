package com.secoo.user.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.secoo.user.api.UserService;
import com.secoo.user.dto.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:39
 * @desc
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public ResultDto<UserDto> getUserInfoByShortId(Long var1) {
        return null;
    }

    @Override
    public ResultDto<LoginResultDto> login(LoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<LoginCaptchaDto> generateLoginCaptcha(String var1) {
        return null;
    }

    @Override
    public ResultDto<Object> loginSendMsgForVerify(LoginVerifyDto var1) {
        return null;
    }

    @Override
    public ResultDto<LoginResultDto> loginVerifyMobile(LoginVerifyDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> loginSendMsgForBind(LoginVerifyDto var1) {
        return null;
    }

    @Override
    public ResultDto<LoginResultDto> loginBindMobile(LoginVerifyDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> loginSmsUpVerifySuccess(String var1) {
        return null;
    }

    @Override
    public ResultDto<UpkCheckResultDto> checkLogin(UpkCheckDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> invalidateUpk(UpkDelDto var1) {
        return null;
    }

    @Override
    public ResultDto<LoginAndUserInfoDto> loginGetUserInfo(LoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserDto> updateUserInfo(UserDto var1) {
        return null;
    }

    @Override
    public ResultDto<List<UserDto>> getUserNickNameAndImg(String var1) {
        return null;
    }

    @Override
    public ResultDto<RegisterResultDto> register(RegisterDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateLoginPwd(PwdUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> sendMsg(SendMsgDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> msgCodeVerify(MsgCodeVerifyDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> sendEmailCode(EmailCodeDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> findPwdStep1(String var1) {
        return null;
    }

    @Override
    public ResultDto<Object> findPwdStep2(FindPwdDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> syncDelUserRedis(UserRedisDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> delUserRedis(UserRedisDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserDto> getUserInfoByUserId(String var1) {
        return null;
    }

    @Override
    public ResultDto<UserBaseInfoDto> bindOtherIdentify(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> bindOtherIdentifyByToken(JointTokenDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserBaseInfoDto> getUserInfoByOtherId(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserBaseInfoDto> getAndBindUserInfo(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<OtherInfoDto> getOtherInfo(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<RegisterResultDto> bindNewAccount(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<RegisterResultDto> bindNewAccountByToken(JointTokenDto var1) {
        return null;
    }

    @Override
    public ResultDto<LoginResultDto> jointLogin(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> unBindJointLogin(Long var1) {
        return null;
    }

    @Override
    public ResultDto<List<JointLoginDto>> getOpenIdByUids(List<Long> var1, Integer var2) {
        return null;
    }

    @Override
    public ResultDto<LoginResultDto> pcQQLogin(JointLoginDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserDto> identifyReg(UserRegDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserMobile(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserMobileByVerify(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> bindUserMobile(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> bindUserMobileConfirm(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> bindUserMobileByVerify(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateMemberMobile(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserEmail(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserLoginPwd(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> resetUserLoginPwd(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserPayPwd(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> closeAccount(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> unbindAccount(UserSafeUptDto var1) {
        return null;
    }

    @Override
    public ResultDto<List<UserChangeLogDto>> queryUserChangeLog(Long var1) {
        return null;
    }

    @Override
    public ResultDto<List<JointLoginDto>> getJointAccountByShortUid(Long var1) {
        return null;
    }

    @Override
    public ResultDto<UserDto> getUserInfoByMobile(String var1) {
        return null;
    }

    @Override
    public ResultDto<UserDto> getUserInfoByUserName(String var1) {
        return null;
    }

    @Override
    public ResultDto<List<UserNameCheckResDto>> checkUserName(String var1) {
        return null;
    }

    @Override
    public ResultDto<List<UserLevelLogDto>> getUserLevelLogs(Long var1) {
        return null;
    }

    @Override
    public ResultDto<UserLevelLogDto> getUserLatestLevelLog(Long var1) {
        return null;
    }

    @Override
    public ResultDto<QueryUserResultDto> queryUserInfo(QueryUserDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserShippingDto> getUserShippingInfo(Long var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserShippingInfo(UserShippingDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserLevelInfoDto> getUserLevelInfo(Long var1) {
        return null;
    }

    @Override
    public ResultDto<List<LevelInfoDto>> getAllLevelInfo() {
        return null;
    }

    @Override
    public ResultDto<LevelInfoDto> getLevelInfoByLevel(Integer var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserLevel(UpdateLevelDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> payMember(PayMemberDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserBenefitsDto> getUserBenefits(Long var1, Integer var2) {
        return null;
    }

    @Override
    public ResultDto<Object> updateUserBenefits(UpdateBenefitsDto var1) {
        return null;
    }

    @Override
    public ResultDto<BigDecimal> getUserReturnKupayRate(Long var1) {
        return null;
    }

    @Override
    public ResultDto<Integer> getAvailFreePostage(Long var1) {
        return null;
    }

    @Override
    public ResultDto<Object> initDict(Integer var1) {
        return null;
    }

    @Override
    public ResultDto<Object> updateOldUser(Long var1) {
        return null;
    }

    @Override
    public ResultDto<Object> idVerify(IdentifyDto var1) {
        return null;
    }

    @Override
    public ResultDto<IdentifyDto> getIdentifyInfo(Long var1) {
        return null;
    }

    @Override
    public ResultDto<QuickRefundConditionDto> getQuickRefundCondition(Long var1) {
        return null;
    }

    @Override
    public ResultDto<Object> setUserRebateType(RebateTypeDto var1) {
        return null;
    }

    @Override
    public ResultDto<UserExpandDto> getUserExpandInfo(Long var1) {
        return null;
    }

    @Override
    public ResultDto<UserAndExpandDto> getUserAndExpandInfo(Long var1) {
        return null;
    }

    @Override
    public ResultDto<List<UpdateLabelResDto>> updateUserLabel(UpdateLabelDto var1) {
        return null;
    }

    @Override
    public ResultDto<String> queryUserLabel(Long var1) {
        return null;
    }

    @Override
    public ResultDto<UserLabelDto> queryUserLabelByField(Long var1, String var2) {
        return null;
    }

    @Override
    public Boolean isNeedLoginCaptcha(String var1, Integer var2) {
        return null;
    }

    @Override
    public void resetUpkRedisFailCount() {

    }

    @Override
    public int getUpkRedisFailCount() {
        return 0;
    }

    @Override
    public ResultDto<Object> updateFreezeBatch(FreezeUpdateDto var1) {
        return null;
    }

    @Override
    public ResultDto<Object> insertTrustInfo(TrustInfoDto var1) {
        return null;
    }

    @Override
    public ResultDto<LoginResultDto> scanLogin(ScanLoginDto var1) {
        return null;
    }
}
