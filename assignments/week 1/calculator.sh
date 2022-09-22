#!/bin/bash

# ~= ^[[:digit:]]+$ 

#if [[ $1 =~ [[:digit:]] && $3 =~ [[:digit:]] ]]
#then

#  case $2 in
#    +)
#	let x=$1+$3
#	echo "${1} ${2} ${3} = ${x}"
#	;;
#    -)
#	let x=$1-$3
#	echo "${1} ${2} ${3} = ${x}"
#	;;
#    x)
#	let x=$1*$3
#	echo "${1} * ${3} = ${x}"
#	;;
#    /)
#	let x=$1/$3
#	echo "${1} ${2} ${3} = ${x}"
#	;;
#    *)
#	echo "Not a valid operator."
#	;;
#  esac

#else
#  echo "Not a valid number."
#fi

echo "Let's do some math!"
echo "Enter an expression to be evaluated."
echo "   e.g. 1 + 1 or 2 * 4"
read num1 operator num2



if [[ $operator != + && $operator != - && $operator != \* && $operator != / ]]
then
    if [[ $num1 =~ ^[+-]?[[:digit:]]+$ && $num2 =~ ^[+-]?[[:digit:]]+$ ]]
    then
	echo "Invalid operator"
    else
	echo "Invalid operator and number(s)"
    fi
elif [[ $num1 =~ ^[+-]?[[:digit:]]+$ && $num2 =~ ^[+-]?[[:digit:]]+$ ]]
    then
    x=$(($num1 $operator $num2))
    echo "${num1} ${operator} ${num2} = ${x}"
else
    echo "Invalid number"
fi
