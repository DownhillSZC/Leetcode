import java.util.HashMap;
import java.util.Stack;

public class Solution {
	/*
	算法的设计思想：

	　　出现左括弧则进栈；

	　　出现右括弧则首先检测栈是否为空，

	　　　　若栈空则表明此右括弧多余，表达式不匹配。

	　　　　否则和栈顶数据比较，若匹配则栈顶出栈。

	　　　　　　否则表明表达式不匹配；

	　　最后若栈不为空否则表明不匹配。
	*/
	public boolean isValid(String s) {
		Stack<Character> string = new Stack<>();//运用栈FILO
		//快速查找
		HashMap<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		for(int i=0; i<s.length(); i++){
			char temp = s.charAt(i);
			
			if(map.containsKey(temp)){
				if(map.isEmpty())
					return false;
				else {
					char start = string.pop();
					if(start != map.get(temp)){
						return false;
					}
				}
			}
			else{
				string.push(temp);
			}
		}
		
		if(!string.isEmpty())
			return false;
		
		
		return true;  
    }
	
	//大佬没用hashmap反而更快。。。难受
	
//	public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        
//        for (char c : s.toCharArray()) {
//            if (c=='(' || c=='[' || c=='{') {
//                stack.push(c);
//            } else {
//                if (stack.empty()) return false;
//                if (c==')' && stack.pop()!='(') return false;
//                if (c==']' && stack.pop()!='[') return false;
//                if (c=='}' && stack.pop()!='{') return false;
//            }
//        }
//        return stack.empty();
//    }

}
