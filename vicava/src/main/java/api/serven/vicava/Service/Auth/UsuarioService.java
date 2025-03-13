
package api.serven.vicava.Service.Auth;


import api.serven.vicava.Models.Usuario;

public interface UsuarioService {
    
    Usuario obtenerUsuarioPorUsername(String username);
    
}
