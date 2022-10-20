FROM openjdk:18
VOLUME /tmp
EXPOSE 8080
ADD ./target/ms1_User-0.0.1-SNAPSHOT.jar ms1_User.jar
ENTRYPOINT ["java", "-jar", "/ms1_User.jar"]