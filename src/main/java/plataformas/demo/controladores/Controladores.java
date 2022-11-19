package plataformas.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import plataformas.demo.modelos.Usuario;
import plataformas.demo.repositorios.UsuarioRepo;

@RestController
public class Controladores {

    @Autowired
    UsuarioRepo usuarioRepo;
    
    //@PostMapping("/login")
    //raul, le puse el mapgin al get porque cuando lo ejecutaba en localhost:8080 me sacaba error
    @GetMapping("/")
    public String holaquetal(){
        return "Hola que tal";
    }

    @PostMapping("/registro")
    public ResponseEntity<Usuario> registro(@RequestBody Usuario usuario) throws Exception{

        try {
            usuarioRepo.save(usuario);
            return new ResponseEntity<>(usuario, HttpStatus.OK);            
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/registro")
    public String obtenerUsuario(@RequestParam String email) throws Exception{
    
            Usuario usuario = usuarioRepo.findByEmail(email);

            return  usuario.getNombre();

    }

    @GetMapping("/alquiladas")
    public String obtenerAlquiladas(){
        return "alquiladas";
    }

    @PostMapping("/alquiladas")
    public String guardarAlquilada(){
        return "alquiladas";
    }

    @DeleteMapping("/alquiladas")
    public String borrarAlquilada(){
        return "alquiladas";
    }

    @GetMapping("/pelicula")
    public String obtenerPeliculasCatologo(){
        return "Películas catálogo admin";
    }

    @PostMapping("/pelicula")
    public String agregarPeliculasCatologo(){
        return "Agregar pelis al catálogo";
    }


}
