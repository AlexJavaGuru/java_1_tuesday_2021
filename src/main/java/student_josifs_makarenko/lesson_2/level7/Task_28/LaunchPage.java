package student_josifs_makarenko.lesson_2.level7.Task_28;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Чутка формат поехал и логика в конструкторе. Но ответ засчитан")
    public class LaunchPage implements ActionListener {

        JFrame frame = new JFrame();
        JButton myButton = new JButton("Open answer");

        LaunchPage(){

            myButton.setBounds(100,160,200,40);
            myButton.setFocusable(false);
            myButton.addActionListener(this);

            frame.add(myButton);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==myButton) {
                frame.dispose();
                Notebook myWindow = new Notebook();
            }
        }
}
