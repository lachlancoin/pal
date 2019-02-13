package pal.misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Manages proprties on the branches
 * 
 * @author Lachlan Coin
 */
public class NProp {
	public static final String fixBranchLength = "fbl";
	Map<String, Object> m = new HashMap();
	public static String seq_name;

	public Object get(String seq_name2) {
		// TODO Auto-generated method stub
		return m.get(seq_name2);
	}

	public void put(String attr, Object obj) {
		m.put(attr ,obj);
		
	}

	public void merge(NProp properties) {
		for(Iterator<String> it = properties.m.keySet().iterator(); it.hasNext();){
			String key = it.next();
			m.put(key, properties.m.get(key));
		}
		
	}

}
