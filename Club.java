import java.util.ArrayList;
import java.util.Iterator;

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
     * El a�o no nos importa. En caso de que el parametro contenga un valor no valido se muestra por pantalla el error.
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

    /**
     * Todos los socios que se han dado de alta un determinado mes de un determinado a�o se
     * dan de baja. En caso de que el parametro month contenga un valor no valido se muestra 
     * por pantalla el error.
     * @param month El mes en el que estamos interesados
     * @param year El a�o en el que estamos interesados
     * @return Una coleccion con los socios que se han dado de baja del club
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        if (month < 1 || month > 12) {
            System.out.println("Los meses deben ir del 1 al 12");
        }
        Iterator<Membership> it = socios.iterator();        
        ArrayList<Membership> sociosBajaMes = new ArrayList<>();        
        while (it.hasNext()) {
            Membership miembro = it.next();
            if (miembro.getMonth() == month) {
                sociosBajaMes.add(miembro);
                it.remove();
            }
        }
        return sociosBajaMes;
    }
}
