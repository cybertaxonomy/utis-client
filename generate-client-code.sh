#!/bin/bash

LIB=target/lib

#SPEC_FILE=http://cybertaxonomy.eu/eu-bon/utis/api-docs/default/utis-controller.json
SPEC_FILE=http://127.0.0.1:8080/eubon-utis/api-docs/default/utis-controller.json

CODEGEN_CONF=./src/main/resources/swagger-codegen-conf.json

echo "starting client creation"
mvn clean dependency:copy
java -jar $LIB/swagger-codegen-cli.jar config-help -l java

# curl -s -o src/main/resources/utis-controller.json $SPEC_FILE

echo "generating client sources"
java -jar $LIB/swagger-codegen-cli.jar generate \
  -i $SPEC_FILE -l java \
  -o ./target/client/src/java/ \
  -c $CODEGEN_CONF
  
echo "building client project"

cd ./target/client/src/java/
mvn install

# the compilation failes due to the class Classification with getthe getter getClass() 
# this is another reason to refactor the Classification in the tnrMessage
#