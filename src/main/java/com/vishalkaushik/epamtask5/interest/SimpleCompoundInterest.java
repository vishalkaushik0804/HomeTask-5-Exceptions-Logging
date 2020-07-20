package com.vishalkaushik.epamtask5.interest;

public class SimpleCompoundInterest {

    public float SimpleInterest(float principle, float time, float rate) {
        float res_simpleInterest;
        /*Calculate simple interest*/
        res_simpleInterest = principle * time * rate / 100;
        return res_simpleInterest;
    }

    public float CompoundInterest(float principle, float time, float rate) {
        float res_compoundInterest;
        /* Calculate compound interest*/
        res_compoundInterest = (float) (principle * (Math.pow((1 + rate / 100), time)));
        return res_compoundInterest;
    }

}
