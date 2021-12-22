/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntasrespuestas;

import java.util.Scanner;



/**
 *
 * @author PERSONAL
 */
public class PreguntasRespuestas {

    public static void main(String[] args) {

        
              Pregunta[] preguntas = {
            new Pregunta("Creador de PHP", new Respuesta[] {
                    new Respuesta("Bill Gates", 'A', false),
                    new Respuesta("Steve Jobs", 'B', false),
                    new Respuesta("Rasmus Lerdorf", 'C', true)
            }),
            new Pregunta("NetBeans es un lenguaje de programacion", new Respuesta[] {
                    new Respuesta("Verdadero", 'A', false),
                    new Respuesta("Falso", 'B', true),
            }),
            new Pregunta("Funcion Javascript para decodificar una cadena JSON", new Respuesta[] {
                    new Respuesta("json_decode", 'A', false),
                    new Respuesta("eval", 'B', false),
                    new Respuesta("JSON.parse", 'C', true),
                    new Respuesta("JSON.decode", 'D', false),
            }),
            new Pregunta("Javascript es lo mismo que Java", new Respuesta[] {
                    new Respuesta("Verdadero", 'A', false),
                    new Respuesta("Falso", 'B', true),
            }),
            new Pregunta("En Javascript no necesitamos punto y coma", new Respuesta[] {
                    new Respuesta("Verdadero", 'A', false),
                    new Respuesta("Falso", 'B', true),
            }),
            new Pregunta("jQuery es un lenguaje de programacion", new Respuesta[] {
                    new Respuesta("Verdadero", 'A', false),
                    new Respuesta("Falso", 'B', true),
            }),
                      
            new Pregunta("HTML es un lenguaje de programacion", new Respuesta[] {
                    new Respuesta("Falso", 'A', true),
                    new Respuesta("Verdadero", 'B', false),
            }),
            new Pregunta("Lenguaje de programación más fácil de aprender", new Respuesta[] {
                    new Respuesta("Python", 'A', true),
                    new Respuesta("Java", 'B', false),
            }),
            new Pregunta("¿Qué tecnología se utiliza para hacer posibles las llamadas telefónicas a través de Internet?", new Respuesta[] {
                    new Respuesta("Ethernet", 'A', false),
                    new Respuesta("eval", 'B', false),
                    new Respuesta("VoIP", 'C', true),
                    new Respuesta("Bluetooh", 'D', false),
            }),
            new Pregunta("¿Qué lenguaje informático es el más utilizado?", new Respuesta[] {
                    new Respuesta("C++", 'A', false),
                    new Respuesta("Java", 'B', true),
            }),
            new Pregunta("¿Cuál es la red social más usada del mundo?", new Respuesta[] {
                    new Respuesta("Instagram", 'A', false),
                    new Respuesta("Facebook", 'B', true),
            }),
            new Pregunta("¿Cuál es la página de Internet más visitada del mundo?", new Respuesta[] {
                    new Respuesta("Facebook", 'A', false),
                    new Respuesta("Google", 'B', true),
                    new Respuesta("Baidu", 'B', false),
            }),
                      
            new Pregunta("¿Cuándo se fundó Nintendo?", new Respuesta[] {
                    new Respuesta("1974", 'A', false),
                    new Respuesta("1889", 'B', true),
                    new Respuesta("1999", 'B', false),
            })          
                      
            
        };

        for (Pregunta p: preguntas) {
            p.preguntar();
        }
    }
}

class Pregunta {
    private String pregunta;
    private Respuesta[] respuestasPosibles;
    public Pregunta(String pregunta, Respuesta[] respuestasPosibles) {
        this.pregunta = pregunta;
        this.respuestasPosibles = respuestasPosibles;
    }

    public void preguntar() {
        System.out.println(this.pregunta);        

        char letraCorrecta = 'A';
        for (Respuesta opcion: this.respuestasPosibles) {
            if (opcion.esCorrecta()) letraCorrecta = opcion.getLetra();
            System.out.print(String.valueOf(opcion.getLetra()) + ")" + opcion.getRespuesta() + " ");
        }
        System.out.println("\nElige: ");
        Scanner sc = new Scanner(System.in);
        char letraElegidaPorElUsuario = sc.next().toUpperCase().charAt(0);
        if (letraElegidaPorElUsuario == letraCorrecta)
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto, la respuesta correcta era " + String.valueOf(letraCorrecta));
    }
}

class Respuesta {
    private String respuesta;
    private char letra;
    private boolean correcta;

    public Respuesta(String respuesta, char letra, boolean correcta) {
        this.respuesta = respuesta;
        this.letra = letra;
        this.correcta = correcta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public char getLetra() {
        return this.letra;
    }

    public boolean esCorrecta() {
        return this.correcta;
    }

    }




    

    

