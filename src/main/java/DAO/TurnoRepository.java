
package DAO;

import entidades.Turno;
import java.util.List;
import persistencia.TurnoJpaController;
import persistencia.exceptions.NonexistentEntityException;


public class TurnoRepository implements TurnoDAO{
    public TurnoJpaController controllerTurnoJpa;
    
    public TurnoRepository() {
        this.controllerTurnoJpa = new TurnoJpaController();
    }
    
    @Override
    public List<Turno> obtenerTodos() {
        return controllerTurnoJpa.findTurnoEntities();
    }

    @Override
    public Turno obtenerPorId(Integer id) {
        return controllerTurnoJpa.findTurno(id);
    }

    @Override
    public void guardar(Turno turno) {
        controllerTurnoJpa.create(turno);
    }

    @Override
    public void actualizar(Turno turno) {
       try {
            controllerTurnoJpa.edit(turno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        try {
            controllerTurnoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
    
}
