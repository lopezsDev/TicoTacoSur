package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ContactoRepository;
import com.TicoTaco.TicoTaco.model.ContactoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoService {

    private final ContactoRepository contactoRepository;

    @Autowired
    public ContactoService(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    public List<ContactoModel> getAllContactos() {
        return contactoRepository.findAll();
    }

    public Optional<ContactoModel> getContactoById(Long id) {
        return contactoRepository.findById(id);
    }

    public ContactoModel createContacto(ContactoModel contacto) {
        return contactoRepository.save(contacto);
    }

    public ContactoModel updateContacto(long id, ContactoModel contactoDetails) {
        ContactoModel contacto = contactoRepository.findById(id).orElse(null);

        if (contacto != null) {
            contacto.setTelefono(contactoDetails.getTelefono());
            contacto.setEmail(contactoDetails.getEmail());

            return contactoRepository.save(contacto);
        } else {
            return null;
        }
    }

    public void deleteContacto(Long id) {
        contactoRepository.deleteById(id);
    }
}
