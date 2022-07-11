package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IpsxafilId implements java.io.Serializable {


    private Integer ipafAfiTidCodigo;
    private String ipafAfiIdentific;
    private Integer ipafIpsTidCodigo;
    private String ipafIpsIdentific;
    private Integer ipafEstado;
}

