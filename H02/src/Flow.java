import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Comparable<Flow>{
    private Integer flowId;
    private String numberFlow;
    private String flowShortName;
    private String flowName;

    public Flow(Integer flowId, String numberFlow, String flowShortName, String flowName) {
        this.flowId = flowId;
        this.numberFlow = numberFlow;
        this.flowShortName = flowShortName;
        this.flowName = flowName;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public String getNumberFlow() {
        return numberFlow;
    }

    public String getFlowShortName() {
        return flowShortName;
    }

    public String getFlowName() {
        return flowName;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "flowId=" + flowId +
                ", numberFlow='" + numberFlow + '\'' +
                ", flowShortName='" + flowShortName + '\'' +
                ", flowName='" + flowName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Flow o) {
        return flowId.compareTo(o.getFlowId());
    }
}

