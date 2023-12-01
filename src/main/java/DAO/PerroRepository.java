
package DAO;

import entidades.Perro;
import java.util.List;
import persistencia.PerroJpaController;
import persistencia.exceptions.NonexistentEntityException;


public class PerroRepository implements PerroDAO{
    
    public PerroJpaController controllerPerroJpa;
    
    public PerroRepository() {
        this.controllerPerroJpa = new PerroJpaController();
    }

    @Override
    public List<Perro> obtenerTodos() {
        return controllerPerroJpa.findPerroEntities();
    }

    @Override
    public Perro obtenerPorId(Integer id) {
        return controllerPerroJpa.findPerro(id);
    }

    @Override
    public void guardar(Perro perro) {
        controllerPerroJpa.create(perro);
    }

    @Override
    public void actualizar(Perro perro) {
        try {
            controllerPerroJpa.edit(perro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        try {
            controllerPerroJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
    
}
