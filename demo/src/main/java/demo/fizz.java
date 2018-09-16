package demo;

public class fizz {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
	//	java中被3整除，不能被5整除，并统计数字
			
			if (i/10%10==3) {
				if (i/10%10==3&&i%10==5) {
					System.out.println("FizzBUZZ");
				} else {
					System.out.println("Fizz");
				}
				
			}else if (i/10%10==5){
				if (i/10%10==5&&i%10==3) {
					System.out.println("FizzBUZZ");
				} else {
					System.out.println("Fizz");
				}
			}else{
			if (i%3!=0&&i%10==3) {
				System.out.println("Fizz");
			}else if (i%5!=0&&i%10==5){
				System.out.println("BUZZ");
			}else {
                if (i%3!=0&&i%5!=0) {
					System.out.println(i);
				}
				if (i%3==0&&i%5!=0) {
			System.out.println("Fizz");
		}
		
		if (i%3!=0&&i%5==0) {
			System.out.println("BUZZ");
		}
		 if (i%3==0&&i%5==0) {
			System.out.println("FizzBUZZ");
		}

			}
				

		}
		}
		}
	}
		