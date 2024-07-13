package com.coadingShuttle.week1.homeWork.IntroductionToSpringBootHomeWork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    Frosting frosting;
    @Autowired
    Syrup syrup;

    public String bakeCake(){
        return frosting.getFrostingType()+" "+syrup.getSyrupType();
    }
}
