import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create a new JFrame (main window)
        JFrame frame = new JFrame("JavaTube");
        frame.setSize(800, 600);
        frame.setLocation(550,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use absolute positioning
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setResizable(false);

        // Title: "Java" part
        JLabel javaLabel = new JLabel("Java", SwingConstants.CENTER);
        javaLabel.setFont(new Font("Roboto", Font.BOLD, 60));
        javaLabel.setForeground(Color.WHITE);
        javaLabel.setBounds(255, 20, 150, 75);  // Position and size (x, y, width, height)
        frame.add(javaLabel);

        // Title: "Tube" part
        JLabel tubeLabel = new JLabel("Tube", SwingConstants.CENTER);
        tubeLabel.setFont(new Font("Roboto", Font.BOLD, 60));
        tubeLabel.setForeground(Color.WHITE);
        tubeLabel.setBounds(395, 20, 150, 75);  // Position and size (x, y, width, height)
        frame.add(tubeLabel);
        
        JPanel TubePanel = new JPanel();
        TubePanel.setBounds(400, 20, 145, 70); 
        TubePanel.setBackground(Color.RED);
        frame.add(TubePanel);

        // Search Field
        JTextField searchField = new JTextField();
        searchField.setFont(new Font("Roboto", Font.PLAIN, 18));
        searchField.setBounds(100, 100, 500, 55);
        searchField.setBackground(Color.WHITE);
        frame.add(searchField);

        // Search Button
        JButton searchButton = new JButton("Search");
        searchButton.setFont(new Font("Roboto", Font.BOLD, 18));
        searchButton.setBackground(Color.lightGray);
        searchButton.setBounds(605, 100, 100, 55);
        frame.add(searchButton);
        
        //Login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Roboto", Font.PLAIN, 18));
        loginButton.setBackground(Color.lightGray);
        loginButton.setBounds(685, 10, 90, 30);
        frame.add(loginButton);
        
        // Sidebar Buttons
        String[] sidebarOptions = {"Home", "Trending", "Subscriptions", "Library"};
        int a = 190;
        for (String option : sidebarOptions) {
            JButton sidebarButton = new JButton(option);
            sidebarButton.setFont(new Font("Roboto", Font.PLAIN, 18));
            sidebarButton.setBounds(30, a, 150, 40);  
            sidebarButton.setBackground(Color.lightGray);
            frame.add(sidebarButton);
            a += 60; 
        }
        
        // Sidebar Holder thing
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBounds(20, 180, 170, 245); 
        sidebarPanel.setBackground(Color.GRAY);
        frame.add(sidebarPanel);
        
        // Grid Layout for Video Buttons
        JPanel videoPanel = new JPanel();
        videoPanel.setBounds(200, 180, 550, 350); 
        videoPanel.setLayout(new GridLayout(3, 3, 10, 10));  // 2:3 grid with width 10 px seperating each other ig
        videoPanel.setBackground(Color.DARK_GRAY);
        
        // Adding buttons representing video thumbnails
        for (int i = 1; i <= 9; i++) {
            JButton videoButton = new JButton("Video " + i);
            videoButton.setFont(new Font("Roboto Mono", Font.BOLD, 16));
            videoButton.setBackground(Color.GRAY); //bg
            videoButton.setForeground(Color.WHITE); //font
            videoPanel.add(videoButton);
        }
        frame.add(videoPanel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}

public class Main {

    public static void main(String[] args) {
        // Create a new JFrame (main window)
        JFrame frame = new JFrame("JavaTube");
        frame.setSize(800, 600);
        frame.setLocation(550,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // Use absolute positioning
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setResizable(false);

        // Title: "Java" part
        JLabel javaLabel = new JLabel("Java", SwingConstants.CENTER);
        javaLabel.setFont(new Font("Roboto", Font.BOLD, 60));
        javaLabel.setForeground(Color.WHITE);
        javaLabel.setBounds(255, 20, 150, 75);  // Position and size (x, y, width, height)
        frame.add(javaLabel);

        // Title: "Tube" part
        JLabel tubeLabel = new JLabel("Tube", SwingConstants.CENTER);
        tubeLabel.setFont(new Font("Roboto", Font.BOLD, 60));
        tubeLabel.setForeground(Color.WHITE);
        tubeLabel.setBounds(395, 20, 150, 75);  // Position and size (x, y, width, height)
        frame.add(tubeLabel);
        
        JPanel TubePanel = new JPanel();
        TubePanel.setBounds(400, 20, 145, 70); 
        TubePanel.setBackground(Color.RED);
        frame.add(TubePanel);

        // Search Field
        JTextField searchField = new JTextField();
        searchField.setFont(new Font("Roboto", Font.PLAIN, 18));
        searchField.setBounds(100, 100, 500, 55);
        searchField.setBackground(Color.WHITE);
        frame.add(searchField);

        // Search Button
        JButton searchButton = new JButton("Search");
        searchButton.setFont(new Font("Roboto", Font.BOLD, 18));
        searchButton.setBackground(Color.lightGray);
        searchButton.setBounds(605, 100, 100, 55);
        frame.add(searchButton);
        
        //Login button
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Roboto", Font.PLAIN, 18));
        loginButton.setBackground(Color.lightGray);
        loginButton.setBounds(685, 10, 90, 30);
        frame.add(loginButton);
        
        // Sidebar Buttons
        String[] sidebarOptions = {"Home", "Trending", "Subscriptions", "Library"};
        int a = 190;
        for (String option : sidebarOptions) {
            JButton sidebarButton = new JButton(option);
            sidebarButton.setFont(new Font("Roboto", Font.PLAIN, 18));
            sidebarButton.setBounds(30, a, 150, 40);  
            sidebarButton.setBackground(Color.lightGray);
            frame.add(sidebarButton);
            a += 60; 
        }
        
        // Sidebar Holder thing
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setBounds(20, 180, 170, 245); 
        sidebarPanel.setBackground(Color.GRAY);
        frame.add(sidebarPanel);
        
        // Grid Layout for Video Buttons
        JPanel videoPanel = new JPanel();
        videoPanel.setBounds(200, 180, 550, 350); 
        videoPanel.setLayout(new GridLayout(3, 3, 10, 10));  // 2:3 grid with width 10 px seperating each other ig
        videoPanel.setBackground(Color.DARK_GRAY);
        
        // Adding buttons representing video thumbnails
        for (int i = 1; i <= 9; i++) {
            JButton videoButton = new JButton("Video " + i);
            videoButton.setFont(new Font("Roboto Mono", Font.BOLD, 16));
            videoButton.setBackground(Color.GRAY); //bg
            videoButton.setForeground(Color.WHITE); //font
            videoPanel.add(videoButton);
        }
        frame.add(videoPanel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
