
package api.serven.vicava.Controller;


import api.serven.vicava.Models.Usuario;
import api.serven.vicava.Service.Auth.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    
    @GetMapping("/perfil")
    public ResponseEntity<Usuario> getPerfilUsuario(@AuthenticationPrincipal UserDetails userDetails){
        
        String username = userDetails.getUsername();
        
        Usuario usuario = usuarioService.obtenerUsuarioPorUsername(username);
        return ResponseEntity.ok(usuario);
    }
    
}
