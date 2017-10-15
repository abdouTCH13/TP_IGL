package com.company;

import java.util.ArrayList;
import java.util.List;

public class VectorHelper {

    int vector[] ;



    public VectorHelper(int ... vect){

        vector = new int[vect.length];

        for (int i=0; i<vect.length; i++){
            vector[i] = vect[i];
        }


    }


}
