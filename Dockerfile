FROM openjdk:17
LABEL authors="bilal"
ADD target/SpringK8SDeployment-0.0.1-SNAPSHOT.jar spring-k8s-deployment.jar
ENTRYPOINT ["java", "-jar","/spring-k8s-deployment.jar"]