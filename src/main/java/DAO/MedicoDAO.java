
package DAO;

import entidades.Medico;
import java.util.List;


public interface MedicoDAO {
    List<Medico> obtenerTodos();
    Medico obtenerPorId(Integer id);
    void guardar(Medico medico);
    void actualizar(Medico medico);
    void eliminar(Integer id);
}
