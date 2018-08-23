> This project is an effort to learn modern micro-service architecture using Spring Boot

The edge service (or API gateway) uses Netflix's _Zuul_ service.

The discovery service uses Netflix's _Eureka_ service.

The micro-services uses _OpenFeign_ to create REST clients to service-to-service communication.

The discovery service's documentation can be found at **http://localhost:8761**

All requests come in through the edge service.

All services register themselves with the discovery service.

## Spring Boot Actuator
Each service includes _Spring Boot Actuator_ with the following endpoints:
* `/actuator`
* `/actuator/health`
* `/actuator/info`

Some services also expose the `/actuator/restart` endpoint.
