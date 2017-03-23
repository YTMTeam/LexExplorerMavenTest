package webPart;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mc.model.ClassA;
@SessionScoped
@ManagedBean(name="innerTable")
public class ManagedInnerTable {
		
		private ArrayList<ClassA> a;

		
		public ManagedInnerTable(){
			
			a=new ArrayList<>();
			for(int i =0; i<5; i++){
				ClassA aentity=new ClassA();
				a.add(aentity);
			}
			
			
		}
		
		public ArrayList<ClassA> getA() {
			return a;
		}

		public void setA(ArrayList<ClassA> a) {
			this.a = a;
		}
}
