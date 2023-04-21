package alterar.utils;

import Ardsl.impl.ClassImpl;
import Ardsl.impl.PhysicClassImpl;
import java.util.ArrayList;

public class Utils {
	public int getId(ArrayList<PhysicClassImpl> list, String cl) {
		int i = 0, id = 0;
		for(i=0;i<list.size();i++) {
			id = (int) Math.pow(2, i);
			PhysicClassImpl aux = list.get(i);
			if(cl.equals(aux.getOntoClass().getName())) {
				break;
			}
		}
		return id;
	}
	public int getCollisionContact(ArrayList<PhysicClassImpl> list, ArrayList<ClassImpl> cl) {
		int i = 0, id = 1, result = 0;
		for(i=0;i<list.size();i++) {
			id = (int) Math.pow(2, i);
			PhysicClassImpl aux = list.get(i);
			for(int j=0;j< cl.size();j++) {
				if(cl.get(j).getName().equals(aux.getOntoClass().getName())) {
					result+=id;
				}
			}
		}
		return result;
	}
}