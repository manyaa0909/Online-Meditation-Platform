# Online meditation and mindfulness platform 

This is an online meditation and mindfulness platform built using Java Servlets and JSP. The project allows users to register, log in, and look for meditational excerise and relaxational music according to their need. The system also includes a simple user management and personalised user training.

### Prerequisites

- Java 11
- Apache Maven
- MySQL

### Setup

1. **Clone the repository:**

    ```sh
    git https://github.com/manyaa0909/Online-Meditation-And-Mindfulness-Platform.git
    cd filename
    ```

2. **Configure the database:**

    Create a MySQL database and update the database connection details in the `JdbcUserDao.java` and `JdbcVoteDao.java` files.

3. **Build the project:**

    ```sh
    mvn clean install
    ```

4. **Deploy the WAR file:**

    Deploy the generated `filename.war` file located in the `target` directory to your servlet container (e.g., Apache Tomcat).

### Running the Application

1. **Start your servlet container (e.g., Apache Tomcat).**
2. **Access the application:**

    Open your web browser and navigate to `http://localhost:8080/filename`.

## Project Components

### Servlets

- [`LoginServlet`](src/main/java/com/example/voting/LoginServlet.java): Handles user login.
- [`RegisterServlet`](src/main/java/com/example/voting/RegisterServlet.java): Handles user registration.
- [`VoteServlet`](src/main/java/com/example/voting/VoteServlet.java): Handles voting.

### JSP Pages

- [`login.jsp`](src/main/webapp/login.jsp): Login page.
- [`register.jsp`](src/main/webapp/register.jsp): Registration page.
- [`success.jsp`](src/main/webapp/success.jsp): Registration success page.
- [`vote_success.jsp`](src/main/webapp/vote_success.jsp): Voting success page.
- [`welcome.jsp`](src/main/webapp/welcome.jsp): Welcome page after login.
- [`error.jsp`](src/main/webapp/error.jsp): Error page.

### Configuration

- [`web.xml`](src/main/webapp/WEB-INF/web.xml): Servlet configuration.

## Dependencies

- JUnit: For unit testing.
- MySQL Connector: For database connectivity.
- Java Servlet API: For servlet support.

