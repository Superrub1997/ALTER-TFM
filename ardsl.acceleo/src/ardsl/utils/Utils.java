package ardsl.utils;

import java.util.ArrayList;

public class Utils {
	public int getId(ArrayList<String> list, String cl) {
		int i = 0, id = 1;
		for(i=0;i<list.size();i++) {
			id = 2^i;
			String aux = list.get(i);
			if(cl.equals(aux)) {
				break;
			}
		}
		return id;
	}
	public int getCollisionContact(ArrayList<String> list, ArrayList<String> cl) {
		int i = 0, id = 1, result = 0;
		for(i=0;i<list.size();i++) {
			id = 2^i;
			String aux = list.get(i);
			for(int j=0;j< cl.size();j++) {
				if(cl.get(j).equals(aux)) {
					result+=id;
				}
			}
		}
		return result;
	}
}