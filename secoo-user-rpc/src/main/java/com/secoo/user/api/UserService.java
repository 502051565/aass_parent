package com.secoo.user.api;

import com.secoo.user.dto.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:11
 * @desc
 */
public interface UserService {

    ResultDto<UserDto> getUserInfoByShortId(Long var1);

    ResultDto<LoginResultDto> login(LoginDto var1);

    ResultDto<LoginCaptchaDto> generateLoginCaptcha(String var1);

    ResultDto<Object> loginSendMsgForVerify(LoginVerifyDto var1);

    ResultDto<LoginResultDto> loginVerifyMobile(LoginVerifyDto var1);

    ResultDto<Object> loginSendMsgForBind(LoginVerifyDto var1);

    ResultDto<LoginResultDto> loginBindMobile(LoginVerifyDto var1);

    ResultDto<Object> loginSmsUpVerifySuccess(String var1);

    ResultDto<UpkCheckResultDto> checkLogin(UpkCheckDto var1);

    ResultDto<Object> invalidateUpk(UpkDelDto var1);

    ResultDto<LoginAndUserInfoDto> loginGetUserInfo(LoginDto var1);

    ResultDto<UserDto> updateUserInfo(UserDto var1);

    ResultDto<List<UserDto>> getUserNickNameAndImg(String var1);

    ResultDto<RegisterResultDto> register(RegisterDto var1);

    ResultDto<Object> updateLoginPwd(PwdUptDto var1);

    ResultDto<Object> sendMsg(SendMsgDto var1);

    ResultDto<Object> msgCodeVerify(MsgCodeVerifyDto var1);

    ResultDto<Object> sendEmailCode(EmailCodeDto var1);

    ResultDto<Object> findPwdStep1(String var1);

    ResultDto<Object> findPwdStep2(FindPwdDto var1);

    ResultDto<Object> syncDelUserRedis(UserRedisDto var1);

    ResultDto<Object> delUserRedis(UserRedisDto var1);

    /** @deprecated */
    @Deprecated
    ResultDto<UserDto> getUserInfoByUserId(String var1);

    ResultDto<UserBaseInfoDto> bindOtherIdentify(JointLoginDto var1);

    ResultDto<Object> bindOtherIdentifyByToken(JointTokenDto var1);

    ResultDto<UserBaseInfoDto> getUserInfoByOtherId(JointLoginDto var1);

    ResultDto<UserBaseInfoDto> getAndBindUserInfo(JointLoginDto var1);

    ResultDto<OtherInfoDto> getOtherInfo(JointLoginDto var1);

    ResultDto<RegisterResultDto> bindNewAccount(JointLoginDto var1);

    ResultDto<RegisterResultDto> bindNewAccountByToken(JointTokenDto var1);

    ResultDto<LoginResultDto> jointLogin(JointLoginDto var1);

    ResultDto<Object> unBindJointLogin(Long var1);

    ResultDto<List<JointLoginDto>> getOpenIdByUids(List<Long> var1, Integer var2);

    ResultDto<LoginResultDto> pcQQLogin(JointLoginDto var1);

    ResultDto<UserDto> identifyReg(UserRegDto var1);

    ResultDto<Object> updateUserMobile(UserSafeUptDto var1);

    ResultDto<Object> updateUserMobileByVerify(UserSafeUptDto var1);

    ResultDto<Object> bindUserMobile(UserSafeUptDto var1);

    ResultDto<Object> bindUserMobileConfirm(UserSafeUptDto var1);

    ResultDto<Object> bindUserMobileByVerify(UserSafeUptDto var1);

    ResultDto<Object> updateMemberMobile(UserSafeUptDto var1);

    ResultDto<Object> updateUserEmail(UserSafeUptDto var1);

    ResultDto<Object> updateUserLoginPwd(UserSafeUptDto var1);

    ResultDto<Object> resetUserLoginPwd(UserSafeUptDto var1);

    ResultDto<Object> updateUserPayPwd(UserSafeUptDto var1);

    ResultDto<Object> closeAccount(UserSafeUptDto var1);

    ResultDto<Object> unbindAccount(UserSafeUptDto var1);

    ResultDto<List<UserChangeLogDto>> queryUserChangeLog(Long var1);

    ResultDto<List<JointLoginDto>> getJointAccountByShortUid(Long var1);

    ResultDto<UserDto> getUserInfoByMobile(String var1);

    ResultDto<UserDto> getUserInfoByUserName(String var1);

    ResultDto<List<UserNameCheckResDto>> checkUserName(String var1);

    ResultDto<List<UserLevelLogDto>> getUserLevelLogs(Long var1);

    ResultDto<UserLevelLogDto> getUserLatestLevelLog(Long var1);

    ResultDto<QueryUserResultDto> queryUserInfo(QueryUserDto var1);

    ResultDto<UserShippingDto> getUserShippingInfo(Long var1);

    ResultDto<Object> updateUserShippingInfo(UserShippingDto var1);

    ResultDto<UserLevelInfoDto> getUserLevelInfo(Long var1);

    ResultDto<List<LevelInfoDto>> getAllLevelInfo();

    ResultDto<LevelInfoDto> getLevelInfoByLevel(Integer var1);

    ResultDto<Object> updateUserLevel(UpdateLevelDto var1);

    ResultDto<Object> payMember(PayMemberDto var1);

    ResultDto<UserBenefitsDto> getUserBenefits(Long var1, Integer var2);

    ResultDto<Object> updateUserBenefits(UpdateBenefitsDto var1);

    ResultDto<BigDecimal> getUserReturnKupayRate(Long var1);

    ResultDto<Integer> getAvailFreePostage(Long var1);

    ResultDto<Object> initDict(Integer var1);

    ResultDto<Object> updateOldUser(Long var1);

    ResultDto<Object> idVerify(IdentifyDto var1);

    ResultDto<IdentifyDto> getIdentifyInfo(Long var1);

    ResultDto<QuickRefundConditionDto> getQuickRefundCondition(Long var1);

    ResultDto<Object> setUserRebateType(RebateTypeDto var1);

    ResultDto<UserExpandDto> getUserExpandInfo(Long var1);

    ResultDto<UserAndExpandDto> getUserAndExpandInfo(Long var1);

    ResultDto<List<UpdateLabelResDto>> updateUserLabel(UpdateLabelDto var1);

    ResultDto<String> queryUserLabel(Long var1);

    ResultDto<UserLabelDto> queryUserLabelByField(Long var1, String var2);

    Boolean isNeedLoginCaptcha(String var1, Integer var2);

    void resetUpkRedisFailCount();

    int getUpkRedisFailCount();

    ResultDto<Object> updateFreezeBatch(FreezeUpdateDto var1);

    ResultDto<Object> insertTrustInfo(TrustInfoDto var1);

    ResultDto<LoginResultDto> scanLogin(ScanLoginDto var1);
}
