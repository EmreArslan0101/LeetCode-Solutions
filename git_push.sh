#!/bin/sh

git status
git add .
git commit -m $1
git push -u origin main
