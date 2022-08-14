package com.codingproblems.google;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumChecker {

  /**
   * Returns {@code true} iff there exists 2 numbers in {@param numbers} which add up to {@param k}
   *
   * Overflowing addition is not accepted
   *   e.g.: returns false for numbers = [1, {@value Integer#MAX_VALUE}], k = {@value Integer#MIN_VALUE}.
   */
  public static boolean isSumOfTwo(List<Integer> numbers, int k) {
    if (numbers == null) throw new IllegalArgumentException("Param 'numbers' is null.");

    Set<Integer> alreadyChecked = new HashSet<>();
    for (Integer i : numbers) {
      if (i == null) continue;
      if (alreadyChecked.contains(k - i) && (long) (k - i) + i < Integer.MAX_VALUE) return true;
      alreadyChecked.add(i);
    }
    return false;
  }
}
