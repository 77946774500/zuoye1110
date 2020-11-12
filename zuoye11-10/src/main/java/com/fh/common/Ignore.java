package com.fh.common;

import java.lang.annotation.*;

/**
 * @author czx
 * @create 2020-10-15 11:46
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Ignore {
}
