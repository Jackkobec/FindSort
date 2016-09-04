package FindSorted.actors;



import java.util.Comparator;

/**
 *
 */
public class ClientIdComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        if (o1.clientID > o2.clientID) {
            return 1;
        } else if (o1.clientID < o2.clientID)
            return -1;
        return 0;
    }
}
