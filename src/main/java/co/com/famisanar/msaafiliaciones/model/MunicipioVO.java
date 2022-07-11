package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MunicipioVO implements java.io.Serializable {

    private static final long serialVersionUID = -9145529635180582922L;

    private String id;
    private String munNombre;
    private List<DeptoVO>  depto;
  }
