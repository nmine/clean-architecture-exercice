package be.nmine.challenges.documentation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ ElementType.PACKAGE, ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
public @interface GuidedTour {

    String name();

    String description() default "";

    int rank() default 0;
}
