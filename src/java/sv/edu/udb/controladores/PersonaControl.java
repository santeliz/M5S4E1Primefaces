package sv.edu.udb.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import sv.edu.udb.entidades.Persona;

@ManagedBean
@RequestScoped
public class PersonaControl implements Serializable{

    Persona persona;
    List<Persona> lstPersonas;
    
    @PostConstruct
    public void init() {
        persona = new Persona();
        listarPersonas();
        
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public List<Persona> listarPersonas() {
        lstPersonas = new ArrayList();
        
        Date fecha = new Date();

        Persona p = new Persona("Juan", "Figueroa", 18, fecha, "12345678", "123", 1200);
        lstPersonas.add(p);

        p = new Persona("Yesenia", "Aguirre", 80, fecha, "9876543", "987", 800);
        lstPersonas.add(p);

        p = new Persona("Maria", "DB", 26, fecha, "56789321", "456", 700);
        lstPersonas.add(p);

        p = new Persona("Camilo", "Duran", 20, fecha, "65748392", "098", 900);
        lstPersonas.add(p);

        p = new Persona("Alberto", "Vo5", 30, fecha, "91283746", "912", 600);
        lstPersonas.add(p);

        p = new Persona("Franchesca", "Portman", 18, fecha, "482928742", "345", 1100);
        lstPersonas.add(p);
        
        p = new Persona("Miguel", "Perez", 18, fecha, "482928742", "345", 1100);
        lstPersonas.add(p);        
        
        return lstPersonas;
    }

    public List<Persona> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(List<Persona> lstPersonas) {
        this.lstPersonas = lstPersonas;
    }
    
    public void borrarPersona() {
        System.out.println("Persona a borrar = " + persona.getNombre() + " " + persona.getApellido());
        lstPersonas.remove(persona);
        
    }
}
