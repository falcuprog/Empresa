
package BLL;

import DAL.IEmpresa;
import ENTITIES.Cargos;
import java.util.ArrayList;

public class CargosBLL implements IEmpresa<Cargos> {

    @Override
    public void guardar(Cargos obj) {
        
    }

    @Override
    public void eliminar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Cargos obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cargos buscarId(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cargos> leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
