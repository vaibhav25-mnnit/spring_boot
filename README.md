
# Bean Life Cycle Methods

- all beans are created when the spring container is started and are destroyed as he container is shutdown
- you can write your custom init method when the bean is initialized at start and custom destroy method before the destruction of a bean
- you can handle you custom business logic in this methods like setting up resources (db,socket,files,etc) and cleaning up them
- you can do the same in code as below
 ``` 
    @PostConstruct 
    public void doSomethingAfterInitilise(){
        System.out.println("Do your stuff after the bean is set");
    }

    @PreDestroy
    public void dodoSomethingABeforeDestroy(){
        System.out.println("Do your stuff before the bean is destroyed");
    }
```


## Documentation

[Read more here](https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/)


## Authors

- made with ❤️ by [@vaibhav25-mnnit](https://www.github.com/vaibhav25-mnnit)

