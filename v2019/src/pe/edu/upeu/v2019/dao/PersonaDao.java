/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.v2019.dao;

import java.util.List;
import pe.edu.upeu.v2019.entity.Persona;

/**
 *
 * @author alum.fial1
 */
public interface PersonaDao {
    int create(Persona p);
    int update(Persona p);
    int delete(int key);
    Persona read(int key);
    List<Persona> readAll(String dni);
    List<Persona> readAll();
}
