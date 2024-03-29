package com.y.guice.bindings.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;


@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target(ElementType.LOCAL_VARIABLE)
public @interface DisCache {
	
}
