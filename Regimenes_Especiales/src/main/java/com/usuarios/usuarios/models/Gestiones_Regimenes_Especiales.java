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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fasp9
 */
@Entity
@Table(name="Gestiones_Regimenes_Especiales", schema="public")
public class Gestiones_Regimenes_Especiales {
    
    private String codigo_gestion;
    private Integer tipo_transaccion;
    private String nit_establecimiento;
    private Integer numero_establecimiento;
    private Integer estado;
    private String tipo_usuario;
    private String usuario;
    private Date fecha_creacion_solicitud;
    private Date fecha_confirmacion_solicitud;
    private String ip_usuario;
    private Integer cod_origen_solicitud;
    private Date fecha_estado;
    private String usuario_adiciono;
    private String usuario_modifico;
    private Date fecha_transaccion;
    private Time hora_confirmacion;

    public Gestiones_Regimenes_Especiales() {
    }

    public Gestiones_Regimenes_Especiales(String codigo_gestion, Integer tipo_transaccion, String nit_establecimiento, Integer numero_establecimiento, Integer estado, String tipo_usuario, String usuario, Date fecha_creacion_solicitud, Date fecha_confirmacion_solicitud, String ip_usuario, Integer cod_origen_solicitud, Date fecha_estado, String usuario_adiciono, String usuario_modifico, Date fecha_transaccion, Time hora_confirmacion) {
        this.codigo_gestion = codigo_gestion;
        this.tipo_transaccion = tipo_transaccion;
        this.nit_establecimiento = nit_establecimiento;
        this.numero_establecimiento = numero_establecimiento;
        this.estado = estado;
        this.tipo_usuario = tipo_usuario;
        this.usuario = usuario;
        this.fecha_creacion_solicitud = fecha_creacion_solicitud;
        this.fecha_confirmacion_solicitud = fecha_confirmacion_solicitud;
        this.ip_usuario = ip_usuario;
        this.cod_origen_solicitud = cod_origen_solicitud;
        this.fecha_estado = fecha_estado;
        this.usuario_adiciono = usuario_adiciono;
        this.usuario_modifico = usuario_modifico;
        this.fecha_transaccion = fecha_transaccion;
        this.hora_confirmacion = hora_confirmacion;
    }

    @Id
    @Column (name="codigo_gestion", length=50)
    public String getCodigo_gestion() {
        return codigo_gestion;
    }

    public void setCodigo_gestion(String codigo_gestion) {
        this.codigo_gestion = codigo_gestion;
    }

    @Column (name="tipo_transaccion")
    public Integer getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(Integer tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    @Column (name="nit_establecimiento", length=50)
    public String getNit_establecimiento() {
        return nit_establecimiento;
    }

    public void setNit_establecimiento(String nit_establecimiento) {
        this.nit_establecimiento = nit_establecimiento;
    }

    @Column (name="numero_establecimiento")
    public Integer getNumero_establecimiento() {
        return numero_establecimiento;
    }

    public void setNumero_establecimiento(Integer numero_establecimiento) {
        this.numero_establecimiento = numero_establecimiento;
    }

    @Column (name="estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column (name="tipo_usuario", length=50)
    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    @Column (name="usuario", length=50)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Column (name="fecha_creacion_solicitud")
    public Date getFecha_creacion_solicitud() {
        return fecha_creacion_solicitud;
    }

    public void setFecha_creacion_solicitud(Date fecha_creacion_solicitud) {
        this.fecha_creacion_solicitud = fecha_creacion_solicitud;
    }

    @Column (name="fecha_confirmacion_solicitud")
    public Date getFecha_confirmacion_solicitud() {
        return fecha_confirmacion_solicitud;
    }

    public void setFecha_confirmacion_solicitud(Date fecha_confirmacion_solicitud) {
        this.fecha_confirmacion_solicitud = fecha_confirmacion_solicitud;
    }

    @Column (name="ip_usuario", length=50)
    public String getIp_usuario() {
        return ip_usuario;
    }

    public void setIp_usuario(String ip_usuario) {
        this.ip_usuario = ip_usuario;
    }

    @Column (name="cod_origen_solicitud")
    public Integer getCod_origen_solicitud() {
        return cod_origen_solicitud;
    }

    public void setCod_origen_solicitud(Integer cod_origen_solicitud) {
        this.cod_origen_solicitud = cod_origen_solicitud;
    }

    @Column (name="fecha_estado")
    public Date getFecha_estado() {
        return fecha_estado;
    }

    public void setFecha_estado(Date fecha_estado) {
        this.fecha_estado = fecha_estado;
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

    @Column (name="fecha_transaccion")
    public Date getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(Date fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    @Column (name="hora_confirmacion")
    public Time getHora_confirmacion() {
        return hora_confirmacion;
    }

    public void setHora_confirmacion(Time hora_confirmacion) {
        this.hora_confirmacion = hora_confirmacion;
    }

    
}
