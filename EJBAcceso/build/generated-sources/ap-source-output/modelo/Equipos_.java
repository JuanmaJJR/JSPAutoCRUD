package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Jugadores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-30T10:56:19")
@StaticMetamodel(Equipos.class)
public class Equipos_ { 

    public static volatile SingularAttribute<Equipos, String> descripcion;
    public static volatile CollectionAttribute<Equipos, Jugadores> jugadoresCollection;
    public static volatile SingularAttribute<Equipos, Integer> id;
    public static volatile SingularAttribute<Equipos, String> nombre;

}