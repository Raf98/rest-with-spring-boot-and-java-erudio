package br.com.erudio.math;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo) throws Exception {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) throws Exception {
        return numberOne - numberTwo;
    }

    public Double mult(Double numberOne, Double numberTwo) throws Exception {
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo) throws Exception {
        if(numberTwo == 0){
            throw new UnsupportedMathOperationException("Can't divide by zero!");
        }

        return numberOne / numberTwo;
    }

    public Double avg(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne + numberTwo)/2;
    }

    public Double sqrt(Double numberOne) throws Exception {
        if(numberOne < 0){
            System.out.println("EXCEPTION!");
            throw new UnsupportedMathOperationException("Number should not be negative!");
        }

        return Math.sqrt(numberOne);
    }
}
