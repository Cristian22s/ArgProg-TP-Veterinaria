
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="turnos")
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date fecha;
    private Integer mascotaId;
    @ManyToOne
    private Medico medico;

    public Turno() {
    }

    public Turno(Integer id, Date fecha, Integer mascotaId, Medico medico) {
        this.id = id;
        this.fecha = fecha;
        this.mascotaId = mascotaId;
        this.medico = medico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getMascotaId() {
        return mascotaId;
    }

    public void setMascota(Integer mascotaId) {
        this.mascotaId = mascotaId;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
            
    
}
