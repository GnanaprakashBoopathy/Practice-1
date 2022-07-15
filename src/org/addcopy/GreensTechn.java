package org.addcopy;

public class GreensTechn {
private void greensOmr(String name) {
System.out.println("Greens OMR is "+name);
}
private void greensOmr(char section) {
System.out.println("Greens OMR Section is "+section);
}
private void greensOmr(String name1, char section1) {
System.out.println("Greens OMR is "+name1+"\n"+"Section is "+section1);
}
private void greensOmr(char section2, String name2) {
	System.out.println("Greens OMR is "+name2+"\n"+"Section is "+section2);

}
private void greensOmr(char section3, String name3, int id) {
	System.out.println("Greens Omr is "+name3+"\n"+"Section is "+section3+"\n"+"Greens ID is "+id);

}
private void greensOmr(int id2, char section4, String name4) {
	System.out.println("Greens Omr is "+name4+"\n"+"Section is "+section4+"\n"+"Greens ID is "+id2);

}
public static void main(String[] args) {
	GreensTechn a=new GreensTechn();
	a.greensOmr("Greens Omr");
	a.greensOmr('A');
	a.greensOmr("Greens", 'B');
	a.greensOmr('C', "Greens");
	a.greensOmr('D', "Greens", 123);
	a.greensOmr(321, 'E', "Greens");
	
}
}