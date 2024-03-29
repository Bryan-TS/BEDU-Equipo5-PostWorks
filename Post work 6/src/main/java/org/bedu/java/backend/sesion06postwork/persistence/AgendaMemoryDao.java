package org.bedu.java.backend.sesion06postwork.persistence;

import org.springframework.stereotype.Repository;
import org.bedu.java.backend.sesion06postwork.model.Persona;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@Repository
public class AgendaMemoryDao {
    private static final SortedSet<Persona> personas = new TreeSet<>();

    public Persona guardaPersona(Persona persona) {
        personas.add(persona);
        return persona;
    }

    public Set<Persona> getPersonas() {
        return personas;
    }

}
