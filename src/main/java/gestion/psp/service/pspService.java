package gestion.psp.service;

import gestion.psp.dto.pspDto;
import gestion.psp.entity.psp;
import gestion.psp.repository.IpspRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class pspService {

    @Autowired
    private IpspRepository pspRepository;

    public List<psp> findAll() {
        return pspRepository.findAll();
    }

    public psp findById(Long id) {
        return pspRepository.findById(id).orElse(null);
    }

    public psp createPSP(pspDto pspDto) {
        psp pspEntity = new psp();
        // Mapea los valores del DTO a la entidad psp
        // Esto depende de la estructura de tu entidad y DTO

        return pspRepository.save(pspEntity);
    }

    public void delete(Long id) {
        pspRepository.deleteById(id);
    }

    public psp updatePSP(Long id, pspDto pspDto) {
        psp pspEntity = pspRepository.findById(id).orElse(null);

        if (pspEntity != null) {
            // Actualiza los campos de psp con los valores del DTO
            // Esto depende de la estructura de tu entidad y DTO

            return pspRepository.save(pspEntity);
        }

        return null; // Devuelve null si no se encuentra la entidad
    }
}

