package com.coltis.HolaMundoSpring.servicio;

import com.coltis.HolaMundoSpring.dao.PersonaDao;
import com.coltis.HolaMundoSpring.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service // Anotación para declarar la clase como un servicio de Spring
public class PersonaServiceImpl implements PersonaService {

    @Autowired // Inyección de dependencias de la interfaz PersonaDao
    private PersonaDao personaDao;

    // Implementación de los métodos declarados en la interfaz PersonaService
    @Override
    @Transactional(readOnly = true) // Anotación para declarar la transaccionalidad del método
    public List<Persona> listarPersonas() {
        // Llamada al método findAll() de PersonaDao para listar todas las personas
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional // Anotación para declarar la transaccionalidad del método
    public void guardar(Persona persona) {
        personaDao.save(persona); // Llamada al método save() de PersonaDao para guardar la persona
    }

    @Override
    @Transactional // Anotación para declarar la transaccionalidad del método
    public void eliminar(Persona persona) {
        personaDao.delete(persona); // Llamada al método delete() de PersonaDao para eliminar la persona
    }

    @Override
    @Transactional(readOnly = true) // Anotación para declarar la transaccionalidad del método
    public Persona encontrarPersona(Persona persona) {
        // Llamada al método findById() de PersonaDao para buscar la persona por su ID
        return personaDao.findById(persona.getIdPersona()).orElse(null); 
    }
}
