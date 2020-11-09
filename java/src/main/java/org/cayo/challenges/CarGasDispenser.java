package org.cayo.challenges;

public class CarGasDispenser {

    public static int solution(int[] A, int X, int Y, int Z) {
        int time = 0;
        int[] dispenserAmount = {X, Y, Z};
        int[] dispenserOccupied = {0, 0, 0};
        return solutionRecur(A, 0, dispenserOccupied, dispenserAmount, time);
    }

    private static int solutionRecur(int[] carDemand, int indexCar, int[] dispenserOccupiedTime, int[] dispenserAmount, int time) {
        boolean allDispenserFree = true;
        boolean anyDispenser = false;
        for (int indexDisp = 0; indexDisp < dispenserOccupiedTime.length; indexDisp++) {
            if (dispenserOccupiedTime[indexDisp] < 0) {
                dispenserOccupiedTime[indexDisp]++;
            }
            if (dispenserOccupiedTime[indexDisp] < 0) {
                allDispenserFree = false;
            }
            if (dispenserAmount[indexDisp] >= carDemand[indexCar]) {
                anyDispenser = true;
            }
        }
        if (allDispenserFree && !anyDispenser) { // recursion stop condition
            return -1;
        }
        car:
        for (; indexCar < carDemand.length; indexCar++) {
            for (int indexDisp = 0; indexDisp < dispenserOccupiedTime.length; indexDisp++) {
                if (dispenserOccupiedTime[indexDisp] == 0 && dispenserAmount[indexDisp] >= carDemand[indexCar]) {
                    dispenserOccupiedTime[indexDisp] = -carDemand[indexCar];
                    dispenserAmount[indexDisp] -= carDemand[indexCar];
                    carDemand[indexCar] = time;
                    continue car;
                }
            }
            return solutionRecur(carDemand, indexCar, dispenserOccupiedTime, dispenserAmount, time + 1);
        }
        return time;
    }

}
