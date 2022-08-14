# Exercise:
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?

# Solution notes:
At first note that without the follow-up question, one can just calculate the product of values at all indices and get
the result by iterating through the array:
```
for (int i = 0; i < arr.length; i++) {
    newArr[i] = product / arr[i];
}
```
This approach would be optimal and with runtime O(n),
and there seems to be no downside in using division as we are using int values and the product is a multiple of
any value we would divide with.

# Runtime & space:

# Possible improvements & generalizations: