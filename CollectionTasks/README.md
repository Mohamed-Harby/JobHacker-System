
### Task 1 : Simple Word Dictionary Class 
- Create a map that uses the alphabets as keys and a String as values (This collection should only contain words starting with the corresponding key).
- Develop an application that stores words into that collection.
- Elements in the words map for each alphabet should be sorted.
- Provide methods to print all the letters and corresponding words.
- Provide a method to print the words of a given letter. 


### Task 2 : Different operations on a Set
#### Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow.

The first line of input contains an integer Q denoting the no of queries. Then in the next line are Q line separated queries.

A query can be of five types 
- **a x** (inserts an element x to the set s) 
- **b** (prints the contents of the set s in increasing order) 
- **c x** (erases an element x from the set s) 
- **d x** (prints 1 if the element x is present in the set else print -1) 
- **e** (prints the size of the set s)

##### Sample Input

```
2
6
a 1
a 2
a 3
b
c 2
b
5
a 1
a 5
e
d 5
d 2
```

##### Sample Output
```
1 2 3
1 3
2
1
-1 
```