# Exercise:
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

# Solution notes:
My solution is based on the fact that knowing one member of the sum is enough to determine the expected other member.
For example if k is 7 and we know that 1 is in the list, it is enough to check whether 6 is in the list.
So one iteration on the list will be enough.

# Runtime & space:
For list with length n:
- The runtime is O(n) (as Integers are expected to be well disributed in a HashSet).
- Additional memory for the HashSet is allocated.
In the worst case all the elements are different in the list and we have to store each number in it, that is O(n) space.

# Possible improvements & generalizations:
- Extension of the method for non-integers.
- Accept any Collection as parameter.
- It is an interesting question what to modify in the solution if we are interested whether there are 3 numbers which
add up to k instead.  
One obvious solution is to call this method n times for each element and the list with that element removed. This would
have O(n^2) runtime.  
If we are interested if m numbers are add up to k instead the same method recursively would be O(n^m).  
It is not obvious that there are no faster methods for these generalized problems. But as an intuition for m=3 if we
know k and one of the numbers, we have to solve the same problem to determine if that number is in a 3 member sum or not.