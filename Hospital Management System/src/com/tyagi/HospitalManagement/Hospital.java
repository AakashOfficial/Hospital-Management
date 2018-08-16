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
	}
}