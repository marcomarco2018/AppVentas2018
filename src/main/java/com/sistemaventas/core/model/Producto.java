
package com.sistemaventas.core.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity 
@Table (name= "producto")

public class Producto implements Serializable {
    
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column(name="codigo_producto")
    private Long codigoProducto;
     @Column(name="descripcion")
    private String descripcion;
     @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="codigo_categoria",updatable=false,insertable=true,nullable=false)
     private Categoria categoria;
     

    public Producto() {
    }

    public Producto(Long codigoProducto, String descripcion, Categoria categoria) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
       this.categoria=categoria;
    }


    ///metodo spara obetener las propiedades del objeto 

    public Long getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Long codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoProducto=" + codigoProducto + ", descripcion=" + descripcion + ", categoria=" + categoria + '}';
    }

    
    
                           
}