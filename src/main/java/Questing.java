import java.util.Stack;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		// 받아온 정수를 내림으로 소수점을 잘라버리고 2를 나누어 값을 구한다.
		return (int)Math.floor(d)/2;
	}

	static boolean quest2(String s) {
		// 받아온 String 값을 한글자씩 잘라 왼쪽괄호일때는 Stack에 담고 오른쪽괄호일때는 Stack에 담겨있는 마지막 글자를 추출하여
		// 괄호 쌍이 맞는지 비교를 한다. 이때, 쌍이 안맞다면 Break로 빠져나와 false로 return한다.
		Stack<String> testStack = new Stack<String>();
		boolean testCheck = false;
		
		for(int i = 0; i < s.length(); i++ ){
			String j = s.substring(i, i + 1);
			
			if(j.equals("(") || j.equals("{") || j.equals("[")){
				testStack.push(j);
			}else if((j.equals(")") && testStack.pop().equals("(")) ||
					 (j.equals("}") && testStack.pop().equals("{")) ||
					 (j.equals("]") && testStack.pop().equals("["))){
				testCheck = true;
			}else{
				System.out.print( j + "\n" );
				break;
			}
		}
		return testCheck;
	}
}
