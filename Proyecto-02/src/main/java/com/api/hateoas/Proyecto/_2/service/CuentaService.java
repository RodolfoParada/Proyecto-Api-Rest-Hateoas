package com.api.hateoas.Proyecto._2.service;

import com.api.hateoas.Proyecto._2.Exception.CuentaNotFoundException;
import com.api.hateoas.Proyecto._2.model.Cuenta;
import com.api.hateoas.Proyecto._2.repositorio.CuentaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> listAll(){
        return this.cuentaRepository.findAll();
    }
    public Cuenta get(Integer id){
        return this.cuentaRepository.findById(id).get();
    }
    public Cuenta save(Cuenta cuenta){
        return this.cuentaRepository.save(cuenta);
    }
    public void delete(Integer id) throws CuentaNotFoundException {
        if(!cuentaRepository.existsById(id)){
            throw new CuentaNotFoundException("Cuenta no encontrada con el ID : " + id);
        }
        this.cuentaRepository.deleteById(id);
    }
    public Cuenta depositar(float monto, Integer id){
        cuentaRepository.actualizarMonto( monto, id);
        return cuentaRepository.findById(id).get();
    }
    public Cuenta retirar(float monto, Integer id){
        cuentaRepository.actualizarMonto( -monto, id);
        return cuentaRepository.findById(id).get();

    }
}
