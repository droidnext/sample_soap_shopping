sample_soap_shopping
============================

Sample soap application ,the intent is to consume this sample soap service in other projects
to test soap integrations


Dependencies included
---------------------
- org.slf4j
- JUnit 4.10

Requirements
------------
- Java 7
- Maven 3

Building
--------
- Make  <code> mvn clean install </code>
- Running SampleSoapServicePublisher stand alone , will start the service on port 8080
http://localhost:8080/WS/ShoppingCartService

TODO
---------
- Add Secure service that requires soap signing.

