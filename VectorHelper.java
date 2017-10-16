

package com.company;


import java.util.ArrayList;
import java.util.List;

/**
 * this class implements a Vector of integers.
 * @author Bouchebaba/Tayeb Cherif
 * @version 1.0
 *
 */

public class VectorHelper {

    public int vector[] ;


    /**
     * This method creates a vector from an undefined number of integers.
     * @param vect undefined number of integers used to create the vector.
     */
    public VectorHelper(int ... vect){

        vector = new int[vect.length];

        for (int i=0; i<vect.length; i++){
            vector[i] = vect[i];
        }

    }

    /**
     * This method sorts the vector in a raising order.
     */

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

    /**
     * This method adds a vector to the caller vector.
     * @param vect Vector to be added to the caller vector.
     * @throws Exception Throws an Exception if the vectors are not equally sized.
     */

    public void add(VectorHelper vect) throws  Exception{
        if (vect.vector.length != this.vector.length)
            throw new Exception();

        for (int i =0; i<this.vector.length; i++){
            this.vector[i] += vect.vector[i];
        }
    }

    /**
     *
     */
    public void reverse(){
        int l = vector.length-1;

        for (int i=0; i< l/2; i++){
            int tmp = vector[i];
            vector[i] = vector[l-i];
            vector[l-i] = tmp;
        }
    }


}
