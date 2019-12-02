HTTP is a stateless protocol. The server cannot distinguish between new visitors and returning visitors.
But sometimes we may need to keep track of client's activity across multiple requests.
This is achieved using Session Management.

Session management can be achieved in one of the following ways-
- Cookies
- Hidden form field
- URL Rewriting
- HttpSession

In this exercise, we use Spring boot and Redis for session management