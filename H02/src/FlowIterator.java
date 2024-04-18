import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<Flow> {
    private List<Flow> flows;
    private int counter;
    public FlowIterator(Stream flows){
        this.flows = flows.getFlows();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < flows.size();
    }

    @Override
    public Flow next() {
        if(hasNext()){
            return flows.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            flows.remove(counter);
        }
    }
}
