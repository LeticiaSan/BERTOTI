//Composite
import java.util.ArrayList;
import java.util.List;

public class Departamento implements Empregado{
	private String name;
    private List<Empregado> empregados;

    public Departamento(String name) {
        this.name = name;
        this.empregados = new ArrayList<>();
    }

    public void addEmployee(Empregado employee) {
    	empregados.add(employee);
    }

    public void removeEmployee(Empregado employee) {
    	empregados.remove(employee);
    }

    public void exibirInfo() {
        System.out.println("Departamento de " + name);
        System.out.println("Empregados: ");

        for (Empregado empregado : empregados) {
        	empregado.exibirInfo();
        }
    }
}
