package co.com.famisanar.msaafiliaciones.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeptoVO implements java.io.Serializable {

    private static final long serialVersionUID = 3813470224955172387L;

    private String depCodigo;
    private String depNombre;
}
