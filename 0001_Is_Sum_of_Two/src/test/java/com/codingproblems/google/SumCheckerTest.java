package com.codingproblems.google;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumCheckerTest {

  @Test
  void test_example_from_readme() {
    assertTrue(SumChecker.isSumOfTwo(List.of(10, 15, 3, 7), 17));
  }

  @Test
  void test_true() {
    assertTrue(SumChecker.isSumOfTwo(List.of(1, 16, 3), 4));
  }

  @Test
  void test_false() {
    assertFalse(SumChecker.isSumOfTwo(List.of(1, 16, 3), 10));
  }

  @Test
  void test_negative_number() {
    assertTrue(SumChecker.isSumOfTwo(List.of(-18, 0, 35), 17));
  }

  @Test
  void test_list_null() {
    assertThrows(IllegalArgumentException.class, () -> SumChecker.isSumOfTwo(null, 15));
  }

  @Test
  void test_list_contains_null() {
    assertTrue(SumChecker.isSumOfTwo(Stream.of(1, null, 3, 6).collect(Collectors.toList()), 4));
  }

  @Test
  void test_overflowing_integers_are_not_accepted() {
    assertFalse(SumChecker.isSumOfTwo(List.of(Integer.MAX_VALUE, 1), Integer.MIN_VALUE));
  }
}