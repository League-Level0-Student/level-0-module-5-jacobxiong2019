package _06_for_loop_gauntlet;

public class NestedForLoops {
	public static void main(String[] args) {
			for(int i = 0; i < 3; i++) {
			
				
				for(int i1 = 0; i1 < 3; i1++) {
	
					System.out.println(i + " " + i1);
			
			}
		}
		System.out.println("-------------");
		for(int i2 = 1; i2 < 10; i2+=3) {
			
			
			for(int i3 = i2; i3 < i2+3; i3++) {
			
			System.out.print(i3 + " ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for(int i4 = 1; i4 < 101; i4+=10) {
			
			for(int i5 = i4; i5 < i4+10; i5++) {
				System.out.print(i5 + " ");
			}
		System.out.println();
		}
		System.out.println("-------------");
		for (int i6 = 1; i6 < 7; i6++) {

			for(int i7 = 0; i7 < i6; i7++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}



