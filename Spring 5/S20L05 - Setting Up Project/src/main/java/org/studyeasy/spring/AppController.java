package org.studyeasy.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.spring.DAO.AppDAOimple;
import org.studyeasy.spring.config.AppConfig;
import org.studyeasy.spring.model.User;

@Controller
public class AppController {
	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOimple DAO = context.getBean("DAOBean", AppDAOimple.class);
		users = DAO.listUsers();
		System.out.println(users);
		model.addObject("users", users);
		context.close();
		return model;
	}
}
