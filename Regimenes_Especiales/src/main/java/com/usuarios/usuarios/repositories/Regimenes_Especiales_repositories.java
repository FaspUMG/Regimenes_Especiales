/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.repositories;

import com.usuarios.usuarios.models.Regimenes_Especiales;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fasp9
 */
public interface Regimenes_Especiales_repositories extends CrudRepository<Regimenes_Especiales,Integer> {
    @Override
    public List<Regimenes_Especiales> findAll();
}
