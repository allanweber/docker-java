### To Build
**mvnw install dockerfile:build**


### To Publish Image
**docker push allanweber/gs-spring-boot-docker**


### To Pull The Image
**docker pull allanweber/gs-spring-boot-docker:latest**


# To Run The Container
**docker run -p 8081:8080 -d --name docker-java <IMAGE_ID>**
 
 running outside in the 8081 port