package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IpsxafilVO implements java.io.Serializable {


    private IpsxafilId id;
    private Integer ipafTipoprest;

    private Date ipafFechmodi;
    private Integer ipafIndcambio;
    private Integer ipafIndconsol;
    private Date ipafFechagrab;
    private String ipafTipnovedad;
    private String ipafIptCodeps;
    private Date ipafFuiFecharadi;
    private Long ipafFuiNumerorad;
    private Date ipafFechaFinServ;
    private AfiliadoVO afiliado;
}
