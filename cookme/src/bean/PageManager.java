package bean;

import java.util.Random;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PageManager {
	private Random generator;
	private String[] pageList= {"helloSample/hello1","helloSample/hello2","helloSample/hello3"};
	
	public PageManager() {
		generator=new Random();
	}
	
	public String goToPage(){
		System.out.println();
		return 	pageList[generator.nextInt(2)];
	}
}
