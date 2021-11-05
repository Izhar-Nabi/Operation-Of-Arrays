class DupplicateNumbers
{
	public static void main(String args[]){
	int myarr[]={10, 12, 23, 84, 10, 35, 23};
	for(int i=0; i<myarr.length; i++){
	for(int j=i+1; j<myarr.length; j++){
	if(myarr[i]==myarr[j]){
	System.out.println("Dupplicate Number "+myarr[j]); 
	System.out.println("The Duplicate index is "+j); }	}
	System.out.println();		}

	}
}