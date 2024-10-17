package dio.springboot.spring_padroes_projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPadroesProjetoApplication.class, args);
	}

}
