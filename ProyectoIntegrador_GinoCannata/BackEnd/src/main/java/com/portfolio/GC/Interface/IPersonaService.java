
package com.portfolio.GC.Interface;

import com.portfolio.GC.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer persona
    public List<Persona> getPersona(); 
    
    //Guardar persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findePersona(Long id);
}
