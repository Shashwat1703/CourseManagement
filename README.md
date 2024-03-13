# CourseManagement
Spring Boot application for Course Management Assignment
# Course Management Application

This is a Spring Boot application for managing courses. It allows users to create, update, and retrieve course information. The application utilizes an in-memory H2 database.

## Features

- Create a new course with details such as name, subject, chapters, number of classes, type, and learning mode.
- Update existing course information.
- Retrieve course information based on user role:
  - For students: Retrieve all available courses.
  - For course creators: Retrieve all courses created by them.

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database
- Java

## Running the Application

1. Clone this repository:


2. Navigate to the project directory:


3. Build the project:


4. Run the Spring Boot application:


5. Access the application in your web browser at [http://localhost:8080](http://localhost:8080)

## API Endpoints

- `POST /course/create`: Create a new course.
- `PUT /course/update`: Update an existing course.
- `GET /course/get?role={role}`: Retrieve course information based on user role (role can be `student` or `courseCreator`).

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
