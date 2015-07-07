//实现Runnable方法
package Thread;

public class hello2 implements Runnable{
	private String name;
	public hello2(){
		
	}
	public hello2(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(name+"运行"+i);
		}
	}
	
	public static void main(String args[]){
		hello2 h1 = new hello2("A");
		Thread demo1 = new Thread(h1);
		hello2 h2 = new hello2("B");
		Thread demo2 = new Thread(h2);
		demo1.start();
		demo2.start();
	}

}
