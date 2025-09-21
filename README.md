# Online Social Bookstore — Legacy Reengineering

Reengineering a Spring Boot Java web application that lets people exchange used books for free. An **online social bookstore** where individuals can offer/request used books, search (exact/approximate/category), and receive recommendations based on profile preferences.
The goal is to reengineer legacy code for clarity, cohesion, and extension.

## Files

- A refactored Spring Boot app (Java 17)
- Restructured MVC layers (Controllers → Services → Repositories/Mappers)
- Strategy + Factory patterns for **Search** and **Recommendations**
- Template Method abstractions to remove duplicate logic
- Automated tests (JUnit + Mockito + Spring Boot Test) 

