package be.nmine.challenges.documentation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ ElementType.TYPE })
public @interface BusinessDomain {

    Domain value() default Domain.ALLOCATION;

}
