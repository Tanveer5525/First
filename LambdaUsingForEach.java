package com.Lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaUsingForEach
{

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		Consumer<Integer> cons = (Integer i) ->{
			
			System.out.println(i);
		};
		
		//list.forEach((i) -> System.out.print(i + " "));

	}

}
