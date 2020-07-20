package com.vishalkaushik.epamtask5.house;

public class CostEstimation {

    public float automated_home(float totalArea) {
        /*automated house cost estimation*/
        float cost;
        cost = totalArea * 2500;
        return cost;
    }

    public float cost_estimation(float totalArea, int cost_per_sq_feet) {
        /*cost estimation*/
        float cost;
        cost = totalArea * cost_per_sq_feet;
        return cost;
    }

}
