#!/bin/bash

# Assign directories
project="SampleWebApplication"
ivy="/Users/peterrangelov/.ivy2/cache"
lib="/Users/peterrangelov/Documents/workspace/$project/WebContent/WEB-INF/lib"

echo $project
echo $ivy
echo $lib

# First, delete old jars in WEB-INF/lib
echo "Deleting old jars"
#cd lib
#rm -r *.jar


cd $ivy

echo "Copying to WEB-INF/lib"
find . -name \*.jar -print0 | xargs -I{} -0 cp -v {} $lib

cd $lib
find . -name '*javadoc.jar' -delete
find . -name '*sources.jar' -delete


echo "Copying to WEB-INF/lib"
say "Finished copying jars"