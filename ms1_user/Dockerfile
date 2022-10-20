FROM openjdk:18
ADD ./target/ms1_User-0.0.1-SNAPSHOT.jar ms1_User.jar
VOLUME /tmp
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "/ms1_User.jar"]