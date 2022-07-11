package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MunicipioVO implements java.io.Serializable {

    private MunicipioId id;
    private DeptoVO depto;
    private String munNombre;
    private BigDecimal munFactorupc;
    private String munRegional;
    private Set<AsesorVO> asesors = new HashSet<AsesorVO>(0);
    private Set<AfiliadoVO> afiliadosForFAfiMunres = new HashSet<AfiliadoVO>(0);
    private Set<AfiliadoVO> afiliadosForFAfiMuntra = new HashSet<AfiliadoVO>(0);

}
