package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(schema = "SEI", name = "PRUEBA")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AfiliadoVO {

    @Id
    private AfiliadoId id;
    private String afiApellido1;
    private String afiApellido2;
    private String afiNombres;
    private Date afiFechaNaci;
    private char afiSexo;
    private String afiDirres;
    private Date afiFechafil;
    private MunicipioVO municipioAfi;
    private int afiEstCodigo;
    private Long afiTipcotiza;
    private String afiEstado;
    private String afiMesesmora;
    private String afiAfpCodigo;

    public static final Short CAUSAL_RETIRO = Short.parseShort("33"); // Codigo de causal de retiro cuando de contributivo pasa a subsidiados
}
