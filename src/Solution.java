import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	private int test = 5;

	

	public void setTest(int test) {
		this.test = test;
	}

	public static void main(String[] args) {
//		String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
//		ArrayList<String> arrayList = new ArrayList<>();
//		ArrayList<Integer> occurence = new ArrayList<>();
//		for (int i = 0; i < text.length(); i++) {
//			arrayList.add(text.substring(i,i+1));
//		}
//		for (int i = 0; i < arrayList.size(); i++) {
//			String validator = arrayList.get(i);
//			int count = 0;
//			for (int j = 0; j < arrayList.size(); j++) {
//				if (validator.equalsIgnoreCase(arrayList.get(j))) {
//					count++;
//				}
//			}
//			occurence.add(count);
//		}
//		int resultIndex = 0;
//		for (int i = 0; i < occurence.size(); i++) {
//			if (i<occurence.size()-1 && occurence.get(i) < occurence.get(i+1) && occurence.get(i+1) > occurence.get(resultIndex) ) {
//				resultIndex = i+1;
//			}
//		}
//		char result = arrayList.get(resultIndex).charAt(0);
//		System.out.println(arrayList);
//		System.out.println(occurence);
//		System.out.println(result);
		
		
//		int n = 15;
//		for(int i = 1; i<=n; i++){
//            if(i >= 3){
//                if(i%3 == 0){
//                    if(i >= 5 && i%5 == 0){
//                        System.out.println("FizzBuzz");
//                        continue;
//                    }
//                    
//                    System.out.println("Fizz");
//                } else if(i >= 5 && i%5 == 0){
//                    System.out.println("Buzz");
//                } else{
//                    System.out.println(i);
//                }
//            } else {
//                System.out.println(i);
//            }       
//        }
		
//		int[] a = {10,8,7,6,5};
//		ArrayList<Integer> result = new ArrayList<>();
//		for (int i = 1; i < a.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (a[i] > a[j]) {
//					result.add(a[i]-a[j]);
//				}
//			}
//		}
//		System.out.println(result);
//		if (result.size() > 0) {
//			int resultNum = result.get(0);
//			for (int i = 0; i < result.size()-1; i++) {
//				if (result.get(i) < result.get(i+1) && resultNum < result.get(i+1)) {
//					resultNum = result.get(i+1);
//				}
//			}
//		}
//		return -1;
//		
//		System.out.println(resultNum);
		
		
		
//		int n = 3; int k=2; int t=15;
//		int[] start = {0,6,7};
//		int[] finish = {5,7,8};
//		ArrayList<Integer> plan = new ArrayList<>();
//		for (int i = 0; i < t; i++) {
//			plan.add(0);
//		}
//		System.out.println(plan);
//		int val =1;
//		for (int i = 0; i < start.length; i++) {
//			for (int j = 0; j < plan.size(); j++) {
//				for (int j2 = start[i]; j2 < finish[i]; j2++) {
//					plan.set(j2, val);
//				}
//			}
//			val++;
//		}
//        System.out.println(plan);
        
		
		int[][] arr = {{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7},{8,8,8},{9,9,9}};
		System.out.println(arr.length);
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i<9; i++)
		{
		    for(int j = 0; j<3; j++)
		    {
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}
		
		MathBean bean = new MathBean();
		bean.setOperand1(10);
		bean.getOperand1();
		
		try {
			System.out.println("");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
