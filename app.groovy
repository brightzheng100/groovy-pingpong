import org.springframework.core.env.*
import java.util.Date

@Controller
class Application {

	String color = "blue";

	@RequestMapping("/")
	@ResponseBody
	public String index(Model model) {
		return "<body bgcolor='" + color + "'><h1>Hello Groovy World!</h1></body>"
	}

	@RequestMapping("/ping")
	@ResponseBody
	public String ping() {
		return "Pong[" + color + "]: " + new Date()
	}

	@RequestMapping("/killme")
	public void killme() {
		System.exit(-1)
	}

}
