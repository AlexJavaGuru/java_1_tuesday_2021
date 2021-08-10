package student_josifs_makarenko.lesson_2.level7.Task_28;

import javax.swing.*;

public class Notebook {
    Notebook(){
        JFrame f= new JFrame();
        JTextArea area=new JTextArea(" book => Book" +
                " Bankaccount => BankAccount" +
                " systemUnit => SystemUnit" +
                " Login_Service => LoginService" +
                " banktransaction => BankTransaction" +
                " task1 => Task_1");
        area.setBounds(15,35, 1820,1180);
        f.add(area);
        f.setSize(1920,1280);
        f.setLayout(null);
        f.setVisible(true);
    }

}
