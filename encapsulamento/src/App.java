public class App {
    public static void main(String[] args) throws Exception {
       Universitario u = new Universitario();
       
       u.setNome("Eloísa");
       u.setIdade(18);
       u.setCurso("Ciência da computação");
       u.setAltura(1.65);
       u.setSexo('F');

       u.seApresenta();
       u.fazAniversário();
       System.out.println();
       u.seApresenta();
    }
}
