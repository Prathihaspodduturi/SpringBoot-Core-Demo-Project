# SpringBoot-Core-Demo-Project

Spring Core Demo is a Spring Framework-based project demonstrating the use of various Spring features like dependency injection, bean lifecycle, and REST controllers. This project provides a practical example of how to implement and configure different coaching classes, showcasing the power and flexibility of the Spring Framework.

# Features

Dependency Injection: Demonstrates constructor, setter, and field injection.
Java-based Configuration: Custom configuration using Java classes instead of XML.
Spring REST Controller: Implementation of a RESTful service with Spring MVC.
Bean Scopes: Singleton and Prototype bean scope examples.
Qualifier and Primary Annotations: Usage of @Qualifier and @Primary to manage multiple beans.

# Getting Started

# Prerequisites
Java Development Kit (JDK) 8 or higher
Maven for dependency management
IntelliJ IDEA

# Installation
git clone [repository-url]
cd spring-core-demo-project
mvn clean install

# Running the Application
mvn spring-boot:run

# Code Structure
com.luv2code.springcoredemo.common: Contains coach interfaces and implementations.
com.luv2code.springcoredemo.config: Java-based Spring configuration.
com.luv2code.springcoredemo.rest: REST controllers demonstrating the use of Spring MVC.
