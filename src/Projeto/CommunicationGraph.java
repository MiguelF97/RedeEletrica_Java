package Projeto;

import edu.princeton.cs.algs4.FlowNetwork;
import edu.princeton.cs.introcs.In;
import java.util.ArrayList;


public class CommunicationGraph extends FlowNetwork{
    private final ArrayList<GraphNode> nodes = new ArrayList<>();

    public CommunicationGraph(int V) {
        super(V);
    }

    public CommunicationGraph(int V, int E) {
        super(V, E);
    }

    public CommunicationGraph(In in) {
        super(in);
    }
    
     public void addNode(GraphNode node) {
        if (this.nodes.size() >= this.V()) {
            throw new IllegalArgumentException();
        }
        this.nodes.add(node);
    }

    void addEdge(GraphNode from, GraphNode to, int cost,int flow) {
        if (!(this.nodes.contains(from) || this.nodes.contains(to))) {
            throw new IllegalArgumentException();
        }
        CommunicationLink cl = new CommunicationLink(from, to, cost,flow);
        this.addEdge(cl);
    }
    
    void deleteNodes(){
        this.nodes.clear();
    }
    
    
    
}
