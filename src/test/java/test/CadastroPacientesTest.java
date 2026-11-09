/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.pacientesiterator.CadastroPacientes;
import com.mycompany.pacientesiterator.Paciente;
import com.mycompany.pacientesiterator.IteradorPacientes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroPacientesTest {

    @Test
    public void testarPercorrerPacientes() {
        CadastroPacientes cadastro = new CadastroPacientes();

        cadastro.adicionarPaciente(new Paciente("Joao", "111", 35));
        cadastro.adicionarPaciente(new Paciente("Maria", "222", 42));
        cadastro.adicionarPaciente(new Paciente("Carlos", "333", 28));

        IteradorPacientes iterador = cadastro.criarIterador();

        assertTrue(iterador.hasNext());
        assertEquals("Joao", iterador.next().getNome());

        assertTrue(iterador.hasNext());
        assertEquals("Maria", iterador.next().getNome());

        assertTrue(iterador.hasNext());
        assertEquals("Carlos", iterador.next().getNome());

        assertFalse(iterador.hasNext());
    }

    @Test
    public void testarCadastroVazio() {
        CadastroPacientes cadastro = new CadastroPacientes();

        IteradorPacientes iterador = cadastro.criarIterador();

        assertFalse(iterador.hasNext());
    }
}