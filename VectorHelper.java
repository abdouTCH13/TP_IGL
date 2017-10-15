package com.company;

import java.util.ArrayList;
import java.util.List;

public class VectorHelper {

    public int vector[] ;



    public VectorHelper(int ... vect){

        vector = new int[vect.length];

        for (int i=0; i<vect.length; i++){
            vector[i] = vect[i];
        }

    }


    public void sort(){
            boolean sorted = false, permut = false;
            int i=0;
        while (!sorted)
        {
            permut = false;
            for ( i=0; i<vector.length ; i++){

                if (i+1 < vector.length){
                    if (vector[i]>vector[i+1]){
                        int tmp = vector[i];
                        vector[i] = vector[i+1];
                        vector[i+1] = tmp;
                        permut = true;

                    }
                }


            }
            if (!permut)
                sorted = true;

        }

    }

    public void add(VectorHelper vect) throws  Exception{
        if (vect.vector.length != this.vector.length)
            throw new Exception();

        for (int i =0; i<this.vector.length; i++){
            this.vector[i] += vect.vector[i];
        }
    }


}
