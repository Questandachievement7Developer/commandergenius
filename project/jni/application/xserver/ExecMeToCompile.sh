#!/bin/sh
git clone https://Questandachievement7Developer/commandergenius.git sdl-android
cd sdl-android
git submodule update --init --recursive
./build.sh xserver
