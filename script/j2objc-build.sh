#!/bin/bash
set -ex

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ROOT_DIR="$SCRIPT_DIR/.."

# this assumes the j2objc github project is in the parent directory
# git clone https://github.com/google/j2objc.git
J2OBJC_DIR="$ROOT_DIR/../j2objc"

cd $J2OBJC_DIR

# change as appropriate
export PROTOBUF_ROOT_DIR=/opt/homebrew/Cellar/protobuf/21.9_1

export J2OBJC_ARCHS="iphone64 simulator64"

make clean && make -j8 all_dist

echo
echo "DONE"