import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double totalGeneral = 0;

        ArrayList<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("001", "Juan Perez", "4444", "5 calle 8-14");
        alumno1.agregarCurso(new Curso("555", "Programación", 500));
        alumno1.agregarCurso(new Curso("122", "Derecho", 100));
        alumnos.add(alumno1);

        Alumno alumno2 = new Alumno("002", "Maria Lopez", "5555", "6 calle 9-15");
        alumno2.agregarCurso(new Curso("222", "Matemáticas", 200));
        alumno2.agregarCurso(new Curso("323", "Inglés", 250));
        alumnos.add(alumno2);

        Alumno alumno3 = new Alumno("003", "Pedro Ramirez", "6666", "7 calle 10-16");
        alumno3.agregarCurso(new Curso("444", "Estadística", 150));
        alumno3.agregarCurso(new Curso("231", "Cálculo II", 255));
        alumnos.add(alumno3);

        // Totales usando un ciclo for
        for (Alumno alumno : alumnos) {
            double alumnoTotal = 0;
            System.out.println("Nombre del alumno: " + alumno.getNombre());
            System.out.println("Carnet del alumno: " + alumno.getCarnet());
            for (Curso curso : alumno.getCursos()) {
                System.out.println("Curso: " + curso.getNombre() + " Valor: " + curso.getCosto());
                alumnoTotal += curso.getCosto();
            }
            System.out.println("Total alumno " + alumno.getCarnet() + ": " + alumnoTotal);
            System.out.println();
            totalGeneral += alumnoTotal;
        }

        // Totales usando metodos de la clase Alumno
        System.out.println("Total general: " + totalGeneral);
        System.out.println("Total alumno 1: " + alumno1.getTotal());
        System.out.println("Total alumno 2: " + alumno2.getTotal());
        System.out.println("Total alumno 3: " + alumno3.getTotal());
        System.out.println("Total general: " + (alumno1.getTotal() + alumno2.getTotal() + alumno3.getTotal()));
    }
}
