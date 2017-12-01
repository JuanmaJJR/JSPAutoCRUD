/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import static java.lang.System.out;
import javax.ejb.Stateless;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import modelo.Equipos;
import modelo.Jugadores;

/**
 *
 * @author juan.jusue
 */
@Stateless
public class Session {
    Jugadores jugador1;
    Equipos equipo1;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceUnit
    EntityManagerFactory emf;
    public List findAll(){
        return
         emf.createEntityManager().createNamedQuery
        ("Jugadores.findAll").getResultList();
}
    public void Insertar(String Nombre,String Apellido,String Posicion,Integer Equipo){
        Jugadores jugador1 = new Jugadores (27,Nombre,Apellido,Posicion);
        List<Equipos>equipoo = emf.createEntityManager().createNamedQuery("Equipos.findById").setParameter("id",Equipo).getResultList();   
        System.out.println(equipoo.get(0));
        jugador1.setIDEquipo(equipoo.get(0));
        emf.createEntityManager().persist(jugador1);
        
    }

    public List getEquipos() {
        return
        emf.createEntityManager().createNamedQuery
        ("Equipos.findAll").getResultList();
    }

    public void imprimeEquipos(List<Equipos> l) {
            
    }

    public void Insertar(Jugadores jugador, String Nombre, String Apellido, String Equipo, String Posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void borrarJugador(Integer Jugadorr) {
        System.out.println("Jugadorr");
        EntityManager em = emf.createEntityManager();
         List<Jugadores>jugadoress = em.createNamedQuery("Jugadores.findById").setParameter("id",Jugadorr).getResultList();
         Jugadores jugadorDel = jugadoress.get(0);
         System.out.println(jugadorDel.getNombre());
         if(!em.contains(jugadorDel)){
             jugadorDel= em.merge(jugadorDel);
         }
         em.remove(jugadorDel);
    }

}
