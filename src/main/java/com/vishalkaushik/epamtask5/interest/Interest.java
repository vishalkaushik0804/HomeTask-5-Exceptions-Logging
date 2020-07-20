package com.vishalkaushik.epamtask5.interest;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {

    private static Scanner sc;
    private static float principle;
    private static float time;
    private static float rate;
    private static float res;
    private static float res1;
    private static final Logger LOGGER = LogManager.getLogger(Interest.class);

    public static void main(String args[]) {
        //LOGGER.info("hello world!!!");

        sc = new Scanner(System.in);

        LOGGER.info("enter principle amount");
        principle = sc.nextFloat();
        LOGGER.info("enter time period");
        time = sc.nextFloat();
        LOGGER.info("enter rate of interest");
        rate = sc.nextFloat();
        /*creating objects for class*/
        SimpleCompoundInterest obj = new SimpleCompoundInterest();
        res = obj.SimpleInterest(principle, time, rate);
        LOGGER.info("SimpleInterest=" + res);
        res1 = obj.CompoundInterest(principle, time, rate);
        LOGGER.info("CompoundInterest=" + res1);

    }
}
