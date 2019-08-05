package Projeto;

public abstract class GraphNode {

    private final int id;
    private static int ACTUAL_ID = 0;

    public GraphNode() {
        this.id = ACTUAL_ID++;
    }

    public GraphNode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GraphNode other = (GraphNode) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "GraphNode{" + "id=" + id + '}';
    }

}