/*searchE = ["chrome','IE','safari','']
  osSupport = ["windows=chrome","windows=IE","windows=firefox","Ubuntu=safari","SUSE=safari","SUSE=firefox"]
 
  tell each browser's supported search engines.
  e.g {'chrome':["windows"],
       'safari': [Ubuntu,SUSE]...etc

 * */
package com.ty.corejava.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class OsSupport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String searchE[]= {"Chrome","IE","Safari","Firefox"};
		
		
		HashMap<String, ArrayList<String>> hm=new HashMap<>();
		
	
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			ArrayList<String>a1=new ArrayList<>();
			System.out.println("Enter OSSupport: ");
			String data = sc.nextLine();
			String[] value = data.split("=");
			if(hm.containsKey(value[0])) {
				 a1 = hm.get(value[0]);
				a1.add(value[1]);
				hm.put(value[0], a1);
			}else {
				a1.add(value[1]);
				hm.put(value[0],a1);
			}
			
		
	
		}
		System.out.println(hm);
		
	}

}
