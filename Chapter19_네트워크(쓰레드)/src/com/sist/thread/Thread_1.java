package com.sist.thread;
/* 여기는 흐름만 공부 딥하게 하지마
 *  프로세스 : 한개의 프로그램
 *  쓰레드 : 한개의 프로세스 안에서 여러개의 기능을 동시에 수행
 *         메소드 호출이라고도 함 -> 동시성, 시분할을 하고 있음
 * ------------------------------------------------------
 * 쓰레드는 게임이나 서버(여러명이 동시에 접속)에 많이 쓰임
 * 쓰레드 구현)
 *           Thread 클래스 상속
 *            class A extends Thread
 *            {
 *            
 *            }
 *            
 *            -> Runnable 구현 -> 표준화됨
 *            class A Implements Runnable
 *            {
 *            
 *            }
 *            
 *            ->ExecutorService : 쓰레드풀 (관리하는 용도)
 *              쓰레드를 이미 생성 후 사용 후 반환한 다음 재사용
 *-----------------------------------------------------------
 * 쓰레드의 생명주기                        
 *                                       구현준비                          Blocked(일시정지)
 *   new ===============================Runnable =======================Running              
 *   생성                                                                     ====Dead(메모리해제)
 *   
 *   1. new 생성
 *      Thread t = new Thread()
 *      -> JVM
 *         이름부여 -> 변경
 *                   Thread-0
 *         getName() / setName()
 *         우선순위 부여(1~10)
 *         1. MIN_PRIORITY  -> GC        
 *         2. NORM_PRIORITY  -> 생성        
 *         3. MAX_PRIORITY   -> main -> 쓰레드 
 *         
 *               
 * =>  기준(작업기준)
 *     쓰레드는 한가지 일만 수행      
 *      예) 총알 . 비행기 ,,,,,,
 *   
 *   2. Runnable
 *      대기상태라고도 함 -> 자원을 공유함(CPU가 메모리 공간)
 *                       start()
 *  3. Running
 *     쓰레드 실행 -> 쓰레드가 어떻게 동작할지 => run()
 *                 run() : 동작하는 코드 작성하는 곳
 *                 
 *  4. 일시정지 가능 : sleep() . wait()....
 *  5. 종료(=쓰레드 해제) : interrupt()
 *  6. 시분할........
 *  -----------------------------------------------------------------------------------------
 *   쓰레드와 네트워크는 서버에서 필수!!!!!!!!!!!
 *                 
 *                              
 *            
 */
// 쓰레드 상속 -> 시분할 => 한번씩 나눠서 작업
class MyThread extends Thread
{
	// 동작
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception ex)
			{}
		}
	}
}
public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();
            MyThread t3 = new MyThread();
            
            
            t1.setName("말");
            t2.setName("곰");
            t3.setName("호랑이");
            
            // 우선순위 변경
            t1.setPriority(10); // 가장 빠른 속도
            t2.setPriority(1); // 1이 가장 낮은 속도
            t3.setPriority(5);
            
            t1.start(); // 자동으로 run() 호출
            t2.start();
            t3.start();
	}

}
