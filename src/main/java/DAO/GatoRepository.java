
package DAO;

import entidades.Gato;
import java.util.List;
import persistencia.GatoJpaController;
import persistencia.exceptions.NonexistentEntityException;


public class GatoRepository implements GatoDAO{
    public GatoJpaController controllerGatoJpa;
    
    public GatoRepository() {
        this.controllerGatoJpa = new GatoJpaController();
    }

    @Override
    public List<Gato> obtenerTodos() {
        return controllerGatoJpa.findGatoEntities();
    }

    @Override
    public Gato obtenerPorId(Integer id) {
        return controllerGatoJpa.findGato(id);
    }

    @Override
    public void guardar(Gato gato) {
        controllerGatoJpa.create(gato);
    }

    @Override
    public void actualizar(Gato gato) {
        try {
            controllerGatoJpa.edit(gato);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Integer id) {
        try {
            controllerGatoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }
    }
    
}
