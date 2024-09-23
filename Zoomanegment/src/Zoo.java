import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zoo {





            public Zoo() {
                Scanner st=new Scanner(System.in);
                System.out.println("veuillez saisir le nombre de cages :");
                while (!st.hasNextInt()){
                    System.out.println("veuilliez entrer un nombre entier .");
                    st.next();
                }
                int nbrCages = st.nextInt();


                Scanner sm=new Scanner(System.in);
                System.out.println("veuillez saisir le nom de zoo :");
                String zooName =sm.nextLine();
                System.out.println(zooName + " " + "comporte" + " " +nbrCages +"cages");
            }

                 public static void main(String[] args) {
                     new Zoo();

                 }

}

