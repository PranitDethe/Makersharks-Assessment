# Makersharks Assessment

## Overview

The Makersharks Assessment project is a Spring Boot application designed to manage and query supplier information. The application provides endpoints to search suppliers based on their location, nature of business, and manufacturing processes.

## Features

- **Supplier Query**: Allows querying suppliers based on location, nature of business, and manufacturing processes.
- **Swagger Integration**: Provides API documentation using Swagger.
- **Global Exception Handling**: Handles and returns exceptions in a standardized manner.

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java 17** or higher
- **Maven** (for building and running the project)

## Installation

1. **Clone the Repository**

    ```bash
    git clone https://github.com/PranitDethe/Makersharks-Assessment.git
    ```

2. **Navigate to the Project Directory**

    ```bash
    cd Makersharks-Assessment
    ```

3. **Build the Project**

    ```bash
    mvn clean install
    ```

## Running the Application

To run the application, execute the following command:

```bash
mvn spring-boot:run
This will start the Spring Boot application on the default port, which is 8080.

API Documentation
Once the application is running, you can access the API documentation at:


http://localhost:8080/swagger-ui.html
Endpoints
POST /api/supplier/query
Query suppliers based on location, nature of business, and manufacturing processes.

Request Parameters:

location (required): The location of the supplier.
natureOfBusiness (required): The nature of business of the supplier.
manufacturingProcess (required): The manufacturing process the supplier is involved in.
page (optional, default: 0): The page number for pagination.
size (optional, default: 10): The number of results per page.
Response:

Returns a paginated list of suppliers matching the criteria.
Exception Handling
The application uses global exception handling to return error messages in a standardized format. Any unhandled exceptions will return a response with a 500 Internal Server Error status and the exception message.

Database Setup
The application uses an H2 in-memory database by default for testing. For a production environment, configure a persistent database by updating the application.properties file with your database credentials and connection details.
