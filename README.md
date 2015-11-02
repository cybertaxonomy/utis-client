UTIS Client
=================

A project to automatically create a client api to utis


swagger-codegen is used as a generator. the following links provide useful documentation:

* https://github.com/swagger-api/swagger-codegen/#to-generate-a-sample-client-library 
* https://bitbucket.org/atlassian/bash-maven-plugin

the [swagger-codegen-maven-plugin](https://github.com/garethjevans/swagger-codegen-maven-plugin) is not a good option since it does not allow to supply a json configuration file

Generating the client api
---------------------------

execute ``./generate-client-code.sh`` in the project root 

Using the client api
---------------------------

In order to add the client-api to maven project add the the cybertaxonomy.org maven repository to the pom.xml:

    <repositories>
       <repository>
         <id>Cybertaxonomy.org repository</id>
         <url>http://dev.e-taxonomy.eu/mavenrepo/</url>
       </repository>
    </repositories>
    
and configure the client-api artifact as dependency

      <dependencies>
        <dependency>
            <groupId>org.cybertaxonomy</groupId>
            <artifactId>utis-client</artifactId>
            <version>1.0</version>
        </dependency>
      </dependencies>
    
