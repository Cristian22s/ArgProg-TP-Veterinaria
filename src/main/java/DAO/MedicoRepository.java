
package DAO;

import entidades.Medico;
import java.util.List;
import persistencia.MedicoJpaController;
import persistencia.exceptions.NonexistentEntityException;


public class MedicoRepository implements MedicoDAO{
    public MedicoJpaController controllerMedicoJpa;
    
    public MedicoRepository() {
        this.controllerMedicoJpa = new MedicoJpaController();
    }

    @Override
    public List<Medico> obtenerTodos() {
        return controllerMedicoJpa.findMedicoEntities();
    }

    @Override
    public Medico obtenerPorId(Integer id) {
        return controllerMedicoJpa.findMedico(id);
    }

    @Override
    public void guardar(Medico medico) {
        controllerMedicoJpa.create(medico);
    }

    @Override
    public void actualizar(Medico medico) {
        try {
            controllerMedicoJpa.edit(medico);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        try {
            controllerMedicoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
    
}
