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