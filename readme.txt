HTTP is a stateless protocol. The server cannot distinguish between new visitors and returning visitors.
But sometimes we may need to keep track of client's activity across multiple requests.
This is achieved using Session Management.

Session management can be achieved in one of the following ways-
- Cookies
- Hidden form field
- URL Rewriting
- HttpSession

In this exercise, we use Spring boot and Redis for session management
-------------------------------------------------------------------------------
TODO

Spring Session provides an API and implementations for managing a user’s session information. It also provides transparent integration with:

HttpSession - allows replacing the HttpSession in an application container (i.e. Tomcat) neutral way. Additional features include:

Clustered Sessions - Spring Session makes it trivial to support clustered sessions without being tied to an application container specific solution.

Multiple Browser Sessions - Spring Session supports managing multiple users' sessions in a single browser instance (i.e. multiple authenticated accounts similar to Google).

RESTful APIs - Spring Session allows providing session ids in headers to work with RESTful APIs