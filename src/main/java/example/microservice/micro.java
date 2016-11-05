package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="miServicio")
public class micro {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public int sumar(@WebParam(name="valor1") int a,@WebParam(name="valor2") int b) {
	    System.out.println("sumar: " + (a+b));
	    return (a+b);
	}
	
	@WebMethod()
	public List<Placa> lista_placas_robadas() {
		List<Placa> val = new ArrayList<>();
		
		Placa p1 = new Placa();
		p1.setPlaca("Placa1");
		p1.setPropiedad("Juan");		
		val.add(p1);
	
		Placa p2 = new Placa();
		p2.setPlaca("Placa2");
		p2.setPropiedad("Alejandro");		
		val.add(p2);
		
	    return val;
	}
	
	@WebMethod()
	public boolean verificar_placa(@WebParam(name="numero_placa") String name) {	    
	    return true;
	}
}
