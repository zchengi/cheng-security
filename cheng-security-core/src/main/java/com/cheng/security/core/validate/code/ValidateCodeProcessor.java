package com.cheng.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * 验证码处理器，封装不同验证码的处理逻辑
 *
 * @author cheng
 *         2018/8/7 14:33
 */
public interface ValidateCodeProcessor {

    /**
     * 创建验证码
     *
     * @param request
     * @throws Exception
     */
    void create(ServletWebRequest request) throws Exception;

    /**
     * 校验验证码
     *
     * @param request
     */
    void validate(ServletWebRequest request);
}
