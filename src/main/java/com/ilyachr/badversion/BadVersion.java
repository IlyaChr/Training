package com.ilyachr.badversion;

import java.util.function.Predicate;

/**
 * 278. First Bad Version
 */
public class BadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        return findFirstBadVersion(0, n, this::isBadVersion);
    }

    public int findFirstBadVersion(int a, int b, Predicate<Integer> isBadVersion) {

        if (a == b) {
            return -1;
        }

        int pos = b - Math.abs(b - a) / 2;

        boolean isCurrentBadVersion = isBadVersion.test(pos);
        boolean isPreviousBadVersion = pos > 1 && isBadVersion.test(pos - 1);

        if (isCurrentBadVersion && !isPreviousBadVersion) {
            return pos;
        }

        if (isCurrentBadVersion) {
            return findFirstBadVersion(a, pos, isBadVersion);
        } else {
            return findFirstBadVersion(pos, b, isBadVersion);
        }

    }

}
