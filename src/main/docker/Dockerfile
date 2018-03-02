FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD blackjack*.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTIONS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTIONS -jar /app.jar" ]