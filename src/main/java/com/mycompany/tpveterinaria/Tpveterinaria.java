
package com.mycompany.tpveterinaria;

import DAO.MedicoDAO;
import DAO.MedicoRepository;
import DAO.PerroDAO;
import DAO.PerroRepository;
import DAO.TurnoDAO;
import DAO.TurnoRepository;
import entidades.Medico;
import entidades.Perro;
import entidades.Turno;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Tpveterinaria {

    public static void main(String[] args) {
        
        PerroDAO perroDAO = new PerroRepository();
        MedicoDAO medicoDAO = new MedicoRepository();
        TurnoDAO turnoDAO = new TurnoRepository();
        
        //paso 1 se crea un medico sin turnos
        System.out.println("Se registra un medico");
        Medico medico1 = new Medico();
        medico1.setNombre("Pepito");
        List<Turno> turnos = new ArrayList<Turno>();
        medico1.setTurnos(turnos);
        medicoDAO.guardar(medico1);
        
        
        //paso 2 se crea un turno para ese medico sin asignar mascota
        System.out.println("El medico crea un turno");
        Turno turno1 = new Turno();  
        turno1.setFecha(new Date());
        turno1.setMedico(medico1);
        turnos.add(turno1);
        medico1.setTurnos(turnos);
        medicoDAO.actualizar(medico1);
        turnoDAO.guardar(turno1);
        
        
        //paso 3 se registra una mascota a la base de datos
        System.out.println("Se registra un perro");
        Perro perro1 = new Perro();
        perro1.setNombre("Kiara");
        perro1.setRaza("labrador");
        perroDAO.guardar(perro1);
        
        //paso 4 se asigna una mascota al turno
        System.out.println("Se anota al turno con el id de la mascota");
        turno1.setMascota(perro1.getId());
        turnoDAO.actualizar(turno1);
        
        
        //paso 5 la mascota se atiende
        System.out.println("El medico atiende a la mascota");
        
        //paso 6 eliminar el turno
        System.out.println("Se borra el turno");
        turnoDAO.eliminar(turno1.getId());
        
        
    }
}
