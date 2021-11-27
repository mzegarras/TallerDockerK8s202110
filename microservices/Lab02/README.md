# Create projects multimodule
1. Importar proyecto en IntelliJ
1. Agregar dependencia de lombok y spring-boot
    ```xml
     <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot</artifactId>
    </dependency>
    ```
1. En el proyecto -core, en la ruta src/main/java, agregar el archivo lombok.config
    ```xml
    lombok.equalsAndHashCode.callSuper=call
    ```
1. Crear el package:  com.odybank.customers.config
1. Crear la clase: MailProperties
    ```java
    private String server;
    private String user;
    private String password;
    private int port;
    ```
1. En el proyecto -api, crear el archivo
    ```xml
    microservices/Lab02/odybank-customers/customers-api/src/main/resources/application.yaml
    ```
    ```yaml
    customers.mail:
        server: server01
        user: user
        password: pwd
        port: 9090
    ```
    
1. En el proyecto -api, crear el archivo: CustomersApplication.java
    ```java
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class CustomersApplication {

        public static void main(String[] args) {
            SpringApplication.run(CustomersApplication.class, args);
        }
    }
    ```
1. En el proyecto -api, crear el archivo: com.odybank.customers.controller.CustomersApi
    ```java
    @Controller
    @RequestMapping("/customers")
    public class CustomersApi {

        @Autowired
        private MailProperties mailProperties;

        @GetMapping()
        public HttpEntity<String> demo(){

            return ResponseEntity.ok(mailProperties.getServer());

        }
    }
    ```

1. En el proyecto -api, crear el archivo: com.odybank.customers.controller.CustomersApi
    ```java
        @Controller
        @RequestMapping("/customers")
        @AllArgsConstructor
        public class CustomersApi {

            private final MailProperties mailProperties;

            @GetMapping()
            public HttpEntity<String> demo(){

                return ResponseEntity.ok(mailProperties.getServer());

            }
        }
    ```
1. En el proyecto -core, agregar la dependencia
    ```xml
      <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-validation</artifactId>
      </dependency>
    ```
1. En el proyecto -core, modificar la clase MailProperties
    ```java
      @Validated
        public class MailProperties
    ```
1. En el proyecto -core, modificar la clase MailProperties
    ```java
        @NotNull(message = "Server may not be null")
        private String server;

        @NotEmpty(message = "User may not be empty")
        private String user;

        @Size(min = 8, max = 10)
        private String password;

        @NotNull
        @Min(9090)
        @Max(9095)
        private int port;
    ```            