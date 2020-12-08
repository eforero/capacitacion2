package co.com.capacitacion2.capacitacion2clase4;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectoTourFrancia extends PageFactory {

	 private WebDriver webDriver;
	public PageObjectoTourFrancia (WebDriver webDriver) {
		this.webDriver=webDriver;
		
		PageFactory.initElements(webDriver, this);
		
	}
	
	@FindBy(id ="selectweb")
	private WebElement listaSeleccionMultiple;
	
	@FindBy(className= "ue-table-ranking__cyclist-name")
	private List<WebElement> ListaCiclistas;
	
	public void seleccionListaDesplegable(String opcion)
	{
		Select select= new Select(listaSeleccionMultiple);
		select.selectByVisibleText(opcion);
	}
	public void imprimirlistaDesplegable() {
		int acumulador = 1;
 		for(WebElement posicion: ListaCiclistas) {
			System.out.println(acumulador+": "+posicion.getText());
			acumulador++;
		}
	}
}
