package thread;

//public class Thread {
	//this(动态)谁调用我，我就指向谁
	//不同的对象就用##多态
	//api搜索Thread
	//父类有的可以直接调用
	//name
	//sleep
	//在线售票过程，st1线程，每个线程都是独立的（st1、st2、st3），小心卖重票，出现第0、-1张票归为系统问题
	//实现线程间的同步，给他们一个屋上锁，保证一个能进行，其他停止，控制速度
	//另一种同步方法：if(x%2) 调用方法，把代码写入方法，synchronized放到public后面；this也可以加入，又可以直接用class文件（字掩码文件）代替this
	
	
	//public Thread(Runnable target,String name)
	/*public Thread(Runnable target,String name) {
		Runnable.run();
	}
          this.x=x;
        //public static void sleep(long millis) throws InterruptedException
          public static void sleep(long millis) throws InterruptedException{
          Runnable.run();
        }
        //static int tickets=100;
  	public class SellTicket implements Runnable{
  	static int tickets =100;
  	public void run() {
   	//
       while(true) {
       if(tickets>0) {
