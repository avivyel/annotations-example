package com.krumin.processor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by aviv on 24/01/2018.
 */

@Retention(RetentionPolicy.RUNTIME)
// RetentionPolicy.SOURCE - Annotations are to be discarded by the compiler.
// RetentionPolicy.CLASS - Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time. This is the default behavior.
// RetentionPolicy.RUNTIME - Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, so they may be read reflectively.

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface CustomAnnotation {

}
