/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacientesiterator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PICHAU
 */


public class CadastroPacientes {

    private List<Paciente> pacientes = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public IteradorPacientes criarIterador() {
        return new IteradorPacientes(pacientes);
    }
}
