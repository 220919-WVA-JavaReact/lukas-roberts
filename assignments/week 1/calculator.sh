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

if [[ $2 != + && $2 != - && $2 != \* && $2 != / ]]
then
    if [[ $1 =~ ^[+-]?[[:digit:]]+$ && $3 =~ ^[+-]?[[:digit:]]+$ ]]
    then
	echo "Invalid operator"
    else
	echo "Invalid operator and number(s)"
    fi
elif [[ $1 =~ ^[+-]?[[:digit:]]+$ && $3 =~ ^[+-]?[[:digit:]]+$ ]]
    then
    let x=$1$2$3
    echo "${1} ${2} ${3} = ${x}"
else
    echo "Invalid number"
fi
