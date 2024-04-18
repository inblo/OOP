import java.util.Comparator;
import java.util.Iterator;

public class StreamComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow o1, Flow o2) {
        int resultOfComparing = o1.getNumberFlow().compareTo(o2.getNumberFlow());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFlowShortName().compareTo(o2.getFlowShortName());
            if (resultOfComparing == 0) {
                return o1.getFlowName().compareTo(o2.getFlowName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
