package com.codingproblems.google;

import java.util.List;

public interface SumChecker {

    /**
     * Returns {@code true} iff there exists 2 numbers in {@param numbers} which add up to {@param k}
     */
    boolean isSumOfTwo(List<Integer> numbers, int k);
}
