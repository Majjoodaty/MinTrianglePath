# Minimum triangle path
This App process a given triangular structure of numbers, and find the minimum path sum from top to bottom.

Problem example:

Consider the following triangle of numbers:

```
    7
   6 3
  3 8 5
11 2 10 9
```

**A path through the triangle is a sequence of adjacent nodes, one
from each row, starting from the top. So, for instance, 7 → 6 → 3 →
11 is a path down the left hand edge of the triangle.
A minimal path is defined as one whose sum of values in its
nodes is no greater than for any other path through the triangle.
In this case, 7 + 6 + 3 + 2 = 18 is the minimal path.
The triangle is stored in a text file with each row on a separate line, and spaces between the numbers.**

## How it works
The program takes as an input a text_file name from the console and print out the minimal path.

### Run application
`sbt "run data_small.txt"`

### Run Tests
`sbt test`