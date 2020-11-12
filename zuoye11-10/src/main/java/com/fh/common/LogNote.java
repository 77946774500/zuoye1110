package com.fh.common;

import java.lang.annotation.*;

/**
 * @author czx
 * @create 2020-10-19 16:20
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogNote {
    String value();
}
