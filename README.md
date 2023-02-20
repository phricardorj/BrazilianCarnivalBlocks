# Brazilian Carnival Blocks

This API is built in Java with Clean Architecture concepts. Developed to consolidate knowledge and share it in a cool project.

## Skills
- Java 17
- [MapStruct](https://mapstruct.org/)
- [Spring Boot](https://spring.io/projects/spring-boot)

# The Clean Architecture
![Clean Architecture](https://blog.cleancoder.com/uncle-bob/images/2012-08-13-the-clean-architecture/CleanArchitecture.jpg "Clean Architecture")

- Settings layer:
```
Package name by convention: configurations.
Cannot be used by any other layer of the application
```
- Gateway layer:
```
Package name by convention: gateways
Can only be used by the layer: Usecase
```
- Usecase layer:
```
Package name by convention: usecases
Can only be used in layers: Gateway
```
- Domain layers:
```
Package name by convention: domains
Can only be used in layers: Usecase, Gateway
```
- Layer of repositories:
```
Package name by convention: repositories
Can only be used in the layer: Gateway
```
