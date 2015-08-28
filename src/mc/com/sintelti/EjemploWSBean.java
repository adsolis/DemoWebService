package mc.com.sintelti;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class EjemploWSBean {

	/*@RequestMapping("/crearPersona")
	public String crearPersona(@RequestParam(value = "nombre")) {
		PersonaBean persona = new PersonaBean();
		persona.setNombre();
		return persona.getNombre();
	}*/

	@GET
	@Path("/{nombre}")
    public Response crear(PathParam(value="nombre") String name) {
        return Response.status(200).entity(result).build();;
    }
}
