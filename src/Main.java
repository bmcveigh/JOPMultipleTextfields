/**
 * This is a demonstration of how multiple textfields can
 * be added to a JOptionPane.
 *
 * @author Brian McVeigh
 */

import java.util.ArrayList;

import javax.swing.*;

public class Main {

        public static void main(String[] args) {

                // Create our array of combo box choices
                String[] comboBoxChoices = {
                    "Select an option...",
                    "Choice 1", 
                    "Choice 2", 
                    "Choice 3"
                };

                // Create our text field and combo box objects
                JTextField textField = new JTextField();
                JComboBox comboBox = new JComboBox(comboBoxChoices);
                comboBox.setSelectedIndex(0);


                // Create an array of Object objects
                Object[] objects = {
                    "JComboBox Example",
                    "Text Box: ", textField,
                    "Combo Box: ", comboBox
                };

                // Display a JOptionPane dialog box with the text box and combo box
                // The variable choice just allows you to listen to the user's choice 
                int choice = JOptionPane.showConfirmDialog(null, objects, "Select an Option", JOptionPane.OK_CANCEL_OPTION);

                if (choice == JOptionPane.OK_OPTION) {
                    // Add the object to an ArrayList
                    ArrayList<String> arrayList = new ArrayList<String>();
                    String textFieldText = textField.getText();

                    // Add textFieldText to the ArrayList
                    arrayList.add(textFieldText);
                    arrayList.add(comboBox.getSelectedItem().toString());

                    // Print out all objects in the ArrayList
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                    }
                }
                else {
                    // Add what you want to happen if the user selects Cancel
                }
        }

}
