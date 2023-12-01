
package DAO;

import entidades.Perro;
import java.util.List;


public interface PerroDAO {
    List<Perro> obtenerTodos();
    Perro obtenerPorId(Integer id);
    void guardar(Perro perro);
    void actualizar(Perro perro);
    void eliminar(Integer id);
}
