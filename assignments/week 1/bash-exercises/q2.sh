#!/bin/bash

num1=0
num2=1

for (( i=0; i<12; i++));
do
    echo $num1
    num3=$(( $num1 + $num2 ))
    num1=$num2
    num2=$num3
    #echo $num2
done
