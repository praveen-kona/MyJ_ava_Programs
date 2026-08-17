package Arrays;

public class CalculateAverageMarks {

	public static void main(String[] args) {
		
		int avg_marks=0;
		int total_marks=0;
		int[] marks= {90,70,80,89,78,69};
		for(int i=0;i<marks.length;i++)
		{
			total_marks=total_marks+marks[i];
		}
		System.out.println("total marks :"+total_marks);
		avg_marks=total_marks/marks.length;
		System.out.println("average marks: "+avg_marks);
		
		System.out.println();
		
		
		// for each loop
		
		int avg_marks1=0;
		int total_marks1=0;
		for(int m:marks)
		{
			total_marks1=total_marks1+m;
		}
		avg_marks1=total_marks1/marks.length;
		System.out.println("total marks :"+total_marks1);
		System.out.println("average marks: "+avg_marks1);
	}

}
