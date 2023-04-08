package com.ilyachr.tinkoff;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {


    private record CountKey(Integer currentPos, Integer finalPos) {

        public Integer getCurrentPos() {
            return currentPos;
        }

        public Integer getFinalPos() {
            return finalPos;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CountKey countKey = (CountKey) o;
            return Objects.equals(currentPos, countKey.currentPos) && Objects.equals(finalPos, countKey.finalPos);
        }

        @Override
        public int hashCode() {
            return Objects.hash(currentPos, finalPos);
        }
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println(countPaths(scanner.nextInt()));
    }

    protected int countPaths(int pathLength) {

        Map<CountKey, Integer> resultCash = new HashMap<>();

        return countPathRec(0, pathLength, resultCash);

        //ForkJoinPool forkJoinPool = new ForkJoinPool(8);

        //return forkJoinPool.invoke(new ActionParallelTask(0,pathLength));
    }


    protected int countPathRec(int currentPos, int finalPos, Map<CountKey, Integer> resultCash) {

        if (currentPos == finalPos) {
            return 1;
        }
        if (currentPos + 2 <= finalPos) {
            Integer result1;
            Integer result2;

            if (resultCash.containsKey(new CountKey(currentPos + 1, finalPos))) {
                result1 = resultCash.get(new CountKey(currentPos + 1, finalPos));
            } else {
                result1 = countPathRec(currentPos + 1, finalPos, resultCash);
                resultCash.put(new CountKey(currentPos + 1, finalPos), result1);
            }

            if (resultCash.containsKey(new CountKey(currentPos + 2, finalPos))) {
                result2 = resultCash.get(new CountKey(currentPos + 2, finalPos));
            } else {
                result2 = countPathRec(currentPos + 2, finalPos, resultCash);
                resultCash.put(new CountKey(currentPos + 2, finalPos), result1);
            }

            return result1 + result2;

        } else {
            if (resultCash.containsKey(new CountKey(currentPos + 1, finalPos))) {
                return resultCash.get(new CountKey(currentPos + 1, finalPos));
            } else {
                int result = countPathRec(currentPos + 1, finalPos, resultCash);
                resultCash.put(new CountKey(currentPos + 1, finalPos), result);
                return result;
            }
        }
    }


    /**
     * protected int countPathRec(int currentPos, int finalPos) {
     *
     *         if (currentPos == finalPos) {
     *             return 1;
     *         }
     *
     *         if (currentPos + 2 <= finalPos) {
     *             return countPathRec(currentPos + 1, finalPos) + countPathRec(currentPos + 2, finalPos);
     *         } else {
     *             return countPathRec(currentPos + 1, finalPos);
     *         }
     *     }
     */


}
