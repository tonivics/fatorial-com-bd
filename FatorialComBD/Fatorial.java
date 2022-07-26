public class Fatorial {
	public static int fatorial(int num){
		int fat = num;
		for(int i=num; i>1; i--){
			fat *= num;	
		}
		return fat;
	}
	
	public static void main(String[] args){
		System.out.println(fatorial(5));
	}
}
