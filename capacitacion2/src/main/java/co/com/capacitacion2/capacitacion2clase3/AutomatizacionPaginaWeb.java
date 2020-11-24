package co.com.capacitacion2.capacitacion2clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionPaginaWeb {

	public void interactuarConGmail() {
		String ubicacionDriver ="src\\main\\java\\resources\\drivers\\chromedriver.exe";
		String urlIniciarGmail="https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", ubicacionDriver);
		WebDriver driver = new ChromeDriver();
		driver.get(urlIniciarGmail);
		WebElement cajaDeTextoNombre = driver.findElement(By.id("identifierId"));
		cajaDeTextoNombre.sendKeys("Prueba@gmail.com");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.close();
	}
}

