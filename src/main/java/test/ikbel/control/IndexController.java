package test.ikbel.control;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * On implimente un controller pour la rédirection vers la page d'erreur par défaut
 */
@Controller
public class IndexController implements ErrorController {
	private final static String PATH = "/error";

	@Override
	@RequestMapping(PATH)
	@ResponseBody
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "S'il vous plait initialisez les Ascenseurs...";
	}

}