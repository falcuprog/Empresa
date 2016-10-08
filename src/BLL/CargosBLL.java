
package BLL;

import DAL.IEmpresa;
import ENTITIES.Cargos;
import java.util.ArrayList;
import java.util.NoSuchElementException;

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
        throw new UnsupportedOperationException("Not suppor"
                + "ted yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Cargos obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
