package org.neo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(new EmpDTO(101, "java"));
		al.add(new EmpDTO(105, "c"));
		al.add(new EmpDTO(103, "c++"));
		al.add(new EmpDTO(102, "oracle"));
		al.add(new EmpDTO(106, "sql"));
		al.add(new EmpDTO(104, "linux"));
		
		/*EmpDTO e=new EmpDTO(101, "hk");
		System.out.println(".....by using map interface.....");
		
		
		Map<String, EmpDTO>	m1=new HashMap<String, EmpDTO>();
		m1.put("e1", e);*/
		
		//System.out.println(al);
		System.out.println("............after sorting.........");
		
		Collections.sort(al,new IdComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			EmpDTO emp=(EmpDTO) itr.next();
			System.out.println("Emp:"+emp.id+" :"+emp.name);
		}
	}

}
