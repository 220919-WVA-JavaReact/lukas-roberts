#!/bin/bash

echo "Please enter the information prompted below to create an account."
echo "First name:"
read fname
echo "Last name:"
read lname
echo "E-mail address:"
read email
echo "Username:"
read username
echo "Password"
read password

exec < $1
read header
while IFS="," read -r id first last mail user pw
do
    x=$id
done
y=$(( $x + 1 ))

echo $y,$fname,$lname,$email,$username,$password >> $1
