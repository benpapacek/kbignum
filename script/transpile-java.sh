#!/bin/bash
set -ex

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ROOT_DIR="$SCRIPT_DIR/.."

J2OBJC_DIR="$ROOT_DIR/j2objc"

SOURCES_DIR="$ROOT_DIR/kbignum-java/src/main/java"
IOS_SRC_DIR=$ROOT_DIR/ios/src

rm -rf "$IOS_SRC_DIR"
mkdir -p "$IOS_SRC_DIR"

cd ${ROOT_DIR}

SRC_JAVA_FILES=$(eval find ${SOURCES_DIR} -name "*.java")

${J2OBJC_DIR}/j2objc -d ${IOS_SRC_DIR} ${SRC_JAVA_FILES}

echo
echo "DONE"