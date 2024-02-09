/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.repositories;


import com.usuarios.usuarios.models.Gestiones_Regimenes_Especiales;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author fasp9
 */
public interface Gestiones_Regimenes_Especiales_Interface extends CrudRepository<Gestiones_Regimenes_Especiales,Integer>{
    
    @Override
    public List<Gestiones_Regimenes_Especiales> findAll();
    
}
