package credit.hometech;
import java.util.*;

public class CompareOfConsump {
    static final Comparator<Appliances> CONSUMPTION = new Comparator<Appliances>() {
        @Override
        public int compare(Appliances o1, Appliances o2) {
            return o2.getConsump().compareTo(o1.getConsump());
        }
    };
}
