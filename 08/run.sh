#!/bin/bash

javac Fazenda.java

java Fazenda < input.1.txt > output.1.txt
diff output.1.txt expected.1.txt > diff.1.txt

[ -s diff.1.txt ] && echo "falhou no teste 1" || echo "teste 1 OK"


rm output*
rm diff*
