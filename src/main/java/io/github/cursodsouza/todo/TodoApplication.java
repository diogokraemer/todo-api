package io.github.cursodsouza.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
	
//	@Autowired
//	private TodoRepository todoRepository;
//	
//	@Bean
//	public CommandLineRunner init() {		
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				Todo todo  = new Todo();
//				todo.setDescription("Estudar spring");
//				todo.setCreatedDate(LocalDateTime.now());
//				todoRepository.save(todo);
//			}
//		};
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
