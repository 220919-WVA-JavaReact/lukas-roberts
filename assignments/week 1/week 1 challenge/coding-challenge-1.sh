#!/bin/bash

query_pokedex () {
    exec < pokedex.csv
    read header
    while IFS="," read -r name location lvl bll
    do
	echo "Pokemon Caught: ${name}"
	echo "Route Caught: ${location}"
	echo "Pokemon Level: ${lvl}"
	echo "Ball Used: ${bll}"
	echo "<--------------------->"
    done
}

echo "Welcome to your Pokedex!"
echo "How can I assist you today?"
echo "    1.) Add entry to Pokedex"
echo "    2.) View Pokemon caught"
echo "    3.) Search by Name"
read menu

while [[ $menu != '1' && $menu != '2' && $menu != '3' ]]
do
    echo "Not a valid option."
    echo "Welcome to your Pokedex!"
    echo "How can I assist you today?"
    echo "    1.) Add entry to Pokedex"
    echo "    2.) View Pokemon caught"
    echo "    3.) Search by Name"
    read menu2
    menu=$menu2
done

if [ $menu == 1 ]
then
    echo "Please enter a pokemon to be added to your pokedex."
    read -p "Which pokemon did you catch?" pokemon
    read -p "On which route did you catch this pokemon?" route
    read -p "What level is the pokemon?" level

    echo "Which Pokeball did you use to catch them?"
    echo "    1.) Poke Ball    2.) Great Ball"
    echo "    3.) Ultra Ball   4.) Master Ball"
    read ball

    while [[ $ball != 1 && $ball != 2 && $ball != 3 && $ball != 4 ]]
    do
        echo "Not a valid option."
        echo "Which Pokeball did you use to catch them?"
        echo "    1.) Poke Ball    2.) Great Ball"
        echo "    3.) Ultra Ball   4.) Master Ball"
        read ball2
        ball=$ball2
    done

    if [ $ball == 1 ]
    then
        ball="Poke Ball"
    elif [ $ball == 2 ]
    then
        ball="Great Ball"
    elif [ $ball == 3 ]
    then
        ball="Ultra Ball"
    else
        ball="Master Ball"
    fi

    echo $pokemon,$route,$level,$ball >> pokedex.csv

elif [ $menu == 2 ]
then
    query_pokedex
else
    read -p "Which pokemon would you like to search for?" search
    query_pokedex | grep -A4 "Pokemon Caught: ${search}"
fi


