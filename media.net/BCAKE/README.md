# Blue Berry Cakes

## Problem description

There is a school in a village. It has N classes. One fine day, someone donated B blue berry cheese cakes to schools. Now you need to divide these cakes such that:

    Each class gets at least 1 cake.
    Each class will share the cake(s) among students.

Your aim is to minimize the maximum number of students per cake in any class.
Input

The first line of the input contains two space separated integers N and B denoting the number of classes and total number of blue berry cheese cakes, respectively. Next N lines contain number of students in each class.
Output

For each test case, output the maximum number of students who will share a cake.

## Constraints


    2 ≤ N ≤ 5*105
    N ≤ B ≤ 2*106
    1 ≤ number of students in ith class ≤ 5*106

## Examples

### Sample Input - 1

    1 2
    35

### Sample Output - 1

    18

### Sample Input - 2

    2 7
    20
    50

### Sample Output - 2

    10

### Explanation

In the 2nd sample input, two cakes go to the first class, and rest to the second. Exactly 10 students are assigned to share each of hte cakes in the most efficient way.