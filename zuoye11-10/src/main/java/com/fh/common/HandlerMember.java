package com.fh.common;

import java.lang.annotation.*;

/**
 * @author czx
 * @create 2020-11-10 10:28
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HandlerMember {
}
