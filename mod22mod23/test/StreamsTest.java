

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

/**
 * @author carolina on 25/mar/2022
 * @project tarefas-ebac-Carolina-Fonseca
 * Atividade Módulo 23 - Testes unitários com JUnit 4
 */
public class StreamsTest {
    @Test
    public void deveRetornarNomesFemininos() {
        //cenário

        //Configurando o input do teste para que não seja uma leitura do console, mas sim uma string
        String input = "carol-f,joao-m,jose-m";
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);

        //Configurando a leitura do output do teste para que não seja no console, mas sim uma string
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        //ação
        Streams.listaDeNomesFemininos();


        String[] lines = outputStream.toString().split(System.lineSeparator());
        String actual = lines[lines.length - 1];

        String expected = "Carol-F";

        //resultado
        assertEquals(expected, actual);
    }

    @Test
    public void naoDeveRetornarNomesFemininos() {
        //cenário

        //Configurando o input do teste para que não seja uma leitura do console, mas sim uma string
        String input = "joao-m,jose-m";
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);

        //Configurando a leitura do output do teste para que não seja no console, mas sim uma string
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        //ação
        Streams.listaDeNomesFemininos();


        String[] lines = outputStream.toString().split(System.lineSeparator());
        String actual = "";
        if (lines.length > 1)
            actual = lines[lines.length - 1];

        String expected = "";

        //resultado
        assertEquals(expected, actual);
    }

    @Test
    public void naoDeveRetornarNadaCasoGeneroSejaInvalido() {
        //cenário

        //Configurando o input do teste para que não seja uma leitura do console, mas sim uma string
        String input = "joao-p,jose-m";
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);

        //Configurando a leitura do output do teste para que não seja no console, mas sim uma string
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        //ação
        Streams.listaDeNomesFemininos();


        String[] lines = outputStream.toString().split(System.lineSeparator());
        String actual = lines[lines.length - 1];

        String expected =
                "Gênero inválido, por favor, tente novamente. Por enquanto, só aceitamos (F) Feminino ou (M) Masculino";

        //resultado
        assertEquals(expected, actual);
    }

    @Test
    public void naoDeveRetornarNadaCasoFalteGeneroDeAlguem() {
        //cenário

        //Configurando o input do teste para que não seja uma leitura do console, mas sim uma string
        String input = "joao,jose-m";
        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);

        //Configurando a leitura do output do teste para que não seja no console, mas sim uma string
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        //ação
        Streams.listaDeNomesFemininos();


        String[] lines = outputStream.toString().split(System.lineSeparator());
        String actual = lines[lines.length - 1];

        String expected =
                "Faltou a inclusão do gênero de joao";

        //resultado
        assertEquals(expected, actual);
    }
}
