
# RealDecoy Black Jack Game

![enter image description here](http://www.safeguardchemical.com/_images/logo_set/logos_blackjack.png)

## Overview

This is a java based console application which implements the black jack game.

## Executing The Application

The instructions below describes the various methods which can be used
to execute the application:

### Run using the “docker run” command

To execute the application using docker run, type the following command
in your terminal:

    docker ​run​ -it denisdbell/blackjack:1.0

You should see the following output displayed to stdout:

### Run using maven

The application uses the maven as it's build and dependency management tool. To run the application using maven perform the steps below:

**1) Clone the repository:**

git clone https://github.com/denisdbell/blackjack.git

**2) Navigate to the blackjack folder:**

cd blackjack

**3) Create the jar:**

mvn clean package

**4) Run the jar:**

java -jar target/blackjack*.jar

Thanks for reading, I hope you enjoy playing the game!












