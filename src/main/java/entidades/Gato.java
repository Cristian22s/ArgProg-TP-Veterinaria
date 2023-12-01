
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gatos")
public class Gato extends Mascota implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Boolean esPeludo;

    public Gato() {
    }

    public Gato(Boolean esPeludo, Integer id, String nombre) {
        super(nombre);      
        this.id = id;
        this.esPeludo = esPeludo;
    }  


    public Boolean getEsPeludo() {
        return esPeludo;
    }

    public void setEsPeludo(Boolean esPeludo) {
        this.esPeludo = esPeludo;
    }  
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
    
