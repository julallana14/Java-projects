
package Entidades;

import java.util.Scanner;

public class Curso {
private String nombreCurso;
private int cantHorasxDia;
private int cantDiasxSem;
private String turno;
private int precioxHora;
private String [] alumnos = new String [5];
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasxDia, int cantDiasxSem, String turno, int precioxHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasxDia = cantHorasxDia;
        this.cantDiasxSem = cantDiasxSem;
        this.turno = turno;
        this.precioxHora = precioxHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasxDia() {
        return cantHorasxDia;
    }

    public void setCantHorasxDia(int cantHorasxDia) {
        this.cantHorasxDia = cantHorasxDia;
    }

    public int getCantDiasxSem() {
        return cantDiasxSem;
    }

    public void setCantDiasxSem(int cantDiasxSem) {
        this.cantDiasxSem = cantDiasxSem;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioxHora() {
        return precioxHora;
    }

    public void setPrecioxHora(int precioxHora) {
        this.precioxHora = precioxHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }


}
