package codechallenges;

import java.util.*;
class UnionFind{
	int[] parent;
	int[] rank;
	Map<Integer, TreeSet<Integer>> components;
	
	public UnionFind(int n) {
		parent = new int[n+1];
		rank = new int[n+1];
		components = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			parent[i] = i;
			rank[i] = 0;
			components.put(i, new TreeSet<>(Arrays.asList(i)));
		}
	}
	public int find(int x) {
		if(parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}
	public void union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		
		if(rootX != rootY) {
			if(rank[rootX]>rank[rootY]) {
				parent[rootY] = rootX;
				components.get(rootX).addAll(components.get(rootY));
				components.remove(rootY);
			}
			else if(rank[rootX]<rank[rootY]) {
				parent[rootX] = rootY;
				components.get(rootY).addAll(components.get(rootX));
				components.remove(rootX);
			}
			else {
				parent[rootY] = rootX;
				components.get(rootX).addAll(components.get(rootY));
				components.remove(rootY);
				rank[rootX]++;
			}
		}
	}
	public int countRanges(int x) {
		int root = find(x);
		TreeSet<Integer> set = components.get(root);
		
		int ranges = 1;
		int prev = set.first();
		for(int num : set) {
			if(num>prev+1) {
				ranges++;
			}
			prev = num;
		}
		return ranges;
	}
}
public class Graph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the graph: ");
		int n = sc.nextInt();
		System.out.println("Enter the number of rows in queries: ");
		int q = sc.nextInt();
		System.out.println("Enter the number of columns in queries: ");
		int t = sc.nextInt(); 
		
		UnionFind uf = new UnionFind(n);
		long sum =0;
		
		for(int i=0; i<q; i++) {
			int type = sc.nextInt();
			if(type==1) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				uf.union(x, y);
			}
			else {
				int x = sc.nextInt();
				sum += uf.countRanges(x);
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
