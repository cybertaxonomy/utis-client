#!/bin/bash

LIB=target/lib

SPEC_FILE=http://cybertaxonomy.eu/eu-bon/utis/api-docs/default/utis-controller.json

echo "starting client creation"
mvn clean dependency:copy
java -jar $LIB/swagger-codegen-cli.jar config-help -l java

# curl -s -o src/main/resources/utis-controller.json http://cybertaxonomy.eu/eu-bon/utis/api-docs/default/utis-controller.json

echo "generating client sources"
java -jar $LIB/swagger-codegen-cli.jar generate \
  -i http://cybertaxonomy.eu/eu-bon/utis/api-docs/default/utis-controller.json -l java \
  -o ./target/client/src/java/ \
  -c ./src/main/resources/swagger-codegen-conf.json
  
echo "building client project"

cd ./target/client/src/java/
mvn install