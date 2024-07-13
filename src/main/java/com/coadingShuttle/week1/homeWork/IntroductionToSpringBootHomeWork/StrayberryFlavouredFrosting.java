package com.coadingShuttle.week1.homeWork.IntroductionToSpringBootHomeWork;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="type.frosting", havingValue = "strawberry")
public class StrayberryFlavouredFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "StrawBerry flavoured Frosting";
    }
}
