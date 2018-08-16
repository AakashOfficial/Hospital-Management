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

	
}
