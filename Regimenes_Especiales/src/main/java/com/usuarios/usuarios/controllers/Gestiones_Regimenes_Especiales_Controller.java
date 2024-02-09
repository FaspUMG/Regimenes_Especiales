/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.controllers;

import com.usuarios.usuarios.Dto.Gestiones_Regimenes_Especiales_DTO;
import com.usuarios.usuarios.models.Gestiones_Regimenes_Especiales;
import com.usuarios.usuarios.services.Gestiones_Regimenes_Especiales_Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

/**
 *
 * @author fasp9
 */
@RestController
public class Gestiones_Regimenes_Especiales_Controller {
    @Autowired
    Gestiones_Regimenes_Especiales_Services Gestiones_Regimenes_Especiales_Services;
    
    @ApiOperation(value = "Obtener todos los elementos")
    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping(value="Regimenes/Encuentra_Gestiones")
    public List<Gestiones_Regimenes_Especiales> getAllAgricultor (){
        return Gestiones_Regimenes_Especiales_Services.get_All_gestiones_Regimenes();
    }
    
     //metodo para crear una gestion
    @ApiOperation(value = "Obtener todos los elementos")
    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping(value="Gestiones/Almacenar_Gestion")
    public String InscribirTransportista(
            @RequestBody Gestiones_Regimenes_Especiales_DTO dto
    ) throws Exception{
        return Gestiones_Regimenes_Especiales_Services.Almacenar_Gestion(dto);
    }
}
