package StackLab;

public class BracketChecker {
	
	private String input;

	public BracketChecker(String input) {
		this.input = input;
	}
	
	public boolean check() {
		StackX stackX = new StackX(input.length());
		char[] exp = input.toCharArray();
		
		for(int i=0;i<exp.length;i++) {
			
			if(exp[i]=='(')
				stackX.push('(');
			
			if(exp[i]==')') {
				
				if(stackX.isEmpty()) 
					return false;
				
				stackX.pop();
					
			}
				
				
		}
		
		if(stackX.isEmpty())
			return true;
		else
			return false;
	}

}
