# ======================================================================
# DOCKERFILE
# CONSTRUCTION DE L'IMAGE DOCKER DU MICROSERVICE "saigneur-utilitaire"
# ======================================================================
FROM adoptopenjdk/openjdk11:alpine
LABEL maintainer = "apromac <abraham.tiene@apromac.ci>"

RUN mkdir /usr/local/microservice \
&& mkdir /usr/local/microservice/msaigneur

WORKDIR /usr/local/microservice/msaigneur
COPY target/*.jar saigneur-utilitaire.jar

EXPOSE 9004
ENTRYPOINT ["java", "-jar", "saigneur-utilitaire.jar"]
