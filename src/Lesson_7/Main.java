package Lesson_7;
/*1. Реализовать программу, в которой задается граф из 10 вершин.
Задать ребра и найти кратчайший путь с помощью поиска в ширину.
2*. Вынести в родительский класс общую часть классов поиска в глубину и ширину.
*/
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(7,8);

        graph.addEdge(0,1);

        BreadthFirstPath bfp  = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(2));
        System.out.println(bfp.pathTo(2));



    }
}
