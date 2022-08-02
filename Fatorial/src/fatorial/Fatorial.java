package fatorial;

public class Fatorial {
    public static int fatorial(int num){
		int fat = num;
		for(int i=num; i>1; i--){
			fat *= i-1;
                }
		return fat;

    }
}
