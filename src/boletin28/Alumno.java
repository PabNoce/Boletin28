
package boletin28;

import javax.swing.JOptionPane;


public class Alumno {
   private String nome=JOptionPane.showInputDialog("Nome?");
   private int nota=Integer.parseInt(JOptionPane.showInputDialog("Nota?"));
   private Enderezo enderezo;
   
   Enderezo en=new Enderezo();

    public Alumno(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public Alumno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno:" + "\nNome: " + nome + "\nNota=" + nota + "\nEnderezo=" + enderezo;
    }
   private class Enderezo{
       String rua=JOptionPane.showInputDialog("Rua?");
       int numero=Integer.parseInt(JOptionPane.showInputDialog("Numero?"));

        public Enderezo() {
        }

        public Enderezo(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Enderezo: "+"\nNome: "+nome+"\nNota: "+nota+ "\nRua: " + rua + "\nNumero: " + numero;
        }
        
        public void amosar(){
            System.out.println("Nome: " + nome + "\nNota:" + nota +"\nRua:"+rua+"\nNumero:"+numero);
//            System.out.println(toString());
            }
        
       
   }
   public void iAmosar(){
       en.amosar();
   }
   public void modificarNota(){
       nota=Integer.parseInt(JOptionPane.showInputDialog("Nueva nota?"));
   }
   public void modificarEnderezo(){
       en.setRua(JOptionPane.showInputDialog("Nuevo sitio?"));
       en.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Nuevo numero?")));
   }
}
