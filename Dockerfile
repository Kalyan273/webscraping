FROM openjdk-17
EXPOSE 8080
ADD out/artifacts/webscraping_jar/webscraping.jar webscraping.jar
ENTRYPOINT ["java","-jar","/webscraping.jar"]


