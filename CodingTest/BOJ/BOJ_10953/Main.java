package BOJ.BOJ_10953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		for(int i=0;i<tc;i++)
		{
			String[] strs=br.readLine().split(",");
			int A = Integer.parseInt(strs[0]);
			int B = Integer.parseInt(strs[1]);
			
			System.out.println(A+B);
		}
		
		
	}
}
