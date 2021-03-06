deps:
	mvn package

deps-update-stable:
	mvn versions:use-latest-releases

deps-check-updates:
	mvn versions:display-dependency-updates

build:
	mvn compile

tidy:
	xmllint --format --recover -o pom.xml pom.xml
	mvn tidy:pom


serve:
	java -jar target/yakitori-1.0-SNAPSHOT-jar-with-dependencies.jar

bootstrap-ubuntu:
	sudo apt install \
		maven \
		libxml2-utils 
