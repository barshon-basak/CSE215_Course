import java.awt.*;
import java.awt.event.*;
public class testCls2 {
private Frame frame;
private Label label;
private Button incrementButton;
private int count = 0;
public testCls2() {
frame = new Frame("Counter App");
label = new Label("Count: 0");
incrementButton = new Button("Increment");
incrementButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
count++;
label.setText("Count: " + count);
}
});
frame.setLayout(new FlowLayout());
frame.add(label);
frame.add(incrementButton);
frame.setSize(300, 100);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
}
public static void main(String[] args) {
new testCls2();
}
}
