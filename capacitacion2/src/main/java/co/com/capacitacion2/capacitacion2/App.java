package co.com.capacitacion2.capacitacion2;

import co.com.capacitacion2.capacitacion2clase3.AutomatizacionPaginaWeb;
import co.com.capacitacion2.capacitacion2clase4.ManagerDriver;
import co.com.capacitacion2.capacitacion2clase4.PageObjectoTourFrancia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       String urlPagina="https://www.marca.com/ciclismo/tour-francia/clasificacion/etapa-20.html";
    	ManagerDriver objManager=new ManagerDriver("google", urlPagina);
    	objManager.navegarAPagina();
    	PageObjectoTourFrancia objTour =new PageObjectoTourFrancia(objManager.getWebDriver());
    	objTour.seleccionListaDesplegable("Etapa 17");
    	esperar(3);
    	objTour.imprimirlistaDesplegable();
    	esperar(5);
    	objManager.cerrarNavegador();
    	
    }
    public static void  esperar(int tiempo) {
    	
    	try {
			Thread.sleep(tiempo*1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
       
    }
}
