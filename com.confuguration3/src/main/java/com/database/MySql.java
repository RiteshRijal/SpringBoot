package com.database;

import org.springframework.stereotype.Component;

@Component
public class MySql implements DataService {

    public int[] retriveData() {
        return new int[] {11,22,33,44,55,66,77};
    }

}
