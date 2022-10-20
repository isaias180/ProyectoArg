package com.portafolio.mgb.Interface;

import com.portafolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona 
    public void savePersona(Persona persona);
    
    //Eliminar un Usuario
    public void deletePersona(Long id);
    
    //Buscar una Persona por id
    public Persona findPersona(Long id);
}
