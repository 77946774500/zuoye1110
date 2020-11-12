package com.fh.common;

import java.lang.annotation.*;

/**
 * @author czx
 * @create 2020-11-06 11:52
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Idempotent {
}
