package sample;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class "Main"
 *
 * @author Archeex
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("labTwo [variant 3]");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel workersPanel = new JPanel(new FlowLayout());
        workersPanel.setPreferredSize(new Dimension(700, 100));
        JButton addWorker = new JButton("Add Worker");
        JLabel countWorkers = new JLabel("Count of workers = 0");
        workersPanel.add(addWorker);
        workersPanel.add(countWorkers);

        frame.add(workersPanel, BorderLayout.NORTH);

        JPanel productsPanel = new JPanel(new FlowLayout());
        productsPanel.setPreferredSize(new Dimension(700, 100));
        JButton makeProduct = new JButton("Make Product");
        JLabel countAutos = new JLabel("Count of autos = 0");
        JLabel countMatches = new JLabel("Count of matches = 0");
        JLabel countPans = new JLabel("Count of pans = 0");

        JLabel typeText = new JLabel("Type of product: ");
        JComboBox productType = new JComboBox();
        productType.addItem("Match");
        productType.addItem("Pan");
        productType.addItem("Auto");
        productsPanel.add(countAutos);
        productsPanel.add(countMatches);
        productsPanel.add(countPans);
        workersPanel.add(typeText);
        workersPanel.add(productType);
        workersPanel.add(makeProduct);

        frame.add(productsPanel, BorderLayout.CENTER);

        frame.setSize(700, 300);
        frame.setResizable(false);
        frame.setVisible(true);


        Manufacture manufacture = new Manufacture();

//        productType.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Director dir = new Director();
//                dir.changeProductTypeInClass(productType.getSelectedIndex() + 1);
//                manufacture.changeProductTypeInClass(productType.getSelectedIndex() + 1);
//            }
//        });

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
                    manufacture.makeProduct(productType.getSelectedIndex() + 1);
                    switch(manufacture.getProductType()){
                        case 1: countAutos.setText("Count of autos = " + manufacture.getAutoCountClass());
                        case 2: countPans.setText("Count of pans = " + manufacture.getPanCountClass());
                        case 3: countMatches.setText("Count of matches = " + manufacture.getMatchCountClass());
                    }
                }
            }
        });



    }
}