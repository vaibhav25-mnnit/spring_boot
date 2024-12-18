
# Bean Scope

- by default spring container created only one instance of a bran
- it is cached in memory
- any where that bean is used for dependency injection ,the injection will reference to same bean
- you can specify which scope you want to give as given below
 ``` 
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
                    or
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
```
- In prototype scope each time new instance of bean is created.


## Documentation

[Read more here](https://www.geeksforgeeks.org/singleton-and-prototype-bean-scopes-in-java-spring/)


## Authors

- made with ❤️ by [@vaibhav25-mnnit](https://www.github.com/vaibhav25-mnnit)

