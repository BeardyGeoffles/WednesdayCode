package Geoff.com;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info=@Info(
            title="Employee Management System",
            contact=@Contact(name="Geoff",email="geoff@geoff.com",url="http://www.bbc.co.uk"),
                description="This is our Employee Information System",
                version="1.0.1"
                )
)

public class Wednesdayh2a {

    public static void main(String[] args) {
        SpringApplication.run(Wednesdayh2a.class, args);
    }

}