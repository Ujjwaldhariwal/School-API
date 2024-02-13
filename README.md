# Project README

## Overview

This project involves the creation of multiple REST APIs and a client application that consumes these APIs using RestTemplate. The APIs are organized into two folders - one named "multiple-api" running on localhost:8012 and the other named "api-consumer" running on localhost:8011.

### Multiple API (localhost:8012)

This folder hosts three distinct APIs:

1. **Student API**
    - Endpoint: `/students`
    - Description: Manages student information.
    - Database Relationship: Many-to-Many with courses.

2. **Teacher API**
    - Endpoint: `/teachers`
    - Description: Handles teacher-related operations.

3. **Courses API**
    - Endpoint: `/courses`
    - Description: Manages course details.
    - Database Relationship: Many-to-Many with students.

### API Consumer (localhost:8011)

This folder contains a client application that consumes the above APIs.

## Installation and Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- Spring Boot
- RestTemplate

### Steps to Run

1. **Clone the Repository:**
    ```bash
    git clone <repository-url>
    ```

2. **Navigate to "multiple-api" folder:**
    ```bash
    cd multiple-api
    ```

3. **Run the APIs:**
    ```bash
    mvn spring-boot:run
    ```

    The APIs will be available at `http://localhost:8012`.

4. **Navigate to "api-consumer" folder:**
    ```bash
    cd ../api-consumer
    ```

5. **Run the API Consumer:**
    ```bash
    mvn spring-boot:run
    ```

    The client application will be available at `http://localhost:8011`.

## Usage

1. **Accessing APIs:**
   - Student API: `http://localhost:8012/students`
   - Teacher API: `http://localhost:8012/teachers`
   - Courses API: `http://localhost:8012/courses`

2. **Accessing API Consumer:**
   - Client Application: `http://localhost:8011`

## Note

Ensure that the required dependencies are installed and the ports 8012 and 8011 are available before running the applications. Update the configurations and endpoints as needed for your environment.

Feel free to reach out for any assistance or clarification.

Happy coding!
