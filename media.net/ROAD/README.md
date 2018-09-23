# Road Repairs

In a country, there are N cities and M bi-directional roads. Some of the roads of the country are broken and need repairing. The king of the country wants a good transportation system, so he wants that all the cities of the country must be connected i.e. there must be at least one path to reach a city from any other city.

The king is also low on budget, so he wants to repair the roads in such a way that the cities of the country must be connected and the cost of repairing is as minimal as possible.

You have to find the minimum cost of repairing the roads such that the cities become connected.


## Input Format:

First line of each test case contains two integers N and M denoting the no. of cities and no. of bi-directional roads. Each of next M lines contains the description of a road in following format:

    U V 0
    OR
    U V 1 X

First two integers U and V denote the cities that are getting directly connected by this road. If third integer is 0, it means the road is OK and needs no repairing. If the third integer is 1, it means the road needs repairing and the cost of repairing that road is denoted by a fourth integer X.


## Output Format:

For each test case, output a single integer denoting the minimum cost of repairing in order to make the cities connected.

## Note:

1. The input always guarantees that there is at least a way to make all the cities of country connected.
2. There is at most one road between any two distinct cities.
3. There is no road from a city to itself.

## Constraints:
    1 <= N <= 10000
    1 <= M <= 100000
    1 <= U,V <= N
    1 <= X <= 1000

## Examples:

### Input:
    4 6
    1 2 0
    1 3 1 4
    1 4 1 1
    2 3 1 2
    2 4 1 5
    3 4 1 3


### Output:
    3