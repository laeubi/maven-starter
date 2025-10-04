# Maven Starter Project

A simple Maven starter project for beginners to learn about Maven, Java development, and project structure.

## What is Maven?

Maven is a powerful project management and build automation tool used primarily for Java projects. It helps manage:
- Project dependencies (external libraries)
- Build lifecycle (compile, test, package)
- Project structure and organization

## Project Structure

```
maven-starter/
├── pom.xml                          # Project Object Model - Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── HelloWorld.java  # Main application code
│   └── test/
│       └── java/
│           └── com/example/
│               └── HelloWorldTest.java  # Unit tests
```

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Apache Maven 3.6 or higher

To check if you have them installed:
```bash
java -version
mvn -version
```

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/laeubi/maven-starter.git
cd maven-starter
```

### 2. Build the Project

Compile the source code:
```bash
mvn compile
```

### 3. Run Tests

Execute the unit tests:
```bash
mvn test
```

### 4. Run the Application

Run the main class:
```bash
mvn exec:java -Dexec.mainClass="com.example.HelloWorld"
```

Run with a custom argument:
```bash
mvn exec:java -Dexec.mainClass="com.example.HelloWorld" -Dexec.args="YourName"
```

### 5. Package the Application

Create a JAR file:
```bash
mvn package
```

The JAR file will be created in the `target/` directory.

### 6. Clean Build Artifacts

Remove compiled files and build artifacts:
```bash
mvn clean
```

## Common Maven Commands

- `mvn clean` - Delete the target directory
- `mvn compile` - Compile the source code
- `mvn test` - Run unit tests
- `mvn package` - Package the compiled code into a JAR file
- `mvn install` - Install the package into the local repository
- `mvn clean install` - Clean and then install (common combination)

## Understanding pom.xml

The `pom.xml` file is the heart of a Maven project. It contains:

- **Project coordinates**: groupId, artifactId, version
- **Properties**: Configuration settings like Java version
- **Dependencies**: External libraries your project needs
- **Build plugins**: Tools that help build and test your project

## Learning Resources

- [Maven Official Documentation](https://maven.apache.org/guides/index.html)
- [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/index.html)

## Next Steps

After understanding this basic project, try:
1. Adding more classes and methods
2. Writing more unit tests
3. Adding external dependencies (like Apache Commons or Google Guava)
4. Creating a more complex application structure
5. Exploring Maven plugins for code quality (like Checkstyle or SpotBugs)

## License

This is a learning project - feel free to use and modify as needed!
