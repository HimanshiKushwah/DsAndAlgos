public class ExampleArray {
/*  Array of Object */
	public static void main(String[] args) {
		Students arr[]= new Students[5]; 
		
		
//		Student is a user defined class
		
		arr[0]=new Students("Asim","delhi",101,100);
		arr[1]=new Students("Himanshi","Chandigarh",102,100);
		arr[2]=new Students("Sidharth","Mumbai",103,18);
		arr[3]=new Students("Sana","delhi",101,100);
		arr[4]=new Students("Rashmi","Mumbai",101,107);
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i].name+" ," + arr[i].address +" ," + arr[i].roll_no + " ," +arr[i].marks);
		}
		
	}

}
