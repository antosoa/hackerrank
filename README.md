# hackerrank
Code practice on (https://www.hackerrank.com)


## [Big O notation](https://github.com/antosoa/hackerrank/blob/master/Learning%20Big%20O%20Notation%20With%20O(n)%20Complexity%20-%20DZone%20Performance.pdf)

###  for example the code below is a O(1)
We are starting at a constant less than the middle of the array, and going to a constant more.

```java
int sumTheMiddle(int[] arr) {
  int range = 100;
  int start = arr.length/2 - range/2;
  int sum = 0;
  for (int i=start; i< start+range; i++) 
  {
    sum += arr[i];
  }
  return sum;
}
```


## Statistics
- [std deviation](https://github.com/antosoa/hackerrank/blob/master/Standard-Deviation)

```java
 for (int i=0; i<a.length; i++)
     {
         mean+= a[i];
     }
      mean = mean/a.length;
      for (int i =0; i<a.length; i++)
      {
        std+= Math.pow((a[i]-mean), 2);
      }
        return Math.sqrt(std/a.length); 
```
- [conditional probability](https://github.com/antosoa/hackerrank/blob/master/Day%203_%20Conditional%20Probability%20_%20HackerRank.pdf)
- [Binomial distribution](https://github.com/antosoa/hackerrank/blob/master/Day%204_%20Binomial%20Distribution%20I%20_%20HackerRank.pdf)
- [Poisson distribution](https://github.com/antosoa/hackerrank/blob/master/Day%205_%20Poisson%20Distribution%20I%20_%20HackerRank.pdf) <img src="https://latex.codecogs.com/svg.latex?f(x)%20=%20\frac{\lambda^x*e^{-\lambda}}{%20x!}"/>
- [Geometric distribution](https://github.com/antosoa/hackerrank/blob/master/Day%204_%20Geometric%20Distribution%20I%20_%20HackerRank.pdf)
- [Normal Distribution](http://onlinestatbook.com/2/calculators/normal_dist.html) 
- [Central Limit Theorem](https://github.com/antosoa/hackerrank/blob/master/CentralLimitTheorem.py)

## Algorithms 
- [Warmup](https://github.com/RyanFehr/HackerRank#warmup)
- [dynamic array](https://github.com/antosoa/hackerrank/blob/master/hackerrankproject/src/datastructures/dynamicarray/Solution.java)       graphs
- [Implementation](https://github.com/RyanFehr/HackerRank#implementation)
- [Strings](https://github.com/RyanFehr/HackerRank#strings)
- [Sorting](https://github.com/RyanFehr/HackerRank#sorting)
- [Search](https://github.com/RyanFehr/HackerRank#search)
- [Graph Theory](https://github.com/RyanFehr/HackerRank#graph-theory)
- [Greedy](https://github.com/RyanFehr/HackerRank#greedy)
- [Dynamic Programming](https://github.com/RyanFehr/HackerRank#dynamic-programming)
- [Constructive Algorithms](https://github.com/RyanFehr/HackerRank#constructive-algorithms)
- [Bit Manipulation](https://github.com/RyanFehr/HackerRank#bit-manipulation)
- [Recursion](https://github.com/RyanFehr/HackerRank#recursion)
- [Game Theory](https://github.com/RyanFehr/HackerRank#game-theory)
- [NP Complete](https://github.com/RyanFehr/HackerRank#np-complete)

## [DataStructures](https://github.com/antosoa/hackerrank/tree/master/hackerrankproject/src/datastructures)
- [Arrays](https://github.com/RyanFehr/HackerRank#arrays)
- [Linked Lists](https://github.com/RyanFehr/HackerRank#linked-lists)
- [Trees](https://github.com/RyanFehr/HackerRank#trees)
- [Balanced Trees](https://github.com/RyanFehr/HackerRank#balanced-trees)
- [Stacks](https://github.com/RyanFehr/HackerRank#stacks)
- [Queues](https://github.com/RyanFehr/HackerRank#queues)
- [Heap](https://github.com/RyanFehr/HackerRank#heap)
- [Disjoint Set](https://github.com/RyanFehr/HackerRank#disjoint-set)
- [Multiple Choice](https://github.com/RyanFehr/HackerRank#multiple-choice)
- [Trie](https://github.com/RyanFehr/HackerRank#trie)
- [Advanced](https://github.com/RyanFehr/HackerRank#advanced)

## Mathematics
- [Fundamentals](https://github.com/RyanFehr/HackerRank#fundamentals)
- Number Theory
- Combinatorics
- Algebra
- Geometry
- Probability
- Linear Algebra Foundations



## Notes about Singly linked list in Java: 
- Linked List can be defined as a collection of objects called nodes that are randomly stored in the memory.
- A node contains two fields, i.e. data stored at that particular address and the pointer which contains the address of the next node in   the memory.
- The last node of the list contains the pointer to the null.
<p align="center">
	<img src="https://static.javatpoint.com/corebasic/programs/images/java-singly-linked-list-examples.png">
</p>


## [Nested Class](http://tutorials.jenkov.com/java/nested-classes.html)

## [Casting Object](https://stackoverflow.com/questions/5306835/casting-objects-in-java) 

## [Thread Safety](https://www.baeldung.com/java-thread-safety)
