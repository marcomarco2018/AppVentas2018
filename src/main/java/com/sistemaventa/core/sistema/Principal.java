
package com.sistemaventa.core.sistema;

import com.sistemaventas.core.model.Producto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal {
    
    
    static EntityManager em = null;
    static EntityManagerFactory emf= null;
    static EntityTransaction tx = null;
    
    static Logger log= LogManager.getRootLogger(); 
    public static void main(String args[]){
        
        try {
          emf= Persistence.createEntityManagerFactory("WSSventas");
          
          em= emf.createEntityManager(); 
         log.debug("iniciando prueba generacion entidades JPA");
             tx = em.getTransaction();
            tx.begin();
            Producto registro = new Producto (); 
           
            registro.setDescripcion("Prueba");//seteo el objeto 
            log.debug("Ojbeto a persistir" + registro);
            em.persist(registro);//lo alamaceno a la base de datos 
            tx.commit();//cierro la transaccion
            log.debug("objeto persistido " + registro );
            log.debug("fin test Carrera con JPA");
            
        }catch (Exception e){
        
        e.printStackTrace();
    }
        
    }
}
