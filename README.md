
# RealDecoy Black Jack Game

![enter image description here](http://www.safeguardchemical.com/_images/logo_set/logos_blackjack.png)

## Overview

This is a java based console application which implements the black jack game.

## Executing The Application

The instructions below describes the various methods which can be used
to execute the game:

### Run using the docker 
![docker icon](https://microsoftcloudexplorer.gallerycdn.vsassets.io/extensions/microsoftcloudexplorer/visualstudiotoolsfordocker-preview/0.41.0/1482142258056/Microsoft.VisualStudio.Services.Icons.Default)


To execute the application using docker run, type the following command
in your terminal:

    docker ​run​ -it denisdbell/blackjack:1.0

You should see the following output displayed in your terminal:

![alt text](https://raw.githubusercontent.com/denisdbell/blackjack/master/blackjack.png "Black Jack Terminal")


### Run using maven
 ![maven icon](http://roufid.com/wp-content/uploads/2016/05/eyecatch-maven.png)

The application uses the maven as it's build and dependency management tool. To run the application using maven perform the steps below:

**1) Clone the repository:**

    git clone https://github.com/denisdbell/blackjack.git

**2) Navigate to the blackjack folder:**

    cd blackjack

**3) Create the jar:**

    mvn clean package

**4) Run the jar:**

    java -jar target/blackjack*.jar

Thanks for reading! I hope you enjoy playing the game!












