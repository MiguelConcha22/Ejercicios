package Ejercicio3;

import java.util.Objects;

public class Date {
	public static void main(String[] args) {
		String[] months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] days = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		String[] daysWeek = new String[] {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		
		String name = args[0];
		
		int day = Integer.parseInt(args[1]);
		int month = Integer.parseInt(args[2]) - 1;
		int year = Integer.parseInt(args[3]);
		
		int last = 0;
		
		for(int i = 0; i < 7; i++) {
			if(Objects.equals(name, daysWeek[i])) {
				last = i;
			}
		}
		
		String format = args[4];
		//System.out.println(format);
		
		if(Objects.equals("US", format)) {
			System.out.println("Gringo format:");
			for(int i = day; i <= days[month]; i++) {
				System.out.println(daysWeek[last] + ", " + months[month] + " " + i + ", " + "20" + year);
				last++;
				if (last == 7) {
					last = 0;
				}
			}
		}else if(Objects.equals("EU", format)) {
			System.out.println("European format:");
			for(int i = day; i <= days[month]; i++) {
				System.out.println(daysWeek[last] + " " + i + " " + months[month] + " 20" + year);
				last++;
				if (last == 7) {
					last = 0;
				}
			}
		}
		
	}
}
