package fireplace.backend;


import fireplace.backend.infrastructuur.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class fireplaceApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("rabbitmqConfig.xml");

        SpringApplication.run(fireplaceApplication.class, args);

    }

    @Bean
    CommandLineRunner runner(MessageService messageService) {

        return args -> {
            messageService.sendMessage("dit is een test om te zien of het werkt.");
        };
    }

}
