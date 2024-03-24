package BOJ.BOJ_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	static int N, M;
	static List<Integer> permutation = new ArrayList<Integer>();
	static boolean[] chosen;
	static StringBuilder sb = new StringBuilder();
	public static void search()
	{
		if(permutation.size()==M)
		{	
			permutation.stream().forEach(item -> sb.append(item + " "));
			sb.append("\n");
		}else {
			for(int i=1;i<=N; i++)
			{
				chosen[i] = true;
				permutation.add(i);
 				
				search();
				
				chosen[i] = false;
				permutation.remove(permutation.size()-1);
			}
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		chosen = new boolean[N+1];
		
		search();
		System.out.println(sb.toString().trim());
	}
}
