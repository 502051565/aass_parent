package com.secoo.cre.security.enums;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:08
 * @desc
 */
public enum HttpMethod {

    ALL,
    GET,
    DELETE,
    POST,
    PUT,
    HEAD,
    OPTIONS,
    TRACE;

    private HttpMethod() {
    }

    public static HttpMethod getHttpMethod(String methodName) {
        if (methodName != null && methodName.length() > 0) {
            methodName = methodName.trim().toUpperCase();
            if (ALL.toString().equals(methodName)) {
                return ALL;
            }

            if (GET.toString().equals(methodName)) {
                return GET;
            }

            if (DELETE.toString().equals(methodName)) {
                return DELETE;
            }

            if (POST.toString().equals(methodName)) {
                return POST;
            }

            if (PUT.toString().equals(methodName)) {
                return PUT;
            }

            if (HEAD.toString().equals(methodName)) {
                return HEAD;
            }

            if (OPTIONS.toString().equals(methodName)) {
                return OPTIONS;
            }

            if (TRACE.toString().equals(methodName)) {
                return TRACE;
            }
        }

        return null;
    }
}
