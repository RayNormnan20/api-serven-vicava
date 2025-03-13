
package api.serven.vicava.Models;

import jakarta.persistence.*;

@Entity
@Table(name= "Carrito")
public class Carrito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @ManyToOne
    @JoinColumn(name="usuario_id", nullable =false)
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name="producto_id", nullable =false)
    private Producto producto;
    
    @Column (nullable= false)
    private Integer cantidad;
    
    public Carrito(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
