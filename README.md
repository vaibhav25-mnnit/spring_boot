
# Lazy intilization

- by default all the beans are created at the startup of the app

- we can restrict the bean creation by using the '@Lazy' at the top of the app, this will allow the creation of bean only when that particular bean is required.
- also we can make all the beans lazy by updating the application.properties file as
```xml
spring.main.lazy-initialization = true
```

## Documentation

[Read more about lazy initialization here](https://www.geeksforgeeks.org/spring-lazy-annotation/)


## Authors

- made with ❤️ by [@vaibhav25-mnnit](https://www.github.com/vaibhav25-mnnit)

