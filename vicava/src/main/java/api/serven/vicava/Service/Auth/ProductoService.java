
package api.serven.vicava.Service.Auth;


import api.serven.vicava.Models.Producto;
import api.serven.vicava.Repo.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }
    
    public Optional<Producto> ObtenerPorId(Long id) {
        return productoRepository.findById(id);
    }
    
    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }
    
    
    public  void  eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }
}
