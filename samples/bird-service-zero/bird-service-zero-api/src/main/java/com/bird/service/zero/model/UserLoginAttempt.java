package com.bird.service.zero.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.bird.service.common.model.AbstractModel;
import lombok.Getter;
import lombok.Setter;

/**
 *  用户登陆日志Model
 *  @author liuweidong
 * */
@Getter
@Setter
@TableName("zero_user_login_attempt")
public class UserLoginAttempt extends AbstractModel {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 登录客户端IP
     */
    private String clientIp;
    /**
     * 登录客户端名称
     */
    private String clientName;
    /**
     * 浏览器信息
     */
    private String browserInfo;
    /**
     * 1.成功;2.用户名不存在;3.密码错误;4.用户被锁定
     */
    private Integer result;
}
