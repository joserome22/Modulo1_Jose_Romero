import java.util.ArrayList;

public class BootCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Celula celula=new Celula();
		final Referente referente= new Referente("GL66","Rodrigo Riquelme");
		final Alumno alumnoUno=new Alumno(1,"Juan Perez");
		final Alumno alumnoDos=new Alumno(2,"Pedro Sanchez");
		final ArrayList<Alumno> alumnos=new ArrayList();
		alumnos.add(alumnoUno);
		alumnos.add(alumnoDos);
		
		celula.setNumero(5);
		celula.setReferente(referente);
		celula.setAlumnos(alumnos);
		printCelula(celula);
		
	}
	private static void printCelula(final Celula celula) {
	System.out.println("---------------------------");
	System.out.println("*Celula:" + celula.getNumero()+"\n");
	System.out.println("*Referente:" + celula.getReferente().getNombre()+"\n");
	
		for(Alumno alumno :celula.getAlumno()) {
			System.out.println("*******Alumno:" + alumno.getNombre()+"\n");	
			
		}
		
	}

}
