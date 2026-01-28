package com.day1.healthcheckpro;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PublicAPI {
	String description() default "";
}
