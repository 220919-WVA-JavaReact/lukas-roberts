#!/bin/bash

echo "$(echo ~)"
echo "$(whoami)"
echo "today is: $(date +%D)"
echo "$(compgen -u | wc -l)"
