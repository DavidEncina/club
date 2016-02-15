import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Almacena los socios del club.
    private ArrayList<Membership> socios;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        socios = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        socios.add(member);        
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return socios.size();
    }

    /**
     * Calcula el numero de socios que se dieron de alta en un mes determinado. 
     * El año no nos importa. En caso de que el parametro contenga un valor no valido se muestra por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @return El numero de socios que se dieron de alta dicho mes
     */
    public int joinedMonth(int month)
    {
        int altaSociosMes = 0;
        if (month < 1 || month > 12) {
            System.out.println("Los meses deben ir del 1 al 12");
        }
        else {
            for (Membership miembro : socios) {
                if (month == miembro.getMonth()) {
                    altaSociosMes = altaSociosMes + 1;
                }
            }
        }
        return altaSociosMes;
    }
}
