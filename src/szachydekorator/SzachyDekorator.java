///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package szachydekorator;
//
//import java.awt.BorderLayout;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JToolBar;
//
///**
// *
// * @author A5US
// */
//public class SzachyDekorator {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Chess");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        Chessboard board = new Chessboard();
//
//        JToolBar bar = new JToolBar();
//        board.undo = new JButton(new ImageIcon("undo.png"));
//        board.redo = new JButton(new ImageIcon("redo.png"));
//        board.undo.addActionListener(board.new UndoButton());
//        board.redo.addActionListener(board.new RedoButton());
//        board.undo.setEnabled(false);
//        board.redo.setEnabled(false);
//        bar.add(board.undo);
//        bar.add(board.redo);
//
//        frame.add(bar, BorderLayout.PAGE_START);
//        frame.add(board);
//
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//}
