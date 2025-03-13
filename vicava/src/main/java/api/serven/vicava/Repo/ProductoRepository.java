
package api.serven.vicava.Repo;

import api.serven.vicava.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository  extends JpaRepository <Producto, Long>{
    
}
