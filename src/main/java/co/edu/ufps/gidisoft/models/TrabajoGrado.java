package co.edu.ufps.gidisoft.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trabajos_grado")
public class TrabajoGrado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String nivel;
    private String estudiante;
    @ManyToOne
    @JoinColumn(name = "director_id")
    private Investigador director;
    @ManyToOne
    @JoinColumn(name = "codirector_id")
    private Investigador coDirector;
    private String estado;
}
