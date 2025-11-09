Dropbox API Integration (Java + Spring Boot)

This project demonstrates how to authenticate using an OAuth 2.0 Bearer Token and fetch data from the Dropbox Business API.

Tech Stack
- Java 17
- Spring Boot
- Maven
- Dropbox API

API Endpoint: `/api/dropbox/team-info`

•	In the controller layer, I created an endpoint /api/dropbox/team-info which the user can call from Postman or a browser.
•	In the service layer, I wrote the main logic using HttpClient to send a POST request to Dropbox’s /2/team/get_info API.
•	I passed the OAuth2 Bearer access token in the header for authentication.
•	The Dropbox API response (team details) is then returned back to the user through the controller.
•	The config layer is used to set up basic Spring Security and handle authentication for the API endpoint.
•	The repo layer is kept empty for now since no database was used, but it’s part of the standard structure.
