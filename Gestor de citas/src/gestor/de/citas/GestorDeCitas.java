/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor.de.citas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantalla.JFrameGestorDeCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar Alegre Flores
 */
public class GestorDeCitas {

    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedico;
     public static List<String> horasDisponibles = new ArrayList<>();
    public static List<String> fechaDisponibles = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedico = new ArrayList<>();
        
        horasDisponibles.add("9:00am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("12:00am");
        horasDisponibles.add("13:00am");
        
        fechaDisponibles.add("10/04/2023");
        fechaDisponibles.add("11/04/2023");
        fechaDisponibles.add("12/04/2023");
        fechaDisponibles.add("13/04/2023");
        
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTO(null);
        framePrincipal.setVisible(true);
    }
    
}
