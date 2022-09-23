#!/bin/bash

echo "Factorials are fun!"
echo "Please enter a number!"
read number
answer=$number
for (( i=$number - 1; i>1; i-- ))
do
    answer=$(( $answer * $i ))
done
echo $answer


