public class Universitario {
    
    private String nome;
    private double altura;
    private int idade;
    private char sexo;
    private String curso;
   
      public void setNome (String nome){
       this.nome = nome;
      }
   
      public String getNome (){
       return nome;
      }
   
      public void setAltura (double altura){
       this.altura = altura;
      }
      public double getAltura (){
       return altura;
      }
   
      public void setIdade (int idade){
       this.idade = idade;
      } 
      public int getIdade (){
       return idade;
      }
   
      public void setSexo (char sexo){
       this.sexo = sexo;
      }
   
      public char getSexo(){
       return sexo;
      }
   
      public void setCurso(String curso){
       this.curso = curso;
      }
      public String getCurso(){
       return curso;
      }
   
      public void seApresenta(){
       System.out.println("meu nome é: " + nome);
       System.out.println("Minha altura é: " + altura);
       System.out.println("minha idade é: " + idade);
       System.out.println("sou do sexo " + sexo);
       System.out.println("Eu faço " + curso);
      }
   
      public int fazAniversário(){
       return idade++;
      }
}
