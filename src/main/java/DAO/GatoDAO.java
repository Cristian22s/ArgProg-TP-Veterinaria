
package DAO;

import entidades.Gato;
import java.util.List;


public interface GatoDAO {
    List<Gato> obtenerTodos();
    Gato obtenerPorId(Integer id);
    void guardar(Gato gato);
    void actualizar(Gato gato);
    void eliminar(Integer id);
}
