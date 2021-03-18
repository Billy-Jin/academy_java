package lianxi;

public class Method01 {
	public static void main(String[] args) {
		Method02 m = new Method02();
		
	 m.add(2,3);
	int min = m.min(5, 4);
	System.out.println(min);
	 
	System.out.println(m.max(5, 5));
	}	
}


class Method02{
	
	int add(int x,int y) {
		
		int result = x+y ;
		return result; //return x + y; 로 간단하게 입력가능!
	}

	int max(int x,int y) {
		int result = 0;
		if(x>y) {
			result = x;
		}else if(y>x) {
			result = y;
		}else {
			result = x;
		}
		return result;
		
		//return a>b ? a : b; 로 간단하게 가능
	}
	
	
	int min(int x,int y) {
		return x<y ? x:y ;
	}
	
	int max1(int x, int y) {
		if(x>y)
			return x;
		else return y;
	}
	
}
