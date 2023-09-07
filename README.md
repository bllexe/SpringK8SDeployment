# SpringK8SDeployment backend

# Getting Started

### application.yml variable you can use intellij IDEA environment Variables follow bellow in order
Edit Configurations->Environment Variables

* DB_HOST: localhost:3306
* DB_NAME: "your db name"
* username: "your username" 
* password: "your password"

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.10/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.10/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.10/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.10/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)


# Frontend Angular  AngularK8sDeployment
### first need to run ng build for create dist path.
* ng build 
# Create Docker file,paste code below
FROM nginx:alpine
COPY /dist/angular-k8s-deployment /usr/share/nginx/html

# Create docker image, should be same path

* docker build -t angular_k8s_deployment:1.0 . 

# deployment yaml file checking does angular work

* kubectl apply -f ng-deployment.yaml

* kubectl get pods
* kubectl get deployment
* kubectl get services
* kubectl get nodes -o wide   (get internal-ip)

# checking browser does angular work
* http://192.168.49.2:31000/

# delete pods,deployment and service 
* kubectl delete pods --all
* kubectl delete deployment --all
* kubectl delete services --all

