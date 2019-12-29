package map.hashMap;

import java.util.HashMap;

public class HashMapUserDefineObjectAsKeyDemo {

	public static void main(String[] args) {
		/*here all employee are same because they have same empId and name.
		 *so now if we add this emp obj as key into hashMap then according to hash map property
		 *it cant have duplicate key. but the is duplicate or not will be 
		 *decided by object reference. as we are creating each obj by using new key word
		 *so all obj ref will be difference. so all key will be different and all key will act 
		 *like different. whicj we dont want. 		 * 
		 */
		
		/*So what is the solution for this???
		 *whether two objects are equal or not, is decided by equals method of Object class. 
		 *		public boolean equals(Object obj) {
        			return (this == obj);
    					}
    		So it will check the obj ref which is diffrent obvioussly bcs we are creating it using new keyw word.
    		So we have to override equal method and implement it in that way so that if two fields are same in one object 
    		then they will be same.
    		
    		So in employee class, if empId are same then obj should be same. we will override it and implement it on 
    		empId.
    		after overriding emp1.equals(emp2) // true
    		
    		again as contract, if two methods are equal then their hash code also be same.  
    		so we will override hashCode method also for empId. (mean id empId for two obj is same then hashCode will be same for both obj).
    		
    		what if we ont override hasCode??
    		the hashMap will work fine. but as hasCode is used to decide index of node in the bucket where the key value are 
    		stored. So if we dont override it, for all object different hascode will be there so all objects will be 
    		saved at diffrent index of bucket instead of saving it at same index. So its not gd programing 
    		practice in terms of hashing,
    		
    		
    		
		 * */
		
		Employee emp1 = new Employee(101, "Devendra");
		Employee emp2 = new Employee(101, "Devendra");
		Employee emp3 = new Employee(101, "Devendra");
		
		HashMap<Employee, String> map = new HashMap<>();
		map.put(emp1, "User1");
		map.put(emp2, "User2");
		map.put(emp3, "User3");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(map);
		
	}
}
