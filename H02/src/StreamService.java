import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream flows;

    public StreamService(Stream flows){
        this.flows = flows;
    }

    public Stream getFlows() {
        return flows;
    }
    public List<Flow> getSortFlow() {
        List<Flow> flowList = new ArrayList<>(flows.getFlows());
        Collections.sort(flowList);
        return flowList;
    }
}
