package co.com.famisanar.msaafiliaciones.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AsesorVO implements java.io.Serializable {

    private static final long serialVersionUID = -1545441091787120722L;

    private String asrNumautoriz;
    private DeptoVO depto;
    private MunicipioVO municipio;
    private Long asrTidCodigo;
    private String asrIdentific;
    private Boolean asrDigver;
    private String asrNombre;
    private boolean asrTipo;
    private String asrDir;
    private boolean asrIndcoord;
    private BigDecimal asrPctjcomis;
    private String asrTel1;
    private String asrTel2;
    private String asrFax;
    private Byte asrTidCodcoord;
    private String asrIdcoord;
    private Boolean asrEstado;
    private String asrTipnovedad;
    private Date asrFechaingr;
    private Date asrFechareti;
    private Byte asrInternet;
    private String asrLogin;
}
