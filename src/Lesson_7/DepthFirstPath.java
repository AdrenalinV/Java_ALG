package Lesson_7;


public class DepthFirstPath extends AbstractFirstPath {


    public DepthFirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        fs(g, source);
    }
@Override
    protected void fs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                fs(g, w);
            }
        }
    }

}
