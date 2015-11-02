#!/bin/bash

LIB=target/lib

#SPEC_FILE=http://cybertaxonomy.eu/eu-bon/utis/api-docs/default/utis-controller.json
SPEC_FILE=http://127.0.0.1:8080/eubon-utis/api-docs/default/utis-controller.json

CODEGEN_CONF=./src/main/resources/swagger-codegen-conf.json
TEMPLATE=./src/main/resources/templates/Java

echo "starting client creation"
mvn clean dependency:copy
java -jar $LIB/swagger-codegen-cli.jar config-help -l java

# curl -s -o src/main/resources/utis-controller.json $SPEC_FILE

echo "generating client sources"
java -jar $LIB/swagger-codegen-cli.jar generate \
  -i $SPEC_FILE -l java \
  -o ./target/client/src/java/ \
  -c $CODEGEN_CONF \
  -t $TEMPLATE
  
echo "building client project"

cd ./target/client/src/java/

mvn deploy