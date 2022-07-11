package co.com.famisanar.msaafiliaciones.service;

import co.com.famisanar.msaafiliaciones.model.AfiliadoVO;
import co.com.famisanar.msaafiliaciones.repository.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PruebaService {

    @Autowired
    private PruebaRepository pruebaRepository;

    public List<AfiliadoVO> getPruebas() {
        return pruebaRepository.findAll();
    }
}
