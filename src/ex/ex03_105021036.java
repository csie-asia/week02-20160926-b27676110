package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，

 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex03_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = n/30;
		double s =0d;
		if(d<=4){
			s = d*30;
			System.out.println(s);
		}else{
			if(d<=8){
				s = d*40;
				System.out.println(s);
			}else{s =d *60;
			System.out.println(s);
				
					
				}
			}
			 
		}


	}
