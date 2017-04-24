FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/event-service-0.0.1-SNAPSHOT.jar /app
RUN ln -sf event-service-0.0.1-SNAPSHOT.jar event-service-latest.jar

CMD java -jar /app/event-servive-latest.jar