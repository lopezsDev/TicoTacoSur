package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ExpressRepository;
import com.TicoTaco.TicoTaco.model.ExpressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface ExpressService {
    List<ExpressModel> getAllExpresses();
    ExpressModel createExpress(ExpressModel express);
}
