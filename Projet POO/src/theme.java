import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class theme
{
    private static int count = 1;
    private int id_type;
    private String[][] Categorie = new String[10][2];
    Map<String, String> Theme = new HashMap<String, String>();


    public theme()
    {
        id_type =  count++;
        for(int i = 0; i< Categorie.length; i++)
        {
            Categorie[0][0] = "Sport";
            Categorie[1][0] = "Culture";
            Categorie[2][0] = "Connaissance";
            Categorie[3][0] = "Sociologie";
            Categorie[4][0] = "Citation";
            Categorie[5][0] = "Poesie";
            Categorie[6][0] = "Danse";
            Categorie[7][0] = "Pays";
            Categorie[8][0] = "Tourisme";
            Categorie[9][0] = "Musique";

            Categorie[i][1] = String.valueOf(id_type + i);

        }


        for(int i=0; i<Categorie.length; i++) {
            Theme.put( Categorie[i][0], Categorie[i][1]);
        }

        //Juste pour teste
        System.out.println("Theme : " + Theme);
    }

    public String[][] getCategorie() {
        return Categorie;
    }

    public int getId_type() {
        return id_type;
    }

    //Retourne l'indice
    public int indiceTheme()
    {
        int result =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Quel est votre choix ?");

        String choix = scanner.nextLine();
        result = Integer.parseInt(Theme.get(choix));
        return result;
    }

    public void selectionTheme()
      {
          Random rand = new Random();
          int  r= rand.nextInt(4);
          String[] crunchifyKeys = Theme.keySet().toArray(r);
          String key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];

          System.out.println("************ Random Value ************ \n" + key + " :: " + Theme.get(key));

      }

    @Override
    public String toString() {
        return "Theme" +
                Theme.keySet() +
                "\n" ;

    }
}
