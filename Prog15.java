import java.util.Scanner;
public class Prog15{
	String s, st[];
	int count = 0;

	Prog15(String str){
		s = str;
	}

	void sortLine(){
		int i,j;
		st = s.split(" ");
		//bubble sort
		for(i=0; i<(st.length)-1; i++){
			for(j=0;j<(st.length)-1;j++){
				if(st[j].compareTo(st[j+1])>0){
					//swap
					String temp = st[j];
					st[j] = st[j+1];
					st[j+1] = temp;
				}
			}
		}
		
		System.out.println("Print data after sorting: ");
		for(i=0;i<st.length;i++){
			if(st[i].charAt(0)>='A'&&st[i].charAt(0)<='Z')
				count++;

			System.out.print(st[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("Total number of capital words in the string are: "+count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line : ");
		String a = sc.nextLine();
		Prog15 obj = new Prog15(a);
		//1 print data before sorting
		//2 sort the data
		//3 print data after sorting
		obj.sortLine();
	}
}