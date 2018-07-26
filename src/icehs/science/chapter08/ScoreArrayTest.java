package icehs.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int [] scores =new int [10];
		scores [0]= 93;
		scores [1]= 87;
		scores [2]= 90;
		scores [3]= 86;
		
		String[] subjets = {"국어", "영어", "수학", "사회"};
		
		int sum= 0;
		/*for(int i = 0;i<subjets.length;i++) {
			sum += scores[i];
		}*/
		
		
		//double avg =(double)(scores[0]+scores[1]+scores[2])/3;
		
		for(int i = 0; i<subjets.length;i++) {
			sum += scores[i];
			System.out.println(subjets[i] + " : " + scores[i]);
		}
		
		double avg = (double)sum/subjets.length;
		
		/*System.out.println("국어 : " + scores[0]);
		System.out.println("영어 : " + scores[1]);
		System.out.println("수학 : " + scores[2]);
		System.out.println("사회 : " + scores[3]);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);*/

	}

}
