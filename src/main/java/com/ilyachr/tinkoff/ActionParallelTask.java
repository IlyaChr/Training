package com.ilyachr.tinkoff;

import java.util.concurrent.RecursiveTask;

public class ActionParallelTask extends RecursiveTask<Integer> {

    int currentPos;
    int finalPos;

    public ActionParallelTask(int currentPos, int finalPos) {
        this.currentPos = currentPos;
        this.finalPos = finalPos;
    }

    @Override
    protected Integer compute() {
        if (currentPos == finalPos) {
            return 1;
        } else {
            if (currentPos + 2 <= finalPos) {
                return new ActionParallelTask(currentPos + 1, finalPos).join() + new ActionParallelTask(currentPos + 2, finalPos).join();
            } else {
                return new ActionParallelTask(currentPos + 1, finalPos).join();
            }
        }
    }
}



