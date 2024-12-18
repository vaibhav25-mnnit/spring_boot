
# Config Bean
- bean can also be created without using the @Component and we can configure the same using the @Bean
  - use cases of @Bean
    - make an existing third party class available to spring whose source code is not known
    - but you can use that as a spring bean

`````java
      //-->configuraing the bean using configuration class
      @Configuration
      public class SportConfig {
      
        @Bean
        public Coach basketballCoach(){
          return new BasketballCoach();
        }
      }

      //-->injecting the configured bean
       @Autowired
          public Controllers(@Qualifier("basketballCoach") Coach myCoach){
              System.out.println("In constructor : "+getClass().getSimpleName());
              this.myCoach = myCoach;
          }
`````
  
- Note that the name of the bean in @Qualifier should be same as the method name while configuring the bean



## Documentation

[Read more here](https://docs.spring.io/spring-framework/reference/core/beans/java/bean-annotation.html)


## Authors

- made with ❤️ by [@vaibhav25-mnnit](https://www.github.com/vaibhav25-mnnit)

