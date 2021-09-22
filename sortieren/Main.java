import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.09.2021
 * @author
 */

public class Main extends JFrame {
  // Anfang Attribute
  private JButton bGeneriereZahlen = new JButton();
  private JTextArea jTextArea = new JTextArea("");
  private JScrollPane jTextAreaScrollPane = new JScrollPane(jTextArea);
  private JTextArea nInput = new JTextArea("");
  private JScrollPane nInputScrollPane = new JScrollPane(nInput);
  private JLabel lAnzahlderZahlenn1 = new JLabel();
  private JTextArea jTextArea1 = new JTextArea("");
  private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JButton bBubbleSort = new JButton();
  private List<Integer> from0ToN = new ArrayList<Integer>();
  private Canvas canvas1 = new Canvas();
  private JButton bRandomSort = new JButton();
  private Random generateNumber = new Random();
  private Integer[] arr;
  Draw draw;
  // Ende Attribute

  public Main() {
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1087;
    int frameHeight = 569;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Main");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten

    bGeneriereZahlen.setBounds(58, 143, 163, 41);
    bGeneriereZahlen.setText("Generiere Zahlen");
    bGeneriereZahlen.setMargin(new Insets(2, 2, 2, 2));
    bGeneriereZahlen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bGeneriereZahlen_ActionPerformed(evt);
      }
    });
    cp.add(bGeneriereZahlen);
    jTextAreaScrollPane.setBounds(60, 221, 152, 268);
    cp.add(jTextAreaScrollPane);
    nInputScrollPane.setBounds(199, 45, 120, 28);
    cp.add(nInputScrollPane);
    lAnzahlderZahlenn1.setBounds(62, 46, 126, 20);
    lAnzahlderZahlenn1.setText("Anzahl der Zahlen (n):");
    cp.add(lAnzahlderZahlenn1);
    jTextArea1ScrollPane.setBounds(758, 221, 152, 268);
    cp.add(jTextArea1ScrollPane);
    bBubbleSort.setBounds(252, 144, 115, 41);
    bBubbleSort.setText("BubbleSort");
    bBubbleSort.setMargin(new Insets(2, 2, 2, 2));
    bBubbleSort.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bBubbleSort_ActionPerformed(evt);
      }
    });
    cp.add(bBubbleSort);
    canvas1.setBounds(259, 216, 468, 268);
    canvas1.setBackground(Color.WHITE);
    cp.add(canvas1);
    bRandomSort.setBounds(391, 142, 115, 41);
    bRandomSort.setText("Random Sort");
    bRandomSort.setMargin(new Insets(2, 2, 2, 2));
    bRandomSort.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        bRandomSort_ActionPerformed(evt);
      }
    });
    cp.add(bRandomSort);
    // Ende Komponenten

    setVisible(true);
    draw = new Draw<Canvas>(this.canvas1);
  } // end of public Main

  // Anfang Methoden

  public static void main(String[] args) {
    new Main();
  } // end of main

  public void bGeneriereZahlen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    this.jTextArea.setText("");
    this.from0ToN.clear();
    int n;
    try {
      n = Integer.parseInt(this.nInput.getText());
    } catch (NumberFormatException e) {
      this.jTextArea.setText("Es muss eine Nummer eingegeben werden!");
      return;
    }

    int i = 0;

    while (i < n) {
      int r = generateNumber.nextInt(n);
      if (!this.from0ToN.contains(r)) {
        this.from0ToN.add(r);
        this.jTextArea.append(String.valueOf(r + "\n"));
        i++;
      }

    }

    this.arr = from0ToN.toArray(new Integer[0]);
    draw.draw(arr);

  } // end of bGeneriereZahlen_ActionPerformed

  public void bBubbleSort_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen

  } // end of bBubbleSort_ActionPerformed

  boolean isSorted(Integer[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i + 1] < arr[i]) {
        return false;
      }
    }
    return true;
  }

  public void bRandomSort_ActionPerformed(ActionEvent evt) {
    this.draw.setColor(Color.RED);
    while (!this.isSorted(this.arr)) {

      int a = generateNumber.nextInt(this.arr.length);
      int b = generateNumber.nextInt(this.arr.length);

      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;

      draw.draw(arr);

    } // end of while

  } // end of bRandomSort_ActionPerformed

  // Ende Methoden
} // end of class Main
