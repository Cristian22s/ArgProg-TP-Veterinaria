package entidades;

import entidades.Medico;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-30T23:18:31", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Date> fecha;
    public static volatile SingularAttribute<Turno, Integer> mascotaId;
    public static volatile SingularAttribute<Turno, Medico> medico;
    public static volatile SingularAttribute<Turno, Integer> id;

}