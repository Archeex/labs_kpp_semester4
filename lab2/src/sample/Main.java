package sample;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Main class
 *
 * @author Archeex
 * @version 1.0
 */
public class Main {

    public static void main(String[] args){
        JFrame frame = new JFrame("labTwo [variant 3]");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel workersPanel = new JPanel(new FlowLayout());
        workersPanel.setPreferredSize(new Dimension(700, 150));
        JButton addWorker = new JButton("Add Worker");
        JLabel countWorkers = new JLabel("Count of workers = 0");
        workersPanel.add(addWorker);
        workersPanel.add(countWorkers);

        frame.add(workersPanel, BorderLayout.NORTH);

        JPanel productsPanel = new JPanel(new FlowLayout());
        productsPanel.setPreferredSize(new Dimension(700, 150));
        JButton makeProduct = new JButton("Make Product");
        JLabel countProducts = new JLabel("Count of products = 0");
        workersPanel.add(makeProduct);
        workersPanel.add(countProducts);

        frame.add(productsPanel, BorderLayout.CENTER);

        JPanel autoCountPanel = new JPanel(new FlowLayout());
        JLabel autoCount = new JLabel("Auto's count = 0");
        autoCountPanel.add(autoCount);
        frame.add(autoCountPanel, BorderLayout.CENTER);

        frame.setSize(700, 300);
        frame.setResizable(false);
        frame.setVisible(true);


        Manufacture manufacture = new Manufacture();

        addWorker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manufacture.newWorker();
                countWorkers.setText("Count of workers = " + manufacture.getCountWorkers());
            }
        });

        makeProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(manufacture.getCountWorkers() != 0) {
                    manufacture.makeProduct();
                    countProducts.setText("Count of products = " + manufacture.getCountProducts());
                    autoCount.setText("Auto's count = " + manufacture.getAutoCountClass());
                }
            }
        });



    }
}