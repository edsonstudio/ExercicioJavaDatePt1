import models.Pessoa;

import java.time.Instant;
import java.util.Date;

public class ExemploDataNascimento {
    public static void main(String[] args) {

        Pessoa pessoa01 =  new Pessoa();
        pessoa01.setNome("Edson");
        pessoa01.setDataNascimento(478926000000L);

        Date dataNasc = new Date(pessoa01.getDataNascimento());
        Instant nascInstant = dataNasc.toInstant();

        Date dataCompare = new Date(1273892400000L); //15 de maio de 2010

        boolean isAfter = dataCompare.after(dataNasc);

        if(isAfter) {
            System.out.println(pessoa01.getNome() + " você nasceu antes de 15 de maio de 2010." + "\nSua data de nascimento: " + nascInstant);
        }else{
            System.out.println(pessoa01.getNome() + " você nasceu depois de 15 de maio de 2010." + "\nSua data de nascimento: " + nascInstant);
        }
    }
}
