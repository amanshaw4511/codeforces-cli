# codeforces-cli
codeforces cli written in shell script for parsing contests input , output and automatic testing

## Requirements
* [pup](https://github.com/ericchiang/pup) - CLI tool for processing HTML.

## Installation
```sh
$ git clone https://github.com/amanshaw4511/codeforces-cli.git
$ cd codefores-cli
$ ./install.sh
```
## Usage
```sh
Syntax : cf-cli <contest-code>
 
Example :

$ cf-cli 1512
$ tree
.
├── a
│   ├── input1
│   ├── output1
│   ├── Solution.java
│   └── test
├── b
│   ├── input1
│   ├── output1
│   ├── Solution.java
│   └── test
├── c
│   ├── input1
│   ├── output1
│   ├── Solution.java
│   └── test
├── d
│   ├── input1
│   ├── output1
│   ├── Solution.java
│   └── test
├── e
│   ├── input1
│   ├── output1
│   ├── Solution.java
│   └── test
├── f
│   ├── input1
│   ├── output1
│   ├── Solution.java
│   └── test
└── g
├── input1
├── output1
├── Solution.java
└── test

7 directories, 28 files
```

## Testing
```sh
$ cd a
$ ls
input1  output1  Solution.java  test
$ ./test -a
--------------input1 : output1----------------
input :
4
4
11 13 11 11
5
1 4 4 4 4
10
3 3 3 3 10 3 3 3 3 3
3
20 20 10
expected output :
2
1
5
3
your output :
2
1
5
3
```
To test custom input against output
```
$ ls
input1  output1  Solution.java  test   myinput   myoutput
$ .test -t myinput myoutput
```
