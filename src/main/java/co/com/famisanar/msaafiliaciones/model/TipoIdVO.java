package co.com.famisanar.msaafiliaciones.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoIdVO implements java.io.Serializable {

    private static final long serialVersionUID = -5551734832027931550L;

    private Long tidCodigo;
    private String tidDescripci;
    private String tidAportes;
    private Integer tidTipo;
    private Set<AfiliadoVO> afiliados = new HashSet<AfiliadoVO>(0);
}

