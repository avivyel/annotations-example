package com.krumin.annotationexample;

import android.Manifest;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntDef;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by aviv on 24/01/2018.
 */

public class AnnotationSamples {

    public static void nullableSample(@NonNull String str) {

    }

    public static void resSample(@StringRes int stringResId, @DrawableRes int drawableResId) {

    }

    public static void intRangeSample(@IntRange(from = 0, to = 255) int alpha) {

    }


    @Retention(RetentionPolicy.SOURCE)
    @IntDef({SAMPLE_FIRST, SAMPLE_SECOND, SAMPLE_THIRD})
    public @interface intDefSample {

    }

    public static final int SAMPLE_FIRST = 0;
    public static final int SAMPLE_SECOND = 1;
    public static final int SAMPLE_THIRD = 2;

    @RequiresPermission(allOf = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE})
    public static void permissionSample(String dest, String source) {

    }
}
