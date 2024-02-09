/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.Dto;

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
public class Regimenes_Especiales_DTO {
    private String nit_establecimiento;
    private String codigo_gestion;
    private String nit_administrador;
    private Integer numero_establecimiento;
    private Integer calificacion_establecimiento;
    private Integer tipo_calificacion;
    private Boolean beneficio_isr;
    private Integer tipos_calificacion_zonas_francas;
    private Integer tipo_usuario;
    private String numero_resolucion;
    private Integer estado;
    private Date fecha_resolucion;
    private Date fecha_fin_resolucion;
    private Date fecha_notificacion;
    private String usuario_adiciono;
    private String usuario_modifico;
    private Date fecha_adiciono;
    private Date fecha_modifico;
    private Integer cantidad_anios;
    private Date fecha_fin_beneficio;
    private String motivo_revocatoria;
    private Date fecha_notificacion_revocatoria;
    private String numero_resolucion_revocatoria;
    private String field;
}
