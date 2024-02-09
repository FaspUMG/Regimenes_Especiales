/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.controllers;

import com.usuarios.usuarios.models.Regimenes_Especiales_Temporal;
import com.usuarios.usuarios.services.Regimenes_Especiales_Temporal_Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fasp9
 */
@RestController
public class Regimenes_Especiales_Temporal_Controller {
    @Autowired
    Regimenes_Especiales_Temporal_Services Regimenes_Especiales_Temporal_Services;
    
    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping(value="Regimenes/get_All_Regimenes_Temporal")
    public List<Regimenes_Especiales_Temporal> getAllAgricultor (){
        return Regimenes_Especiales_Temporal_Services.get_All_Regimenes_Temporal();
    }
}
