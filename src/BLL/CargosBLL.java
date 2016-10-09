
package BLL;

import DAL.IEmpresa;
import ENTITIES.Cargos;
import java.util.ArrayList;

public class CargosBLL implements IEmpresa<Cargos> {
    
    ArrayList<Cargos> lsCargos = new ArrayList<>();
    
    @Override
    public void guardar(Cargos obj) {
        
        try {            
            lsCargos.add(obj);                        
        } catch (Exception e) {
            throw e;
        }
        
    }

    @Override
    public void eliminar(Object id) {
        try {
            lsCargos.removeIf(r -> r.getId() == (Integer)id);
            //lsCargos.remove(lsCargos.indexOf(buscarId(id)));
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void actualizar(Cargos obj) {
        try {            
            lsCargos.add(lsCargos.indexOf(buscarId(obj.getId())), obj);            
            lsCargos.remove(lsCargos.indexOf(buscarId(obj.getId()))+1);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Cargos buscarId(Object id) {
        
        try {
            return lsCargos.stream().filter(r -> r.getId() == (Integer)id).findFirst().orElse(null);        
        } catch (Exception ex) {
            throw ex;
        }
        
    }

    @Override
    public ArrayList<Cargos> leer() {
        try {
            return lsCargos;
        } catch (Exception e) {
            throw e;
        }
    }
    
}
