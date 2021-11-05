class ReverseNumberInArray
{
	public static void main(String arg[]){
	int myarr[]={10, 20, 30, 36, 70, 10};
	//Printing the Array
	for(int i=0; i<myarr.length; i++){
	System.out.print(myarr[i]+", ");}
	//Reverse The Numbers
	int start=0;
	int end=myarr.length-1;
	for(int j=0; j<(myarr.length/2); j++)
	{ int temp= myarr[start];
	 myarr[start]=myarr[end];
	myarr[end]=temp; 
	start++;
	end--;}
	System.out.println("\n -----------------------------");
	//after reversing 
	for(int i=0; i<myarr.length; i++){
	System.out.print(myarr[i]+", ");}
	}
}