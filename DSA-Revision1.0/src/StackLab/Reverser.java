package StackLab;

public class Reverser {
	
	private String input;
	private String output;
	
	
	public Reverser(String input) {
		this.input = input;
	}
	
	public String reverse() {
		
		char arr[] =input.toCharArray();
		StackX stackX=new StackX(arr.length);
		for(int i=0;i<arr.length;i++) {
			stackX.push(arr[i]);
		}
		
		output="";
		while(!stackX.isEmpty()) {
			output+=stackX.pop();
		}
		
		return output;
	}

}
