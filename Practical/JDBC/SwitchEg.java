package com.ananiyal.JDBCeg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SwitchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int ch, id, studentage;
		String studentname;
		try {
			Connection con = Helper.makeCon();
			// execute queries with DB
			Statement st = con.createStatement();

			do {
				System.out.println("1. Insert \n 2. Update \n 3. Delete \n 4. Display \n 5. Exit");
				System.out.println("Enter your choice");
				ch = Integer.parseInt(s.nextLine());
				System.out.println("---------------");
				switch (ch) {
				case 1:
					System.out.println("how many record you want ?");
					int n = Integer.parseInt(s.nextLine());

					for (int i = 0; i < n; i++) {
						System.out.println("Enter id");
						id = Integer.parseInt(s.nextLine());
						System.out.println("Enter your name");
						studentname = s.nextLine();
						System.out.println("Enter your age");
						studentage = Integer.parseInt(s.nextLine());

						st.executeUpdate("insert into Student values(" + id + ", '" + studentname + "', " + studentage + ")");
						System.out.println("record inserted");
					}
					break;

				case 2:
					System.out.println("Enter id");
					id = Integer.parseInt(s.nextLine());
					System.out.println("Enter your age");
					studentage = Integer.parseInt(s.nextLine());
					st.executeUpdate("update Student set sage='" + studentage + "'where sid =" + id);
					System.out.println("record updated");
					break;

				case 3:
					System.out.println("Enter id");
					id = Integer.parseInt(s.nextLine());
					st.executeUpdate("delete from Student where sid=" + id);
					System.out.println("record deleted");
					break;

				case 4:
					ResultSet rs = st.executeQuery("Select * from Student2");
					while (rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
					}

				case 5:
					System.exit(0);
				}
			} while (ch != 5);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}