
package com.sistemaventas.core.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
  
    @Entity 
@Table (name= "categoria")

public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column(name="codigo_categoria")
    private Long codigoCategoria;
     @Column(name="descripcion")
    private String descripcion;
  @OneToMany(mappedBy="categoria")
	private Set<Producto> producto = new HashSet<Producto>();

    public Categoria() {
    }

    public Categoria(Long codigoCategoria, String descripcion) {
        this.codigoCategoria = codigoCategoria;
        this.descripcion = descripcion;
    }

    public Long getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(Long codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Producto> getProducto() {
        return producto;
    }

    public void setProducto(Set<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigoCategoria=" + codigoCategoria + ", descripcion=" + descripcion + ", producto=" + producto + '}';
    }
    


    
}
