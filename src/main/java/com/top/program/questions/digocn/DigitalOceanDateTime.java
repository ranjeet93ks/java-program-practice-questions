package com.top.program.questions.digocn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DigitalOceanDateTime {

	public static void main(String[] args) {

		// for 3rd sept. 2023 date format using/
		System.out.println("date format using / ");
		String ddMMyyyy = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(ddMMyyyy);// 03/09/2023
		String ddyyyyMM = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/yyyy/MM"));
		System.out.println(ddyyyyMM);// 03/2023/09
		String MMddyyyy = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println(MMddyyyy);// 09/03/2023
		String MMyyyydd = LocalDate.now().format(DateTimeFormatter.ofPattern("MM/yyyy/dd"));
		System.out.println(MMyyyydd);// 09/2023/03
		String yyyyddMM = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/dd/MM"));
		System.out.println(yyyyddMM);// 2023/03/09
		String yyyyMMdd = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(yyyyMMdd);// 2023/09/03

		System.out.println("date format using - dash");
		String yyyyMMddDate1 = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		System.out.println(yyyyMMddDate1); // 2023-09-03
		String yyyyddMMDate1 = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-dd-MM"));
		System.out.println(yyyyddMMDate1); // 2023-03-09
		String MMyyyyddDate1 = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
		System.out.println(MMyyyyddDate1); // 09-2023-03
		String MMddyyyyDate1 = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		System.out.println(MMddyyyyDate1); // 09-03-2023
		String ddyyyyMMDate1 = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-yyyy-MM"));
		System.out.println(ddyyyyMMDate1); // 03-2023-09
		String ddMMyyyyDate1 = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(ddMMyyyyDate1); // 03-09-2023

		System.out.println("date format without / or -");
		String yyyyMMddDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		System.out.println(yyyyMMddDate); // 20230903
		String yyyyddMMDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyddMM"));
		System.out.println(yyyyddMMDate); // 20230309
		String MMyyyyddDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMyyyydd"));
		System.out.println(MMyyyyddDate); // 09202303
		String MMddyyyyDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMddyyyy"));
		System.out.println(MMddyyyyDate); // 09032023
		String ddyyyyMMDate = LocalDate.now().format(DateTimeFormatter.ofPattern("ddyyyyMM"));
		System.out.println(ddyyyyMMDate); // 03202309
		String ddMMyyyyDate = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
		System.out.println(ddMMyyyyDate); // 03092023

	}

}
