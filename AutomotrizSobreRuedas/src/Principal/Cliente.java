/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Vyto
 */
public class Cliente {
    
    private int _codigo;
    private String _nombre;
    private String _aprellido_p;
    private String _apellido_m;

    public int getCodigo() {
        return _codigo;
    }

    public void setCodigo(int _codigo) {
        this._codigo = _codigo;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getAprellido_p() {
        return _aprellido_p;
    }

    public void setAprellido_p(String _aprellido_p) {
        this._aprellido_p = _aprellido_p;
    }

    public String getApellido_m() {
        return _apellido_m;
    }

    public void setApellido_m(String _apellido_m) {
        this._apellido_m = _apellido_m;
    }
    
    
    
}
