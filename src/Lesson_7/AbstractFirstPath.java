package Lesson_7;

import java.util.LinkedList;

public abstract class AbstractFirstPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    protected abstract void fs(Graph g, int v);

    public boolean hasPathTo(int w) {
        return marked[w];
    }

    public LinkedList<Integer> pathTo(int w) {
        if (!hasPathTo(w)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = w;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
