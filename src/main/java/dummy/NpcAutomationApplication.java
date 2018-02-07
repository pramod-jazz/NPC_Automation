package dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.npc.erp.controller"  )
public class NpcAutomationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpcAutomationApplication.class, args);
	}
}
