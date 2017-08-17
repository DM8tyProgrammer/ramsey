# ramsey

## Problem Statement
Gordon Ramsey, a very smart guy, like seating food.
Now, Gordon is at a restaurant and he has many different types of food to choose from. Gordon gets x amount of satisfaction and requires y amount of time to eat an item from the menu.
Given t minutes, write a java program that reads the text file and ﬁnds out the maximum satisfaction that Gordon can get from eating at the restaurant.


You will be given a text file with the following format:
```
[t][Number of items on menu]
[amount of satisfaction from eating dish 1][time taken for dish 1]
[amount of satisfaction from dish 2][time taken for dish 2]
```

## Solution

Essentially, this is 0-1 Knapsack Problem. It can be solved using Dynamic Programming technique.

### Project layout
Intuitively, The project can be divided into two parts:
1. Reading a file
   package `input` contains the all the necessary code to parse a file.
2. Solving the problem based upon file input
    package `solution` contains the all the code to solve the problem


### Building Project
This is standard maven project, can be built by using maven command:

```sh
mvn clean install
```

### Running Test
Unit tests can be run via following maven command

```sh
mvn test
```

### Running the application
The application supports reading from console, one or more file


if file is not specified as argument, the application will take input from console

```sh
java -jar target/ramsey.jar
```


if file is specified input will be taken from the file.

```sh
java -jar target/ramesey.jar <path-to-file>
```

multiple files can be specified as
```sh
java -jar target/ramsey.jar <path-to-file1> <path-to-file2>
```

