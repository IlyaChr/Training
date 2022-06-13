package com.ilyachr.badversion;

import com.ilyachr.badversion.BadVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    @Test
    void firstBadVersion() {

        BadVersion firstBadVersion = new BadVersion();

        assertEquals(4, firstBadVersion.findFirstBadVersion(0, 5, n -> n >= 4));
        assertEquals(12, firstBadVersion.findFirstBadVersion(0, 30, n -> n >= 12));
        assertEquals(-1, firstBadVersion.findFirstBadVersion(0, 10, n -> false));

    }
}