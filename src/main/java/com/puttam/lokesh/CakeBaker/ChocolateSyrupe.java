package com.puttam.lokesh.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrupe.type",havingValue="chocolate")
public class ChocolateSyrupe implements Syrupe {
    @Override
    public void getSyrupeType() {
        System.out.println("Chocolate Syrupe");
    }
}
