package com.tyagi.HospitalManagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Hospital extends JApplet implements ActionListener {
	JFrame f1 = new JFrame("TYAGI LIFELINE HOSPITALS");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JTabbedPane tp = new JTabbedPane();

	JLabel lid1 = new JLabel("Patient ID");
	JLabel lname1 = new JLabel("Name");
	JLabel lage1 = new JLabel("Age");
	JLabel lsex1 = new JLabel("Sex");
	JLabel lfhname1 = new JLabel("Father's/Husband's Name");
	JLabel ldoa1 = new JLabel("Date of Admission");
	JLabel ldod1 = new JLabel("Date of Discharge");
	JLabel ladd1 = new JLabel("Address");
	JLabel lphone1 = new JLabel("Phone No.");
	JLabel lbill1 = new JLabel("Bill");

	JLabel lid2 = new JLabel("Enter Patient ID");
	JLabel lname2 = new JLabel("Name");
	JLabel lage2 = new JLabel("Age");
	JLabel lsex2 = new JLabel("Sex");
	JLabel lfhname2 = new JLabel("Father's/Husband's Name");
	JLabel ldoa2 = new JLabel("Date of Admission");
	JLabel ldod2 = new JLabel("Date of Discharge");
	JLabel ladd2 = new JLabel("Address");
	JLabel lphone2 = new JLabel("Phone No.");
	JLabel lbill2 = new JLabel("Bill");

	JLabel lid3 = new JLabel("Patient ID");
	JLabel lname3 = new JLabel("Enter Name");
	JLabel lage3 = new JLabel("Age");
	JLabel lsex3 = new JLabel("Sex");
	JLabel lfhname3 = new JLabel("Father's/Husband's Name");
	JLabel ldoa3 = new JLabel("Date of Admission");
	JLabel ldod3 = new JLabel("Date of Discharge");
	JLabel ladd3 = new JLabel("Address");
	JLabel lphone3 = new JLabel("Phone No.");
	JLabel lbill3 = new JLabel("Bill");

	JTextField tid1 = new JTextField(20);
	JTextField tname1 = new JTextField(20);
	JTextField tage1 = new JTextField(20);
	JTextField tsex1 = new JTextField(20);
	JTextField tfhname1 = new JTextField(20);
	JTextField tdoa1 = new JTextField(20);
	JTextField tdod1 = new JTextField(20);
	JTextField tadd1 = new JTextField(20);
	JTextField tphone1 = new JTextField(20);
	JTextField tbill1 = new JTextField(20);

	JTextField tid2 = new JTextField(20);
	JTextField tname2 = new JTextField(20);
	JTextField tage2 = new JTextField(20);
	JTextField tsex2 = new JTextField(20);
	JTextField tfhname2 = new JTextField(20);
	JTextField tdoa2 = new JTextField(20);
	JTextField tdod2 = new JTextField(20);
	JTextField tadd2 = new JTextField(20);
	JTextField tphone2 = new JTextField(20);
	JTextField tbill2 = new JTextField(20);

	JTextField tid3 = new JTextField(20);
	JTextField tname3 = new JTextField(20);
	JTextField tage3 = new JTextField(20);
	JTextField tsex3 = new JTextField(20);
	JTextField tfhname3 = new JTextField(20);
	JTextField tdoa3 = new JTextField(20);
	JTextField tdod3 = new JTextField(20);
	JTextField tadd3 = new JTextField(20);
	JTextField tphone3 = new JTextField(20);
	JTextField tbill3 = new JTextField(20);

	// for log-in form
	JFrame f = new JFrame("LOG-IN");
	JPanel p = new JPanel();
	JLabel label1 = new JLabel("USERNAME");
	JLabel label2 = new JLabel("PASSWORD");
	JTextField t1 = new JTextField(10);
	JPasswordField t2 = new JPasswordField(10);
	JButton b1 = new JButton("OK");
	JButton b2 = new JButton("Quit");

	JButton badmit = new JButton("Admit");
	JButton bgenerate = new JButton("Generate ID");
	JButton bquit1 = new JButton("Quit");

	JButton bsubmit = new JButton("Submit");
	JButton bdischarge = new JButton("Discharge");
	JButton bquit2 = new JButton("Quit");

	JButton bsearch = new JButton("Search");
	JButton bquit3 = new JButton("Quit");

	// for pop-up
	JFrame fpop = new JFrame("WARNING");
	JLabel lpop = new JLabel("Either Username or Password is invalid");

	// Setting the layout
	GridBagLayout g = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();

	Hospital() {
		f.setVisible(true);
		f.setSize(800, 800);
		fpop.setSize(400, 200);
		fpop.setLayout(g);
		f1.setSize(800, 800);

		f.getContentPane().add(p);
		f1.getContentPane().add(tp);
		fpop.getContentPane().add(lpop);

		tp.addTab("Admit", p1);
		tp.addTab("Discharge", p2);
		tp.addTab("Search", p3);

		p.setLayout(g);
		p1.setLayout(g);
		p2.setLayout(g);
		p3.setLayout(g);

		c.insets = new Insets(5, 5, 10, 10);
		c.fill = GridBagConstraints.BOTH;

		c.gridy = 0;
		c.gridx = 0;
		g.setConstraints(label1, c);
		p.add(label1);

		c.gridy = 0;
		c.gridx = 1;
		g.setConstraints(t1, c);
		p.add(t1);

		c.gridy = 1;
		c.gridx = 0;
		g.setConstraints(label2, c);
		p.add(label2);

		c.gridy = 1;
		c.gridx = 1;
		g.setConstraints(t2, c);
		p.add(t2);

		c.gridy = 2;
		c.gridx = 0;
		g.setConstraints(b1, c);
		p.add(b1);

		c.gridy = 2;
		c.gridx = 1;
		g.setConstraints(b2, c);
		p.add(b2);

		// For Panel1 i.e Admit
		c.gridy = 0;
		c.gridx = 0;
		g.setConstraints(lid1, c);
		p1.add(lid1);

		c.gridy = 0;
		c.gridx = 1;
		g.setConstraints(tid1, c);
		p1.add(tid1);

		c.gridy = 1;
		c.gridx = 0;
		g.setConstraints(lname1, c);
		p1.add(lname1);

		c.gridy = 1;
		c.gridx = 1;
		g.setConstraints(tname1, c);
		p1.add(tname1);

		c.gridy = 2;
		c.gridx = 0;
		g.setConstraints(lage1, c);
		p1.add(lage1);

		c.gridy = 2;
		c.gridx = 1;
		g.setConstraints(tage1, c);
		p1.add(tage1);

		c.gridy = 3;
		c.gridx = 0;
		g.setConstraints(lsex1, c);
		p1.add(lsex1);

		c.gridy = 3;
		c.gridx = 1;
		g.setConstraints(tsex1, c);
		p1.add(tsex1);

		c.gridy = 4;
		c.gridx = 0;
		g.setConstraints(lfhname1, c);
		p1.add(lfhname1);

		c.gridy = 4;
		c.gridx = 1;
		g.setConstraints(tfhname1, c);
		p1.add(tfhname1);

		c.gridy = 5;
		c.gridx = 0;
		g.setConstraints(ldoa1, c);
		p1.add(ldoa1);

		c.gridy = 5;
		c.gridx = 1;
		g.setConstraints(tdoa1, c);
		p1.add(tdoa1);

		c.gridy = 6;
		c.gridx = 0;
		g.setConstraints(ldod1, c);
		p1.add(ldod1);

		c.gridy = 6;
		c.gridx = 1;
		g.setConstraints(tdod1, c);
		p1.add(tdod1);

		c.gridy = 7;
		c.gridx = 0;
		g.setConstraints(ladd1, c);
		p1.add(ladd1);

		c.gridy = 7;
		c.gridx = 1;
		g.setConstraints(tadd1, c);
		p1.add(tadd1);

		c.gridy = 8;
		c.gridx = 0;
		g.setConstraints(lphone1, c);
		p1.add(lphone1);

		c.gridy = 8;
		c.gridx = 1;
		g.setConstraints(tphone1, c);
		p1.add(tphone1);

		c.gridy = 9;
		c.gridx = 0;
		g.setConstraints(lbill1, c);
		p1.add(lbill1);

		c.gridy = 9;
		c.gridx = 1;
		g.setConstraints(tbill1, c);
		p1.add(tbill1);

		c.gridy = 10;
		c.gridx = 0;
		g.setConstraints(bgenerate, c);
		p1.add(bgenerate);

		c.gridy = 10;
		c.gridx = 1;
		g.setConstraints(badmit, c);
		p1.add(badmit);

		c.gridy = 11;
		c.gridx = 0;
		g.setConstraints(bquit1, c);
		p1.add(bquit1);

		// For Panel2 i.e discharge
		c.gridy = 0;
		c.gridx = 0;
		g.setConstraints(lid2, c);
		p2.add(lid2);

		c.gridy = 0;
		c.gridx = 1;
		g.setConstraints(tid2, c);
		p2.add(tid2);

		c.gridy = 1;
		c.gridx = 0;
		g.setConstraints(lname2, c);
		p2.add(lname2);

		c.gridy = 1;
		c.gridx = 1;
		g.setConstraints(tname2, c);
		p2.add(tname2);

		c.gridy = 2;
		c.gridx = 0;
		g.setConstraints(lage2, c);
		p2.add(lage2);

		c.gridy = 2;
		c.gridx = 1;
		g.setConstraints(tage2, c);
		p2.add(tage2);

		c.gridy = 3;
		c.gridx = 0;
		g.setConstraints(lsex2, c);
		p2.add(lsex2);

		c.gridy = 3;
		c.gridx = 1;
		g.setConstraints(tsex2, c);
		p2.add(tsex2);

		c.gridy = 4;
		c.gridx = 0;
		g.setConstraints(lfhname2, c);
		p2.add(lfhname2);

		c.gridy = 4;
		c.gridx = 1;
		g.setConstraints(tfhname2, c);
		p2.add(tfhname2);

		c.gridy = 5;
		c.gridx = 0;
		g.setConstraints(ldoa2, c);
		p2.add(ldoa2);

		c.gridy = 5;
		c.gridx = 1;
		g.setConstraints(tdoa2, c);
		p2.add(tdoa2);

		c.gridy = 6;
		c.gridx = 0;
		g.setConstraints(ldod2, c);
		p2.add(ldod2);

		c.gridy = 6;
		c.gridx = 1;
		g.setConstraints(tdod2, c);
		p2.add(tdod2);

		c.gridy = 7;
		c.gridx = 0;
		g.setConstraints(ladd2, c);
		p2.add(ladd2);

		c.gridy = 7;
		c.gridx = 1;
		g.setConstraints(tadd2, c);
		p2.add(tadd2);

		c.gridy = 8;
		c.gridx = 0;
		g.setConstraints(lphone2, c);
		p2.add(lphone2);

		c.gridy = 8;
		c.gridx = 1;
		g.setConstraints(tphone2, c);
		p2.add(tphone2);

		c.gridy = 9;
		c.gridx = 0;
		g.setConstraints(lbill2, c);
		p2.add(lbill2);

		c.gridy = 9;
		c.gridx = 1;
		g.setConstraints(tbill2, c);
		p2.add(tbill2);

		c.gridy = 10;
		c.gridx = 0;
		g.setConstraints(bsubmit, c);
		p2.add(bsubmit);

		c.gridy = 10;
		c.gridx = 1;
		g.setConstraints(bdischarge, c);
		p2.add(bdischarge);

		c.gridy = 11;
		c.gridx = 0;
		g.setConstraints(bquit2, c);
		p2.add(bquit2);

		// For Panel3 i.e search
		c.gridy = 0;
		c.gridx = 0;
		g.setConstraints(lid3, c);
		p3.add(lid3);

		c.gridy = 0;
		c.gridx = 1;
		g.setConstraints(tid3, c);
		p3.add(tid3);

		c.gridy = 1;
		c.gridx = 0;
		g.setConstraints(lname3, c);
		p3.add(lname3);

		c.gridy = 1;
		c.gridx = 1;
		g.setConstraints(tname3, c);
		p3.add(tname3);

		c.gridy = 2;
		c.gridx = 0;
		g.setConstraints(lage3, c);
		p3.add(lage3);

		c.gridy = 2;
		c.gridx = 1;
		g.setConstraints(tage3, c);
		p3.add(tage3);

		c.gridy = 3;
		c.gridx = 0;
		g.setConstraints(lsex3, c);
		p3.add(lsex3);

		c.gridy = 3;
		c.gridx = 1;
		g.setConstraints(tsex3, c);
		p3.add(tsex3);

		c.gridy = 4;
		c.gridx = 0;
		g.setConstraints(lfhname3, c);
		p3.add(lfhname3);

		c.gridy = 4;
		c.gridx = 1;
		g.setConstraints(tfhname3, c);
		p3.add(tfhname3);

		c.gridy = 5;
		c.gridx = 0;
		g.setConstraints(ldoa3, c);
		p3.add(ldoa3);

		c.gridy = 5;
		c.gridx = 1;
		g.setConstraints(tdoa3, c);
		p3.add(tdoa3);

		c.gridy = 6;
		c.gridx = 0;
		g.setConstraints(ldod3, c);
		p3.add(ldod3);

		c.gridy = 6;
		c.gridx = 1;
		g.setConstraints(tdod3, c);
		p3.add(tdod3);

		c.gridy = 7;
		c.gridx = 0;
		g.setConstraints(ladd3, c);
		p3.add(ladd3);

		c.gridy = 7;
		c.gridx = 1;
		g.setConstraints(tadd3, c);
		p3.add(tadd3);

		c.gridy = 8;
		c.gridx = 0;
		g.setConstraints(lphone3, c);
		p3.add(lphone3);

		c.gridy = 8;
		c.gridx = 1;
		g.setConstraints(tphone3, c);
		p3.add(tphone3);

		c.gridy = 9;
		c.gridx = 0;
		g.setConstraints(lbill3, c);
		p3.add(lbill3);

		c.gridy = 9;
		c.gridx = 1;
		g.setConstraints(tbill3, c);
		p3.add(tbill3);

		c.gridy = 10;
		c.gridx = 0;
		g.setConstraints(bsearch, c);
		p3.add(bsearch);

		c.gridy = 10;
		c.gridx = 1;
		g.setConstraints(bquit3, c);
		p3.add(bquit3);

		// Background Color
		tp.setBackground(Color.RED);
		p.setBackground(Color.WHITE);
		p1.setBackground(Color.CYAN);
		p2.setBackground(Color.CYAN);
		p3.setBackground(Color.CYAN);

		// Adding Listeners
		badmit.addActionListener(this);
		bgenerate.addActionListener(this);
		bquit1.addActionListener(this);
		bsubmit.addActionListener(this);
		bdischarge.addActionListener(this);
		bquit2.addActionListener(this);
		bsearch.addActionListener(this);
		bquit3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getActionCommand().equals("Quit")) {
			System.exit(0);
		}

		if (ae.getActionCommand().equals("OK")) {
			if ((t1.getText().equals("Aakash")) && (t2.getText().equals("Tyagi"))) {
				f.setVisible(false);
				f1.setVisible(true);
			} else
				fpop.setVisible(true);
		}

		if (ae.getActionCommand().equals("Generate ID")) {
			String str1 = tname1.getText();
			String str2 = tphone1.getText();
			String temp1 = str1.substring(0, 5);
			String temp2 = str2.substring(7, 10);
			tid1.setText(temp1 + temp2);
			Calendar cal = Calendar.getInstance();
			String str3 = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR);
			tdoa1.setText(str3);
		}

		if (ae.getActionCommand().equals("Admit")) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
				PreparedStatement stmt = con.prepareStatement("INSERT into project VALUES(?,?,?,?,?,?,?,?,?,?)");
				stmt.setString(1, tid1.getText());
				stmt.setString(2, tname1.getText());
				stmt.setString(3, tage1.getText());
				stmt.setString(4, tsex1.getText());
				stmt.setString(5, tfhname1.getText());
				stmt.setString(6, tdoa1.getText());
				stmt.setString(7, null);
				stmt.setString(8, tadd1.getText());
				stmt.setString(9, tphone1.getText());
				stmt.setString(10, null);
				stmt.executeUpdate();

			} catch (Exception e) {
				System.out.println(e);
			}
		}

		if (ae.getActionCommand().equals("Submit")) {
			String sname = "";
			String sage = "";
			String ssex = "";
			String sfhname = "";
			String sdoa = "";
			String sadd = "";
			String sphone = "";
			long m, n, days, bill;
			Calendar cal = Calendar.getInstance();
			String str3 = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR);
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
				PreparedStatement stmt2 = con.prepareStatement("SELECT * FROM project where id=?");
				stmt2.setString(1, tid2.getText());
				ResultSet rs2 = stmt2.executeQuery();
				while (rs2.next()) {
					sname = rs2.getString(2);
					sage = rs2.getString(3);
					ssex = rs2.getString(4);
					sfhname = rs2.getString(5);
					sdoa = rs2.getString(6);
					// sdod=rs2.getString(7);
					sadd = rs2.getString(8);
					sphone = rs2.getString(9);
					// sbill=rs2.getString(10);
				}
				tdod2.setText(str3);
				tname2.setText(sname);
				tage2.setText(sage);
				tsex2.setText(ssex);
				tfhname2.setText(sfhname);
				tdoa2.setText(sdoa);
				tadd2.setText(sadd);
				tphone2.setText(sphone);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		if (ae.getActionCommand().equals("Discharge")) {
		}
		
		if (ae.getActionCommand().equals("Search")) {
			String s1id = "";
			String s1age = "";
			String s1sex = "";
			String s1fhname = "";
			String s1doa = "";
			String s1dod = "";
			String s1add = "";
			String s1phone = "";
			String s1bill = "";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
				PreparedStatement stmt3 = con.prepareStatement("SELECT * FROM project where name=?");
				stmt3.setString(1, tname3.getText());
				ResultSet rs3 = stmt3.executeQuery();
				while (rs3.next()) {
					s1id = rs3.getString(1);
					s1age = rs3.getString(3);
					s1sex = rs3.getString(4);
					s1fhname = rs3.getString(5);
					s1doa = rs3.getString(6);
					s1dod = rs3.getString(7);
					s1add = rs3.getString(8);
					s1phone = rs3.getString(9);
					s1bill = rs3.getString(10);
				}
				tid3.setText(s1id);
				tage3.setText(s1age);
				tsex3.setText(s1sex);
				tfhname3.setText(s1fhname);
				tdoa3.setText(s1doa);
				tdod3.setText(s1dod);
				tadd3.setText(s1add);
				tphone3.setText(s1phone);
				tbill3.setText(s1bill);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}