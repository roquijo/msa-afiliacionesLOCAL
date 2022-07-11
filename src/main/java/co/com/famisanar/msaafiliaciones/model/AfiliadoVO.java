package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(schema = "SEI", name = "PRUEBA")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AfiliadoVO implements java.io.Serializable{

    private static final long serialVersionUID = -5114065913911083050L;

    @Id
    private AfiliadoId id;
    private MunicipioVO municipioByFAfiMuntra;
    private MunicipioVO municipioByFAfiMunres;
    private MunicipioVO municipioByFAfiMuncorresp;
    private TipoIdVO tipoid;
    @ManyToOne
    @JoinColumn(name = "afiliado_id")
    private AfiliadoVO afiliado;
    private String afiApellido1;
    private String afiApellido2;
    private String afiNombres;
    private Date afiFechanaci;
    private String afiSexo;
    private String afiDirres;
    private String afiDircorresp;
    private Date afiFechafil;
    private String afiEstCodigo;
    private Long afiTipcotiza;
    private Integer afiEstado;
    private String afiPendcarne;
    private String afiDirtra;
    private String afiPlnCodigo1;
    private String afiPlnCodigo2;
    private String afiAfpCodigo;
    private BigDecimal afiPorctjupc;
    private BigDecimal afiSaldopos;
    private BigDecimal afiSaldopc;
    private String afiTelres;
    private String afiTelcorresp;
    private String afiTeltra;
    private String afiFax;
    private String afiTelMovil;
    private String afiEpsCodigo;
    private Date afiFechcarne;
    private Date afiFechaipos;
    private Date afiFechafpos;
    private Date afiFechaipc;
    private Date afiFechafpc;
    private Date afiFechafser;
    private Short afiCausalret;
    private Byte afiParCodigo;
    private Boolean afiDigver;
    private Boolean afiPendbono;
    private Integer afiIndupcadi;
    private BigDecimal afiFactupc;
    private Byte afiTidCodconcom;
    private String afiIdeconcom;
    private Byte afiTidCodcabcom;
    private String afiIdecabcom;
    private Boolean afiTipercom;
    private String afiNumconcom;
    private String afiRsgCodigo;
    private Date afiFecnopago;
    private Boolean afiEstadopac;
    private Date afiFechretpo;
    private Date afiFechretpc;
    private Date afiFechafilpc;
    private Short afiSemcotpos;
    private Short afiSemcotpc;
    private Date afiFecfserpc;
    private String afiRsgCodigo2;
    private String afiOfCodigo1;
    private String afiOfCodigo2;
    private String afiEtaCodigo;
    private Date afiEtaPeriodo;
    private Boolean afiVivienda;
    private Boolean afiEduca;
    private Boolean afiUltapro;
    private Boolean afiAgro;
    private Boolean afiZona;
    private Boolean afiPosiocup;
    private Boolean afiTamaemp;
    private Byte afiNumcarpos;
    private Byte afiNumcarpac;
    private String afiPafCodigo;
    private BigDecimal afiTotcopago;
    private String afiEtaCodigoSs;
    private Date afiEtaPeriodoSs;
    private boolean afiIndconsol;
    private Date afiFechagrab;
    private String afiTipnovedad;
    private Short afiSemcoteps;
    private Boolean afiReganterior;
    private String afiMes;
    private Boolean afiIndnoupc;
    private Date afiFecafireg;
    private String afiUsuCodigo;
    private Date afiFecradafi;
    private Integer afiEsafEstado;
    private String afiMesesmora;
    private String afiCorreoElectronico;
    private Boolean afiEstrato;
    private Short afiBarrio;
    private String afiLocalidad;
    private BigDecimal afiCx;
    private BigDecimal afiCy;
    private BigDecimal afiLongitud;
    private BigDecimal afiLatitud;

    public static final Short CAUSAL_RETIRO = Short.parseShort("33"); // Codigo de causal de retiro cuando de contributivo pasa a subsidiados
}
