#!/bin/bash

positiveCount=0
negativeCount=0
array=($1 $2 $3 $4)
for num in $array
do
if [[ $num =~ ^[[:digit:]]+? ]]
then
    positiveCount=$(( $positiveCount + 1 ))
else
    negativeCount=$(( $negativeCount + 1 ))
fi
done
echo "There are ${positiveCount} positive numbers and ${negativeCount} negative numbers."
