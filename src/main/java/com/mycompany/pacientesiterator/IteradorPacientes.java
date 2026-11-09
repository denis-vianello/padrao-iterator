/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacientesiterator;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author PICHAU
 */

public class IteradorPacientes implements Iterator<Paciente> {

    private List<Paciente> pacientes;
    private int posicao = 0;

    public IteradorPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public boolean hasNext() {
        return posicao < pacientes.size();
    }

    @Override
    public Paciente next() {
        return pacientes.get(posicao++);
    }
}