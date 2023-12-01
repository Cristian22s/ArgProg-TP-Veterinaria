
package DAO;

import entidades.Turno;
import java.util.List;


public interface TurnoDAO {
    List<Turno> obtenerTodos();
    Turno obtenerPorId(Integer id);
    void guardar(Turno turno);
    void actualizar(Turno turno);
    void eliminar(Integer id);
}
