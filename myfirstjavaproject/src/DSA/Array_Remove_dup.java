package DSA;

public class Array_Remove_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1 ,1, 2, 3, 3, 4, 5, 5, 5};
		 int[] uniq=new int[arr.length];
		 int u=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 boolean alreadyStored = false;
			 for(int j=0;j<u;j++)
			 {
				 if(arr[i]==uniq[j])
				 {
					 alreadyStored=true;
					 break;
				 }
			 }
			 if(!alreadyStored)
			 {
				 uniq[u]=arr[i];
				 u++;
			 }
		 }
		for(int i=0;i<u;i++)
		{
			System.out.println(uniq[i]);
		}
		System.out.println(uniq.length-u);

	}

}
