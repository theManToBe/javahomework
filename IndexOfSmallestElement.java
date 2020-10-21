
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		double[] nums = new double[10];
		Scanner cin = new Scanner(System.in);
		for(int i = 0; i < 10; ++i){
			nums[i] = cin.nextDouble();
		}

		int index = indexOfSmallestElement(nums);
		System.out.println(index);
	}


	public static int IndexOfSmallestElement(double[] array){
		double m = array[0];
		int index = 0;
		for(int i = 0; i < 10; ++i){
			if(array[i] < m){
				m = array[i];
				index = i;
			}
		}
		return index;
	}
}
