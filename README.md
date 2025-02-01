### Created the project with:

```bash
mvn archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DgroupId=com.example \
  -DartifactId=my-spring-api \
  -DinteractiveMode=false
```

### Add in the Spring Boot Plugin to pom.xml

[See Mine](./pom.xml)

### Get a clean install with:

```bash
mvn clean install
```

### Run the server with:

```bash
mvn spring-boot:run
```

### import RestController and GetMapping to create a simple route that returns a string:

```java
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users")
    public String getUsers() {
        return "All users";
    }
}
```

### import PathVariable to use dynamic params:

```java
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        return "Returning user with ID: " + id;
    }

}
```

### import RequestParam to use search parameters:
```java
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {
    // Get users who are role=admin
    // ex: localhost:8080/users/role?role=admin
    @GetMapping("/users/role")
    public String getUsersByRole(@RequestParam("role") String role) {
        return "Returning users with the " + role + " role.";
    }

}
```

## Spring Boot converts all objects to JSON using Jackson

### Using Spring Boot to automatically convert a List to a JSON array
```java
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getUsers() {
        return Arrays.asList("John", "Jane", "Doe");
    }
}
```