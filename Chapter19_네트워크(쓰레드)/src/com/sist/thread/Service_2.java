package com.sist.thread;

import java.util.concurrent.*;

public class Service_2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
//		ExecutorService ex = Executors.newFixedThreadPool(2);
// ex.submit(()->System.out.println("A"));
// ex.submit(()->System.out.println("B"));
// ex.shutdown();
//		for(int i=0;i<=10;i++)
//		{
//			int n=i;
//			ex.submit(()->System.out.println("작업: "+n));
//			
//		}
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> result = ex.submit(()->10+20);
		System.out.println(result.get());
		 // 쓰레드가 실행한 후 실행 결과를 받을 떄
		
		
		ex.shutdown();

	}

}
