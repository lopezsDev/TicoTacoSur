package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.HorasExtraRepository;
import com.TicoTaco.TicoTaco.model.HorasExtraModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorasExtraService {

    private final HorasExtraRepository horasExtraRepository;

    @Autowired
    public HorasExtraService(HorasExtraRepository horasExtraRepository) {
        this.horasExtraRepository = horasExtraRepository;
    }

    public List<HorasExtraModel> getAllHorasExtra() {
        return horasExtraRepository.findAll();
    }

    public Optional<HorasExtraModel> getHorasExtraById(Long id) {
        return horasExtraRepository.findById(id);
    }

    public HorasExtraModel createHorasExtra(HorasExtraModel horasExtra) {
        return horasExtraRepository.save(horasExtra);
    }

    public HorasExtraModel updateHorasExtra(Long id, HorasExtraModel horasExtraDetails) {
        Optional<HorasExtraModel> optionalHorasExtra = horasExtraRepository.findById(id);
        if (optionalHorasExtra.isPresent()) {
            HorasExtraModel horasExtra = optionalHorasExtra.get();
            horasExtra.setCantidadHoras(horasExtraDetails.getCantidadHoras());
            horasExtra.setMontoHorasExtra(horasExtraDetails.getMontoHorasExtra());
            return horasExtraRepository.save(horasExtra);
        }
        return null;
    }

    public void deleteHorasExtra(Long id) {
        horasExtraRepository.deleteById(id);
    }
}
