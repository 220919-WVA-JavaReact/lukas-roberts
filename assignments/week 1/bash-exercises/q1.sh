#!/bin/bash

array=()
counter=6
for (( i=0; i<$counter; i++ ))
do
    array+=$i
    echo $array
done

