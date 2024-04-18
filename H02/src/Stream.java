import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Flow>{
    private List<Flow> flows;

    public Stream(List<Flow> flows) {
        this.flows = flows;
    }

    public Stream() {
        this.flows = new ArrayList<>();
    }

    public void add(Flow flow){
        flows.add(flow);
    }

    public List<Flow> getFlows() {
        return flows;
    }

    @Override
    public Iterator<Flow> iterator() {
        return new FlowIterator(this);
    }
}
