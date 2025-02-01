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