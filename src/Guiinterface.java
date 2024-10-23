import javax.swing.JOptionPane;
public class Guiinterface {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
//        switch (age){
//            case 1:
//                JOptionPane.showMessageDialog(null, "monday");
//                break;
//            case 2:
//                JOptionPane.showMessageDialog(null, "Tuesday");
//                break;
//            case 3:
//                JOptionPane.showMessageDialog(null, "wednesday");
//                break;
//            case 4:
//                JOptionPane.showMessageDialog(null, "thursday");
//                break;
//            case 5:
//                JOptionPane.showMessageDialog(null, "Friday");
//                break;
//            case 6:
//                JOptionPane.showMessageDialog(null, "saturday");
//                break;
//            case 7:
//                JOptionPane.showMessageDialog(null, "sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " meters tall");
    }
}
