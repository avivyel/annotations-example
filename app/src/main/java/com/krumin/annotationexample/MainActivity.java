package com.krumin.annotationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.krumin.processor.CustomAnnotation;

@CustomAnnotation
public class MainActivity extends AppCompatActivity {

    @CustomAnnotation
    private int mIntField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testAnnotations();
    }

    @CustomAnnotation
    private void testAnnotations() {
        AnnotationSamples.nullableSample(null);
        AnnotationSamples.resSample(3, 5);
        AnnotationSamples.intRangeSample(300);
        AnnotationSamples.permissionSample("", "");
    }
}
