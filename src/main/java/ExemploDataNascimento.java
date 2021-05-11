import models.Pessoa;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.text.DateFormat;

public class ExemploDataNascimento {
    public static void main(String[] args) {

        Pessoa pessoa01 =  new Pessoa();
        pessoa01.setNome("Edson");
        pessoa01.setDataNascimento(478926000000L);

        Date dataNasc = new Date(pessoa01.getDataNascimento());
        //Instant nascInstant = dataNasc.toInstant(); //Sua data de nascimento: 1985-03-06T03:00:00Z

        //String nascInstant = DateFormat.getInstance().format(dataNasc); //Sua data de nascimento: 3/6/85, 12:00 AM
        //String nascInstant = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(dataNasc); //Sua data de nascimento: March 6, 1985, 12:00 AM

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String nascFormated = formatter.format(dataNasc);

        Date dataCompare = new Date(1273892400000L); //15 de maio de 2010

        boolean isAfter = dataCompare.after(dataNasc);

        if(isAfter) {
            System.out.println(pessoa01.getNome() + " você nasceu antes de 15 de maio de 2010." + "\nSua data de nascimento: " + nascFormated);
        }else{
            System.out.println(pessoa01.getNome() + " você nasceu depois de 15 de maio de 2010." + "\nSua data de nascimento: " + nascFormated);
        }
    }
}
