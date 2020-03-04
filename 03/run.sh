#!/bin/bash

javac Chocolate.java

java Chocolate < input.1.txt > output.1.txt
diff output.1.txt expected.1.txt > diff.1.txt

[ -s diff.1.txt ] && echo "falhou no teste 1" || echo "teste 1 OK"


java Chocolate < input.2.txt > output.2.txt
diff output.2.txt expected.2.txt > diff.2.txt

[ -s diff.2.txt ] && echo "falhou no teste 2" || echo "teste 2 OK"


java Chocolate < input.3.txt > output.3.txt
diff output.3.txt expected.3.txt > diff.3.txt

[ -s diff.3.txt ] && echo "falhou no teste 3" || echo "teste 3 OK"

rm output*
rm diff*
