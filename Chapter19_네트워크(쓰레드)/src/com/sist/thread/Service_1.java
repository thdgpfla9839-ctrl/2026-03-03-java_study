package com.sist.thread;
/* 가볍게 읽고 넘기기
 *  스프링에서 task 사용 -> 스케줄러에서 많이 사용(지정된 시간에 반복 수행)
 *  BackUp, 실시간 정보를 가져올 때 사용함
 *  ExecutorService : 쓰레드 풀(쓰레드를 관리하는 영역)
 *                    쓰레드 생성 개수를 제한할 수 있다
 *                    회수하고 재사용할 수 있음
 *  ConnectionPool :데이터베이스에서 사용
 *  --------------------------------------------
 *  submit() :작업실행
 *  shutdown() : 종료할 때
 *  invokeAll() : 여러 작업을 동시에 수행할 때
 *  get() : 결과를 받아올 때
 *                    
 */
// 한번만 실행
import java.util.concurrent.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Service_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ExecutorService ex = Executors.newSingleThreadExecutor(); // 단일쓰레드
   ex.submit(()->System.out.println("실행1"));
   ex.submit(()->System.out.println("실행2"));
   ex.submit(()->System.out.println("실행3"));
   ex.shutdown();
	}

}
