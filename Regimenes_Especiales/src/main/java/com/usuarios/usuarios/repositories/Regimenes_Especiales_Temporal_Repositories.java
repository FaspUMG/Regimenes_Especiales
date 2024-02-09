/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.repositories;

import com.usuarios.usuarios.models.Regimenes_Especiales_Temporal;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fasp9
 */
public interface Regimenes_Especiales_Temporal_Repositories extends CrudRepository<Regimenes_Especiales_Temporal,Integer> {
    
    @Override
    public List<Regimenes_Especiales_Temporal> findAll();
}
