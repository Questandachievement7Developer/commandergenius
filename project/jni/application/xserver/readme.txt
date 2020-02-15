You will need to install some packages to your Debian/Ubuntu first.

Install following packages, assuming fresh Ubuntu installation for x86_64 architecture:
=================================
sudo dpkg --add-architecture i386
sudo apt-get update
sudo apt-get install bison xfonts-utils \
curl autoconf automake libtool libtool-bin pkg-config \
libjpeg-dev libpng-dev git locales \
make zip
==================================
Install Android NDK r20 > and Android SDK with Android 10.0 framework or above and they must be in your $PATH.

Download SDL repo, select xserver project, and build it:
================================
git clone https://github.com/Questandachievement7Developer/commandergenius.git sdl-android
cd sdl-android
git submodule update --init --recursive
./build.sh xserver

Busybox is precompiled, extracted from here:
https://bintray.com/termux/termux-packages-24/busybox
