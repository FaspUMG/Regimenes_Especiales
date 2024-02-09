/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.Dto;

import java.sql.Time;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author fasp9
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Gestiones_Regimenes_Especiales_DTO {
    private String codigo_gestion;
    private Integer tipo_transaccion;
    private String nit_establecimiento;
    private Integer numero_establecimiento;
    private Integer estado;
    private String tipo_usuario;
    private String usuario;
    //private Date fecha_creacion_solicitud;
    //private Date fecha_confirmacion_solicitud;
    //private String ip_usuario;
    private Integer cod_origen_solicitud;
    //private Date fecha_estado;
    private String usuario_adiciono;
    private String usuario_modifico;
    //private Date fecha_transaccion;
    //private Time hora_confirmacion;
}
