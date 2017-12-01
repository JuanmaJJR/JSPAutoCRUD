package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Equipos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:56:19")
@StaticMetamodel(Jugadores.class)
public class Jugadores_ { 

    public static volatile SingularAttribute<Jugadores, String> posicion;
    public static volatile SingularAttribute<Jugadores, String> apellido;
    public static volatile SingularAttribute<Jugadores, Equipos> iDEquipo;
    public static volatile SingularAttribute<Jugadores, Integer> id;
    public static volatile SingularAttribute<Jugadores, String> nombre;

}