package Projeto;

import edu.princeton.cs.algs4.FlowEdge;


public class CommunicationLink extends FlowEdge{
    
    private float distance;

    public CommunicationLink(int v, int w, double capacity) {
        super(v, w, capacity);
    }

    public CommunicationLink(int v, int w, double capacity, double flow) {
        super(v, w, capacity, flow);
    }

    public CommunicationLink(FlowEdge e) {
        super(e);
    }

    public CommunicationLink(GraphNode from, GraphNode to, int cost, int flow) {
        super(from.getId(), to.getId(), cost, flow);
    }
    
}
