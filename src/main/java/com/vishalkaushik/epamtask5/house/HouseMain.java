package com.vishalkaushik.epamtask5.house;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseMain {

    private static Scanner sc;
    private static float totalArea;
    private static int ch;
    private static float automated_res;
    private static float above_res;
    private static float standard_res;
    private static float high_std_materials;
    private static final Logger LOGGER = LogManager.getLogger(HouseMain.class);

    public static void main(String args[]) {
        /* function for calculating total house estimation cost*/
        recheck();
    }

    private static void recheck() {
        // TODO Auto-generated method stub
        sc = new Scanner(System.in);

        LOGGER.info("Enter total area of house");
        totalArea = sc.nextFloat();
        LOGGER.info("Do you want fully automated home if yes enter 1 orelse enter 0");
        ch = sc.nextInt();
        CostEstimation obj = new CostEstimation();
        if (ch == 1) {
            automated_res = obj.automated_home(totalArea);
            LOGGER.info("Automated home cost estimation=" + automated_res);
            LOGGER.info("Do you want to continue? if yes enter 1 else enter 0");
            {
                int y = sc.nextInt();
                if (y == 1) {
                    recheck();
                } else {
                    LOGGER.info("Thank you!");
                }

            }
        } else {
            LOGGER.info("For standard materials enter:2\n"
                    + "For above standard materials enter:3\n"
                    + "For high standard materials enter:4");
            ch = sc.nextInt();
            if (ch == 2) {

                standard_res = obj.cost_estimation(totalArea, 1200);
                LOGGER.info("Standard materials cot estimation=" + standard_res + "rs");
                LOGGER.info("Do you want to continue? if yes enter 1 else enter 0");
                {
                    int y = sc.nextInt();
                    if (y == 1) {
                        recheck();
                    } else {
                        LOGGER.info("Thank you!");
                    }

                }
            } else if (ch == 3) {
                above_res = obj.cost_estimation(totalArea, 1500);
                LOGGER.info("Above standard cost estimation=" + above_res + "rs");
                LOGGER.info("Do you want to continue? if yes enter 1 else enter 0");
                {
                    int y = sc.nextInt();
                    if (y == 1) {
                        recheck();
                    } else {
                        LOGGER.info("Thank you!");
                    }

                }
            } else if (ch == 4) {
                high_std_materials = obj.cost_estimation(totalArea, 1800);
                LOGGER.info("high standard materials cost estimation=" + high_std_materials + "rs");
                LOGGER.info("do you want to continue? if yes enter 1 else enter 0");
                {
                    int y = sc.nextInt();
                    if (y == 1) {
                        recheck();
                    } else {
                        LOGGER.info("Thank you!");
                    }

                }

            }
        }
    }

}
