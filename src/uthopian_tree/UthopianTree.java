package uthopian_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UthopianTree 
{
	public static void height(int time)
	{
		int total = 1;
		for(int i = 1; i <= time; i++)
		{
			if(i%2 != 0)
				total = 2 * total;
			else
				total = total + 1;
		}
		System.out.println(total);
	}
	public static void main(String args[]) throws NumberFormatException, IOException 
	{
		BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(ip.readLine());
		int time[] = new int[count];
		for(int i = 0; i < count; i++)
		{
			time[i] = Integer.parseInt(ip.readLine());
		}
		for(int i = 0; i < count; i++)
		{
			height(time[i]);
		}
	}
}
