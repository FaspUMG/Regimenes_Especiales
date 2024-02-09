/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.usuarios.models;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fasp9
 */
@Entity
@Table(name="Regimenes_Especiales", schema="public")
public class Regimenes_Especiales {
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

    public Regimenes_Especiales() {
    }

    public Regimenes_Especiales(String nit_establecimiento, String codigo_gestion, String nit_administrador, Integer numero_establecimiento, Integer calificacion_establecimiento, Integer tipo_calificacion, Boolean beneficio_isr, Integer tipos_calificacion_zonas_francas, Integer tipo_usuario, String numero_resolucion, Integer estado, Date fecha_resolucion, Date fecha_fin_resolucion, Date fecha_notificacion, String usuario_adiciono, String usuario_modifico, Date fecha_adiciono, Date fecha_modifico, Integer cantidad_anios, Date fecha_fin_beneficio, String motivo_revocatoria, Date fecha_notificacion_revocatoria, String numero_resolucion_revocatoria, String field) {
        this.nit_establecimiento = nit_establecimiento;
        this.codigo_gestion = codigo_gestion;
        this.nit_administrador = nit_administrador;
        this.numero_establecimiento = numero_establecimiento;
        this.calificacion_establecimiento = calificacion_establecimiento;
        this.tipo_calificacion = tipo_calificacion;
        this.beneficio_isr = beneficio_isr;
        this.tipos_calificacion_zonas_francas = tipos_calificacion_zonas_francas;
        this.tipo_usuario = tipo_usuario;
        this.numero_resolucion = numero_resolucion;
        this.estado = estado;
        this.fecha_resolucion = fecha_resolucion;
        this.fecha_fin_resolucion = fecha_fin_resolucion;
        this.fecha_notificacion = fecha_notificacion;
        this.usuario_adiciono = usuario_adiciono;
        this.usuario_modifico = usuario_modifico;
        this.fecha_adiciono = fecha_adiciono;
        this.fecha_modifico = fecha_modifico;
        this.cantidad_anios = cantidad_anios;
        this.fecha_fin_beneficio = fecha_fin_beneficio;
        this.motivo_revocatoria = motivo_revocatoria;
        this.fecha_notificacion_revocatoria = fecha_notificacion_revocatoria;
        this.numero_resolucion_revocatoria = numero_resolucion_revocatoria;
        this.field = field;
    }

    @Id
    @Column (name="nit_establecimiento", length=50)
    public String getNit_establecimiento() {
        return nit_establecimiento;
    }

    public void setNit_establecimiento(String nit_establecimiento) {
        this.nit_establecimiento = nit_establecimiento;
    }

    @Column (name="codigo_gestion", length=50)
    public String getCodigo_gestion() {
        return codigo_gestion;
    }

    public void setCodigo_gestion(String codigo_gestion) {
        this.codigo_gestion = codigo_gestion;
    }

    @Column (name="nit_administrador", length=50)
    public String getNit_administrador() {
        return nit_administrador;
    }

    public void setNit_administrador(String nit_administrador) {
        this.nit_administrador = nit_administrador;
    }

    @Column (name="numero_establecimiento")
    public Integer getNumero_establecimiento() {
        return numero_establecimiento;
    }

    public void setNumero_establecimiento(Integer numero_establecimiento) {
        this.numero_establecimiento = numero_establecimiento;
    }

    @Column (name="calificacion_establecimiento")
    public Integer getCalificacion_establecimiento() {
        return calificacion_establecimiento;
    }

    public void setCalificacion_establecimiento(Integer calificacion_establecimiento) {
        this.calificacion_establecimiento = calificacion_establecimiento;
    }

    @Column (name="tipo_calificacion")
    public Integer getTipo_calificacion() {
        return tipo_calificacion;
    }

    public void setTipo_calificacion(Integer tipo_calificacion) {
        this.tipo_calificacion = tipo_calificacion;
    }

    @Column (name="beneficio_isr")
    public Boolean getBeneficio_isr() {
        return beneficio_isr;
    }

    public void setBeneficio_isr(Boolean beneficio_isr) {
        this.beneficio_isr = beneficio_isr;
    }

    @Column (name="tipos_calificacion_zonas_francas")
    public Integer getTipos_calificacion_zonas_francas() {
        return tipos_calificacion_zonas_francas;
    }

    public void setTipos_calificacion_zonas_francas(Integer tipos_calificacion_zonas_francas) {
        this.tipos_calificacion_zonas_francas = tipos_calificacion_zonas_francas;
    }

    @Column (name="tipo_usuario")
    public Integer getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Integer tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Column (name="numero_resolucion", length=50)
    public String getNumero_resolucion() {
        return numero_resolucion;
    }

    public void setNumero_resolucion(String numero_resolucion) {
        this.numero_resolucion = numero_resolucion;
    }

    @Column (name="estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column (name="fecha_resolucion")
    public Date getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(Date fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    @Column (name="fecha_fin_resolucion")
    public Date getFecha_fin_resolucion() {
        return fecha_fin_resolucion;
    }

    public void setFecha_fin_resolucion(Date fecha_fin_resolucion) {
        this.fecha_fin_resolucion = fecha_fin_resolucion;
    }

    @Column (name="fecha_notificacion")
    public Date getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(Date fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }

    @Column (name="usuario_adiciono", length=50)
    public String getUsuario_adiciono() {
        return usuario_adiciono;
    }

    public void setUsuario_adiciono(String usuario_adiciono) {
        this.usuario_adiciono = usuario_adiciono;
    }

    @Column (name="usuario_modifico", length=50)
    public String getUsuario_modifico() {
        return usuario_modifico;
    }

    public void setUsuario_modifico(String usuario_modifico) {
        this.usuario_modifico = usuario_modifico;
    }

    @Column (name="fecha_adiciono")
    public Date getFecha_adiciono() {
        return fecha_adiciono;
    }

    public void setFecha_adiciono(Date fecha_adiciono) {
        this.fecha_adiciono = fecha_adiciono;
    }

    @Column (name="fecha_modifico")
    public Date getFecha_modifico() {
        return fecha_modifico;
    }

    public void setFecha_modifico(Date fecha_modifico) {
        this.fecha_modifico = fecha_modifico;
    }

    @Column (name="cantidad_anios")
    public Integer getCantidad_anios() {
        return cantidad_anios;
    }

    public void setCantidad_anios(Integer cantidad_anios) {
        this.cantidad_anios = cantidad_anios;
    }

    @Column (name="fecha_fin_beneficio")
    public Date getFecha_fin_beneficio() {
        return fecha_fin_beneficio;
    }

    public void setFecha_fin_beneficio(Date fecha_fin_beneficio) {
        this.fecha_fin_beneficio = fecha_fin_beneficio;
    }

    @Column (name="motivo_revocatoria", length=50)
    public String getMotivo_revocatoria() {
        return motivo_revocatoria;
    }

    public void setMotivo_revocatoria(String motivo_revocatoria) {
        this.motivo_revocatoria = motivo_revocatoria;
    }

    @Column (name="fecha_notificacion_revocatoria")
    public Date getFecha_notificacion_revocatoria() {
        return fecha_notificacion_revocatoria;
    }

    public void setFecha_notificacion_revocatoria(Date fecha_notificacion_revocatoria) {
        this.fecha_notificacion_revocatoria = fecha_notificacion_revocatoria;
    }

    @Column (name="numero_resolucion_revocatoria", length=50)
    public String getNumero_resolucion_revocatoria() {
        return numero_resolucion_revocatoria;
    }

    public void setNumero_resolucion_revocatoria(String numero_resolucion_revocatoria) {
        this.numero_resolucion_revocatoria = numero_resolucion_revocatoria;
    }

    @Column (name="field", length=50)
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }  
    
}
