package unguided.unguided1;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<Model> {
    @Override
    public int compare(Model m1, Model m2) {
        return Integer.compare(m1.getWaktuTraining(), m2.getWaktuTraining());
    }
}

