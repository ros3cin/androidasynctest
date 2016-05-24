package com.example.renato.workload;

import com.example.renato.workload.Workload;

/**
 * Created by Renato on 21/05/2016.
 */
public class CPUIntensive1 implements Workload {
    public void execute(){
        long a = 1;
        for(long i = 0; i < 1000000000L; i++){
            a=(i*a)%7;
        }
    }
}
