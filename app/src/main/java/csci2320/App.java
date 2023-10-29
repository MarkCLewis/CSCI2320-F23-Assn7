/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package csci2320;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long seed = sc.nextLong();
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            rand.setSeed(seed);
        }
    }

    static String randomString(ThreadLocalRandom rand, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; ++i) {
            sb.append((char)('a'+rand.nextInt(26)));
        }
        return sb.toString();
    }

    public static void basicTest(ThreadLocalRandom rand, int size) {
        List<DisjointSet<Integer>> sets = new ArrayList<>();
        for (int i = 0; i < size; ++i) {
            sets.add(DisjointSet.makeSet(i));
        }
        int unionCount = 0;
        for (int i = 0; i < size; ++i) {
            int s1 = rand.nextInt(size);
            int s2 = rand.nextInt(size);
            if (sets.get(s1).findSet() != sets.get(s2).findSet()) {
                sets.get(s1).union(sets.get(s2));
                unionCount++;
                if (!sets.get(s1).findSet().equals(sets.get(s2))) {
                    System.out.println("Sets don't match after union.");
                }
            }
        }
        Set<Integer> endSets = new HashSet<>();
        for (int i = 0; i < size; ++i) {
            endSets.add(sets.get(i).findSet().getElement());
        }
        System.out.println(size + " " + unionCount + " " + endSets.size());
    }

    static List<MinimumSpanningTree.Edge> randomWeightedGraph(ThreadLocalRandom rand, int numVerts, double density) {
        var ret = new ArrayList<MinimumSpanningTree.Edge>();
        for (int i = 0; i < numVerts; ++i) {
            for (int j = i+1; j < numVerts; ++j) {
                if (rand.nextDouble() < density) ret.add(new MinimumSpanningTree.Edge(i, j, rand.nextDouble()));
            }
        }
        return ret;
    }

    public static void mstTest(ThreadLocalRandom rand, int size, double density) {
        var edges = randomWeightedGraph(rand, size, density);
        var mst = MinimumSpanningTree.kruskals(size, edges);
        var cnt = 0;
        var weightSum = 0.0;
        for (var edge: mst) {
            cnt += 1;
            weightSum += edge.weight();
        }
        System.out.println(cnt + " " + weightSum);
    }
}