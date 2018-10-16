#!/bin/bash

text=""
expr=""

for ((i=1; i<=33; i++)); do
	text="${text}a"
	expr="a?${expr}a"
	echo
	echo "n = $i"
	echo

	echo -e "\e[96mperl -e '… =~ /$expr/"
	time ( echo "$text" | perl -e "'$text' =~ /$expr/" )
	echo -e "\e[39m"

	echo -e "\e[93mgrep -P '$expr'"
	time ( echo "$text" | grep -P "$expr" )
	echo -e "\e[39m"

	echo -e "\e[92megrep '$expr'"
	time ( echo "$text" | egrep "$expr" )
	echo -e "\e[39m"
done
