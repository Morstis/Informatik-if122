public class Gui extends javax.swing.JFrame {

    public static void main(String[] args) {

        Gui gui = new Gui();
        gui.init();
        gui.setTitle("Word Cloud");
        gui.setSize(1000, 620);
        gui.setResizable(false);
        gui.setLocation(50, 50);
        gui.setVisible(true);

    }

    private void init() {

        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JButton jButton2 = new javax.swing.JButton();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        javax.swing.JButton jButton5 = new javax.swing.JButton();
        javax.swing.JButton jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jButton1.setText("jButton1");

        getContentPane().add(jButton1);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);

        jButton5.setText("jButton5");
        getContentPane().add(jButton5);

        jButton6.setText("jButton6");
        getContentPane().add(jButton6);

        pack();

    }
}
