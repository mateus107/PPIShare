package agendaspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import agendaspring.controllers.HomeController;

@EnableWebMvc
@ComponentScan (basePackageClasses= {HomeController.class})
public class AppWebConfiguration {
@Bean
	public InternalResourceViewResolver internalResourceViewResolver() { 
	//classe destinada a mapeamento automatico
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/"); //Essa pasta não é acessivel por url. portanto o usuario so acessara, setiver passado pelo controler
		resolver.setSuffix(".jsp");
		return resolver;
}

}
