# Maven Starter Project

A simple Maven starter project for beginners, showcasing modern Maven features and best practices.

## 🚀 Features

This starter project demonstrates:

- **Maven 4 Ready**: Configured to work with Maven 4.x and backwards compatible with Maven 3.9+
- **Modern Java**: Uses Java 17 with proper compiler configuration
- **JUnit 5**: Modern testing framework setup
- **Best Practices**: Clean project structure following Maven conventions

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.9+ (Maven 4.x recommended)

## 🏗️ Maven 4 Features Highlighted

### 1. Build/Consumer POM Model
Maven 4 introduces a separation between the build POM (what developers work with) and the consumer POM (what is published to repositories). This project is configured to support this model.

### 2. Centralized Property Management
All version numbers and configuration values are centralized in the `<properties>` section:
```xml
<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <maven.compiler.release>17</maven.compiler.release>
</properties>
```

### 3. Modern Plugin Versions
Uses the latest versions of Maven plugins that are optimized for Maven 4:
- Maven Compiler Plugin 3.12.1+
- Maven Surefire Plugin 3.2.3+
- Maven JAR Plugin 3.3.0+

## 🛠️ Building the Project

### Compile the code
```bash
mvn compile
```

### Run tests
```bash
mvn test
```

### Package the application
```bash
mvn package
```

This creates a JAR file in the `target/` directory.

### Clean build artifacts
```bash
mvn clean
```

### Full build cycle
```bash
mvn clean package
```

## ▶️ Running the Application

### After packaging:
```bash
java -jar target/maven-starter-1.0-SNAPSHOT.jar
```

### Or run directly with Maven:
```bash
mvn compile exec:java -Dexec.mainClass="com.example.App"
```

### With arguments:
```bash
java -jar target/maven-starter-1.0-SNAPSHOT.jar arg1 arg2
```

## 📁 Project Structure

```
maven-starter/
├── pom.xml                          # Maven project configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── App.java     # Main application class
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── AppTest.java # Unit tests
└── README.md
```

## 🧪 Testing

The project includes example JUnit 5 tests. Run them with:

```bash
mvn test
```

## 📚 Learning Resources

### Maven Documentation
- [Maven Official Site](https://maven.apache.org/)
- [Maven 4 Features](https://maven.apache.org/docs/4.0.0/)
- [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/)

### Key Maven Concepts

1. **POM (Project Object Model)**: The `pom.xml` file contains project configuration
2. **Maven Lifecycle**: compile → test → package → install → deploy
3. **Dependencies**: External libraries managed automatically by Maven
4. **Plugins**: Extend Maven functionality for various tasks

## 🎯 Next Steps

Once you're comfortable with this starter project, try:

1. Adding more dependencies (e.g., logging frameworks, web frameworks)
2. Creating multiple modules (multi-module Maven project)
3. Configuring Maven profiles for different environments
4. Setting up continuous integration with Maven
5. Publishing artifacts to a repository

## 📝 Common Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Remove target directory |
| `mvn compile` | Compile source code |
| `mvn test` | Run unit tests |
| `mvn package` | Create JAR/WAR file |
| `mvn install` | Install to local repository |
| `mvn dependency:tree` | Show dependency tree |
| `mvn versions:display-dependency-updates` | Check for dependency updates |
| `mvn help:effective-pom` | Show effective POM |

## 🤝 Contributing

Feel free to fork this project and adapt it for your needs!

## 📄 License

This is a starter project template - use it freely for learning and development.
