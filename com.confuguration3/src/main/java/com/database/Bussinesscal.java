package com.database;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Bussinesscal {
    DataService dataService;

    public Bussinesscal(DataService dataService){
        super();
        this.dataService=dataService;
    }
    public int findMax() {
        System.out.println("maxval is");
        return Arrays.stream(dataService.retriveData()).max().orElse(0);
    }


}
