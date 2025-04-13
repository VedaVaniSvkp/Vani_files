package codechallenges;

import java.util.*;
public class ShortestPath {
	static class Pair{
		int x, y;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static int shortestPath(int[][] maze, int[] source, int[] destination) {
		int rows = maze.length;
		int cols = maze[0].length;
		int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
		boolean[][] visited = new boolean[rows][cols];
		Queue<Pair> queue = new LinkedList<>();
		
		queue.offer(new Pair(source[0], source[1]));
		visited[source[0]][source[1]] = true;
		int steps = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0; i<size; i++) {
				Pair pair = queue.poll();
				if(pair.x == destination[0] && pair.y == destination[1]) {
					return steps;
				}
				for(int[] direction : directions) {
					int newX = pair.x + direction[0];
					int newY = pair.y + direction[1];
					
					if(newX>=0 && newX<rows && newY>=0 && newY<cols && maze[newX][newY]==1 && 
							!visited[newX][newY]) {
						queue.offer(new Pair(newX, newY));
						visited[newX][newY] = true;
					}
						
				}
			}
			steps++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int rows = scan.nextInt();
		System.out.println("Enter the colums: ");
		int cols = scan.nextInt();
		int[] source = new int[2];
		System.out.println("Enter the values for source: ");
		source[0] = scan.nextInt();
		source[1] = scan.nextInt();
		int[] destination = new int[2];
		System.out.println("Enter the values for destination: ");
		destination[0] = scan.nextInt();
		destination[1] = scan.nextInt();
		
		System.out.println("Enter the values in maze: ");
		int[][] maze = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		int result = shortestPath(maze, source, destination);
		System.out.println(result);
		scan.close();
	}

}
