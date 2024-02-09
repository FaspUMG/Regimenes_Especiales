/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.services;

import com.usuarios.usuarios.Dto.Gestiones_Regimenes_Especiales_DTO;
import com.usuarios.usuarios.Dto.Regimenes_Especiales_DTO;
import com.usuarios.usuarios.models.Gestiones_Regimenes_Especiales;
import com.usuarios.usuarios.repositories.Gestiones_Regimenes_Especiales_Interface;
import static java.lang.System.currentTimeMillis;
import java.sql.Time;
import static java.time.Instant.now;
import java.util.Date;
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
public class Gestiones_Regimenes_Especiales_Services {
    @Autowired
    Gestiones_Regimenes_Especiales_Interface Gestiones_Regimenes_Especiales_Interface;
    
     @Transactional
    public List<Gestiones_Regimenes_Especiales> get_All_gestiones_Regimenes() {
        return Gestiones_Regimenes_Especiales_Interface.findAll();
    }
    
    //Metodo para almacenar Data en la Tabla de Gestiones
    @Transactional
   public String Almacenar_Gestion (Gestiones_Regimenes_Especiales_DTO dto) throws Exception{
        java.util.Date fecha = new Date();
       final Gestiones_Regimenes_Especiales gestiones = new Gestiones_Regimenes_Especiales ();
       long currentTimeMillis = System.currentTimeMillis();
       Time currentTime = new Time(currentTimeMillis); 
       gestiones.setCodigo_gestion(dto.getCodigo_gestion());
       gestiones.setCod_origen_solicitud(dto.getCod_origen_solicitud());
       gestiones.setTipo_transaccion(dto.getTipo_transaccion());
       gestiones.setNit_establecimiento(dto.getNit_establecimiento());
       gestiones.setNumero_establecimiento(dto.getNumero_establecimiento());
       gestiones.setEstado(dto.getEstado());
       gestiones.setTipo_usuario(dto.getTipo_usuario());
       gestiones.setUsuario(dto.getUsuario());
       gestiones.setFecha_creacion_solicitud(fecha);
       gestiones.setFecha_confirmacion_solicitud(fecha);
       gestiones.setIp_usuario("192.168.0.1");
       gestiones.setCod_origen_solicitud(dto.getCod_origen_solicitud());
       gestiones.setFecha_estado(fecha);
       gestiones.setUsuario_adiciono(dto.getUsuario_adiciono());
       gestiones.setUsuario_modifico(dto.getUsuario_modifico());
       gestiones.setFecha_transaccion(fecha);
       gestiones.setHora_confirmacion(currentTime);
       
         Gestiones_Regimenes_Especiales_Interface.save(gestiones);
         return "Gestion almacenada con exito";
   }
    
}
