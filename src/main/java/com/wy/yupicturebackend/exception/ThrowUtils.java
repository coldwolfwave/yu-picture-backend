package com.wy.yupicturebackend.exception;

/**
 * 异常处理工具类
 */
public class ThrowUtils {
    /**
     * 条件成立则抛异常
     * @param condition 条件
     * @param runtimeException 异常
     */
    public static void throwIf(boolean condition,RuntimeException runtimeException) {
        if (condition){
            throw runtimeException;
        }
    }

    /**
     *
     * @param condition 条件
     * @param errorCode 错误码
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition,errorCode);
    }

    /**
     *
     * @param condition 条件
     * @param errorCode 错误码
     * @param message 错误信息
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition,errorCode,message);
    }
}
