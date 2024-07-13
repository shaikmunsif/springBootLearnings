package com.coadingShuttle.week1.homeWork.IntroductionToSpringBootHomeWork;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="type.syrup", havingValue = "chocolate")
public class ChocoFlavouredSyrup implements  Syrup{

    @Override
    public String getSyrupType() {
        return "Choco Flavoured Syrup";
    }
}
