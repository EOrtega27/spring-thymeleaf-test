package ed.example.oc.thymeleafDemo.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    private static final long serialversionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column
    @NotEmpty
    private String name;
    private String lastname;
    private String email;
    private String phone;
}
