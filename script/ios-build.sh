#!/bin/bash
set -ex

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ROOT_DIR="$SCRIPT_DIR/.."

J2OBJC_DIR="$ROOT_DIR/../j2objc/dist"

SOURCES_DIR="$ROOT_DIR/kbignum-java/src/main/java"
IOS_SRC_DIR=$ROOT_DIR/ios/src

rm -rf "$IOS_SRC_DIR"
mkdir -p "$IOS_SRC_DIR"

cd ${ROOT_DIR}

SRC_JAVA_FILES=$(eval find ${SOURCES_DIR} -name "*.java")

${J2OBJC_DIR}/j2objc -d ${IOS_SRC_DIR} ${SRC_JAVA_FILES}

cd $ROOT_DIR/ios

rm -rf dist && mkdir dist

(rm -rf kbignum.xcodeproj && xcodegen)

xcodebuild -project kbignum.xcodeproj -target kbignum -sdk iphonesimulator -arch arm64 \
  "PRODUCT_NAME=Kbignum-iosSimulatorArm64"

xcodebuild -project kbignum.xcodeproj -target kbignum -sdk iphoneos -arch arm64 \
  "PRODUCT_NAME=Kbignum-iosArm64"

xcodebuild -project kbignum.xcodeproj -target kbignum -sdk iphonesimulator -arch x86_64 \
  "PRODUCT_NAME=Kbignum-iosX64"

rsync -a --prune-empty-dirs --include '*/' --include '*.h' --exclude '*' './src' './dist'

cp -f 'build/libKbignum-iosSimulatorArm64.a' ./dist
cp -f 'build/libKbignum-iosArm64.a' ./dist
cp -f 'build/libKbignum-iosX64.a' ./dist

TARGET_DIR="$ROOT_DIR/kbignum/src/iosMain/objc"
rm -rf $TARGET_DIR
cp -r ./dist $TARGET_DIR

echo
echo "DONE"