
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado dev1 = new Desenvolvedor("John Doe");
		Empregado dev2 = new Desenvolvedor("Jane Smith");
		Empregado designer1 = new Designer("Alex Johnson");
		Empregado designer2 = new Designer("Beatriz Oliveira");

        Departamento departamentoDesenvolvimento = new Departamento("Desenvolvimento");
        departamentoDesenvolvimento.addEmployee(dev1);
        departamentoDesenvolvimento.addEmployee(dev2);

        Departamento departamentoDesign = new Departamento("Design");
        departamentoDesign.addEmployee(designer1);

        Departamento empresa = new Departamento("Empresa");
        empresa.addEmployee(designer2);
        empresa.addEmployee(departamentoDesenvolvimento);
        empresa.addEmployee(departamentoDesign);

        empresa.exibirInfo();

	}

}
