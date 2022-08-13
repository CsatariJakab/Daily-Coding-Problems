package com.codingproblems.google.sumoftwo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumCheckerImplTest {

  @Test
  void test_example_from_readme() {
    assertTrue(SumCheckerImpl.isSumOfTwo(List.of(10, 15, 3, 7), 17));
  }

  @Test
  void test_true() {
    assertTrue(SumCheckerImpl.isSumOfTwo(List.of(1, 16, 3), 4));
  }

  @Test
  void test_false() {
    assertFalse(SumCheckerImpl.isSumOfTwo(List.of(1, 16, 3), 10));
  }

  @Test
  void test_negative_number() {
    assertTrue(SumCheckerImpl.isSumOfTwo(List.of(-18, 0, 35), 17));
  }

  @Test
  void test_list_null() {
    assertThrows(IllegalArgumentException.class, () -> SumCheckerImpl.isSumOfTwo(null, 15));
  }

  @Test
  void test_list_contains_null() {
    assertTrue(SumCheckerImpl.isSumOfTwo(Stream.of(1, null, 3, 6).collect(Collectors.toList()), 4));
  }

  @Test
  void test_overflowing_integers_are_not_accepted() {
    assertFalse(SumCheckerImpl.isSumOfTwo(List.of(Integer.MAX_VALUE, 1), Integer.MIN_VALUE));
  }
}