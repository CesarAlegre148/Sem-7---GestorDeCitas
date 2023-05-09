/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar Alegre Flores
 */
public class Medico {
    private String nombre;
    private String CMP;

    private List<Especialidad> especialidades;

    

    public Medico(String nombre, String CMP, Especialidad especialidadInicial) {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = new ArrayList<>();
        this.especialidades.add(especialidadInicial);
    }
    
    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }
    
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    public String getDatosMostrar(){
        return this.nombre + " - CMP: " + this.CMP;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }
    
}
