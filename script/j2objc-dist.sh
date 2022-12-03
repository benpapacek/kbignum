#!/bin/bash
set -ex

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ROOT_DIR="$SCRIPT_DIR/.."

J2OBJC_DIST_DIR="$ROOT_DIR/../j2objc/dist"

cd $ROOT_DIR

rm -rf ./j2objc
mkdir -p ./j2objc/include/java/
mkdir -p ./j2objc/lib/simulator

cp $J2OBJC_DIST_DIR/include/*.h ./j2objc/include/
cp -r $J2OBJC_DIST_DIR/include/java/lang ./j2objc/include/java/lang
cp -r $J2OBJC_DIST_DIR/include/java/math ./j2objc/include/java/math
cp -r $J2OBJC_DIST_DIR/include/java/util ./j2objc/include/java/util
cp $J2OBJC_DIST_DIR/lib/simulator/libjre_core.a ./j2objc/lib/simulator/

echo
echo "DONE"