#!/bin/bash

read -p "Please enter a number." num
x=$(factor $num)
y="${x//[^[:digit:]]/}"
echo $y
if [ ${#y}%2 == 0 ]
then
	echo "${num} is a prime number"
else
	echo "${num} is not a prime number"
fi
