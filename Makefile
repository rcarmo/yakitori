deps:
	mvn package

build:
	mvn compile

serve:
	java -jar target/yakitori-1.0-SNAPSHOT-jar-with-dependencies.jar