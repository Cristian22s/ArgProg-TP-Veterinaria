package entidades;

import entidades.Turno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-30T23:18:31", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile ListAttribute<Medico, Turno> turnos;
    public static volatile SingularAttribute<Medico, Integer> id;
    public static volatile SingularAttribute<Medico, String> nombre;

}