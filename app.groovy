import org.springframework.core.env.*
import java.util.Date

@RestController
class Application {

	String message = "<div style=\"font-size: 100px; color: white; background-color: %s\">Hello World - %s!</div>"
	String color = "blue";

	@RequestMapping("/")
	@ResponseBody
	public String index(Model model) {
		return String.format(message, color, color)
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
