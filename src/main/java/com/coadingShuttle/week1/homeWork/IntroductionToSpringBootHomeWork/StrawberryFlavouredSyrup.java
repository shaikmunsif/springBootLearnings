package com.coadingShuttle.week1.homeWork.IntroductionToSpringBootHomeWork;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="type.syrup", havingValue = "strawberry")
public class StrawberryFlavouredSyrup implements  Syrup{

    @Override
    public String getSyrupType() {
        return "StrawBerry Flavoured Syrup";
    }
}
