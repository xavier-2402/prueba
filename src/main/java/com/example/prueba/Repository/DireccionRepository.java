/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.prueba.Repository;

import com.example.prueba.Modelo.Direccion;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author usuario
 */
public interface DireccionRepository extends JpaRepository<Direccion,Long> {
    
}
