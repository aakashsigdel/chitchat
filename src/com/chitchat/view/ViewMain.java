package com.chitchat.view;

import java.awt.BorderLayout;
import java.awt.Insets;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class ViewMain {
	private JFrame parentWindow = null;
	private JTextPane userList = null;
	private JTextPane chatArea = null;
	
	public ViewMain() {
		parentWindow = new JFrame("ChitChatVIT");
		parentWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/*	
		StyleContext context = new StyleContext();
		StyledDocument document = new DefaultStyledDocument(context);
		Style labelStyle = context.getStyle(StyleContext.DEFAULT_STYLE);
		Icon icon = new ImageIcon("resources/images/icon.gif");
		JLabel label = new JLabel(icon);
		StyleConstants.setComponent(labelStyle, label);
		
		try {
			document.insertString(document.getLength(), "Ignored", labelStyle);
		} catch(BadLocationException e) {
			e.printStackTrace();
		}
		
		userList = new JTextPane();
		userList.setEditable(false);
		userList.setMargin(new Insets(5, 5, 5, 5));
		JScrollPane scrollBar = new JScrollPane(userList);
		parentWindow.add(scrollBar, BorderLayout.CENTER);*/
		
		parentWindow.setSize(300,500);
		parentWindow.setVisible(true);
		
	}
	
	public void makeUserLabel(String user) {
		JLable
	}
	
	//should be on different View
	public void setMessage(String message, String user, Date timeStamp) {
		
	}
	
	
}
