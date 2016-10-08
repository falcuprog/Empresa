
package DAL;

import java.util.ArrayList;

public interface IEmpresa <T> {
    
    void guardar(T obj);
    
    void eliminar(Object id);
    
    void actualizar(T obj);
    
    T buscarId(Object id);
    
    ArrayList<T> leer();
    
}
