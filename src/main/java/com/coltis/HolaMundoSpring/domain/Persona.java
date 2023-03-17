package com.coltis.HolaMundoSpring.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    // Atributos de instancia de Persona
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
        private String nombre; // El nombre de la persona
    
    @NotEmpty
    @Email
    private String apellido; // El apellido de la persona
    
    @NotEmpty
    private String email; // El correo electrónico de la persona
    
    @NotEmpty
    private String telefono; // El número de teléfono de la persona
}
