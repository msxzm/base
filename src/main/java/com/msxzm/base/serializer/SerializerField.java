package com.msxzm.base.serializer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 需要序列化的字段
 * @author zenghongming
 * @date 2019/12/29 16:55
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface SerializerField {
    
    /** 是否不检查是否可序列化 */
    boolean uncheck() default false;
}
