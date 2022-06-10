package co.com.famisanar.msaafiliaciones.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(schema = "SEI", name = "PRUEBA")
public class Prueba {

    @Id
    private String id;

    private String nombre;
}
