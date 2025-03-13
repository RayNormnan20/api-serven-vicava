
package api.serven.vicava.Service.userdetails;

import api.serven.vicava.Models.Usuario;
import api.serven.vicava.Repo.UserRepo;
import api.serven.vicava.Service.Auth.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired
    private UserRepo userRepo;

    @Override
    public Usuario obtenerUsuarioPorUsername(String username) {
        return userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado") );
    }
    
    
}
