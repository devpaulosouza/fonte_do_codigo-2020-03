#!/bin/bash

javac Maze.java

java Maze < input.txt > output.txt
diff output.txt expected.1.txt > test.output.1.txt

[ -s test.output.1.txt ] && echo "falhou no teste 1" || echo "teste 1 OK"


java Maze < input2.txt > output2.txt
diff output2.txt expected.2.txt > test.output.2.txt
[ -s test.output.2.txt ] && echo "falhou no teste 2" || echo "teste 2 OK"

rm test.output*
rm output*
