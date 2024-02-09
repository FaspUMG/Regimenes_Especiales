/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.services;

import com.usuarios.usuarios.models.Regimenes_Especiales_Temporal;
import com.usuarios.usuarios.repositories.Regimenes_Especiales_Temporal_Repositories;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fasp9
 */
@Service
@Transactional
public class Regimenes_Especiales_Temporal_Services {
    @Autowired
    Regimenes_Especiales_Temporal_Repositories Regimenes_Especiales_Temporal_Repositories;
    
    @Transactional
    public List<Regimenes_Especiales_Temporal> get_All_Regimenes_Temporal() {
        return Regimenes_Especiales_Temporal_Repositories.findAll();
    }
}
