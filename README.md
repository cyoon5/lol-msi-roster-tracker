# LoL MSI Roster Tracker

A Spring Boot API that allows users to track professional League of Legends teams and players participating in the Mid-Season Invitational (MSI). Exposes endpoints for retrieving teams and their rosters, with a minimal HTML frontend to display basic data.

## Getting Started

Java 17+

Spring Boot

PostgreSQL (or change the DB config)

IDE (like IntelliJ IDEA)

1) Clone the repository
2) Set up PostgreSQL and update application.properties
3) Run the project from IDE
4) Access frontent via http://localhost:8080 to view static frontend
   
## How It's Made:

**Tech used:** Java, Spring Boot, HTML, PostgreSQL, CSS, JavaScript

This project was built using Spring Boot to expose RESTful API endpoints for teams and players. The backend is connected to a PostgreSQL database, and includes standard controller-service-repository architecture.

A very simple frontend is served via a static HTML file, which fetches data from the API using a GET request via JavaScript's fetch() method. 

The API supports routes such as:
- `/teams`
- `/players`
- `/teams/{name}` (to query by team name)
- `/players/{name}` (to query by player name)

All data is managed through JPA repositories with minimal configuration, and Spring Boot's auto-magic wiring helped reduce boilerplate.

## Tests(via windows powershell)

-Note: Use player ID in database to test

## GET : 
Invoke-RestMethod -Uri "http://localhost:8080/players"

## POST : 
Invoke-RestMethod -Uri http://localhost:8080/players -Method POST -Body (@{
    playerName = 'Chovy'; 
    role = 'Mid';
    team = 'Gen G'; 
    kda = 5.2
} | ConvertTo-Json) -ContentType "application/json"

## DELETE : 
Invoke-RestMethod -Uri http://localhost:8080/players/1 -Method DELETE

## UPDATE : 
$body = @{
    playerName = "Oner"
    role = "Jungle"
    team = "T1"
    kda = 3.2
} | ConvertTo-Json

Invoke-RestMethod -Uri "http://localhost:8080/players/5" -Method Put -ContentType "application/json" -Body $body -Verbose


## Lessons Learned:

Through this project, I developed a basic understanding of how Spring Boot works and why it's such a powerful framework for building web applications. I learned key concepts such as:

- What RESTful APIs are and how they structure web communication.
- The basics of Spring annotations like `@RestController`, `@Autowired`, and `@Service`.
- Core principles of **Inversion of Control (IoC)** and **Dependency Injection (DI)**.
- How the backend interacts with a frontend client via HTTP endpoints.

Overall, this project helped bridge my understanding between backend architecture and frontend data usage, and gave me hands-on experience with Java development using modern tools.
