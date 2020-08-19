package com.msxzm.base.serializer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 需要序列化的类
 * @author zenghongming
 * @date 2019/12/29 16:54
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Serializable {
}
