# rabbitmq-rest-consumer

## Overview

Example of rabbitmq sender/reciever where the reciever uses rest template to consume a web service.

## RabbitMQ broker

Before you can build your messaging application, you need to set up the server that will handle receiving and sending messages.

RabbitMQ is an AMQP server. The server is freely available at http://www.rabbitmq.com/download.html. You can download it manually, or if you are using a Mac with homebrew:

`
brew install rabbitmq
`

Unpack the server and launch it with default settings.

`
rabbitmq-server
`

## Json Server

Install JSON Server

`
npm install -g json-server
`

Create a db.json file with some data

`{
  "posts": [
    { "id": 1, "title": "json-server", "author": "typicode" }
  ],
  "comments": [
    { "id": 1, "body": "some comment", "postId": 1 }
  ],
  "profile": { "name": "typicode" }
}
`

Start JSON Server

`
json-server --watch db.json
`

## Run app

`
./gradlew bootRun
`

or

`
./mvnw spring-boot:run
`

## References

* https://github.com/typicode/json-server
* https://spring.io/guides/gs/rest-service/
* https://spring.io/guides/gs/messaging-rabbitmq/


