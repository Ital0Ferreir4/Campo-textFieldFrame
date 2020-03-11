package textfieldframe;
//demonstrando a classe JTextField
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
public class TextFieldFrame extends JFrame {
    
    private JTextField textField1; //campo de texto com tamanho configurado
    private JTextField textField2; //campó de texto construindo um texto
    private JTextField textField3; //campo DE TEXTO COM TEXTO e tamanho
    private JPasswordField passwordField; // campo de senha com texto
    
    //construtor TextFieldFrame adiciona JTextFields a JFrame
    public TextFieldFrame(){
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout()); //configura o layout do frame
        
        //constrói o textField com 10 colunas
        textField1 = new JTextField(10);
        add(textField1); //Adicina textField ao JFrame
        
        //constroi o campo de texto com texto padrão 
        textField2 = new JTextField("Enter text here");
        add(textField2 ); // Adicina textField2 ao JFrame
        
        //constroi 
        textField3 = new JTextField("Uneditable text field ", 21);
        textField3.setEditable(false);
        add(textField3); // Adicina textField3 ao JFrame
        
        //constroi passwordField com o texto padrão
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);// Adicina passwordField ao JFrame
        
        //Handlers de evento registradores
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
        //fim do construtor TextFieldFrame
    }
    //classe interna private para tratamento de evento
    private class TextFieldHandler implements ActionListener{
        
        //processa eventos de campo de texto
        public void actionPerformed (ActionEvent event){
            String string = ""; //declara string a ser exibida
            
            //Usuário pressionou ENTER no JTextField textField1
            if(event.getSource() == textField1)
                string = String.format("textField: %s", event.getActionCommand());
            
            //Usuário pressionou ENTER no JTextField textField2
            else if (event.getSource() == textField2)
                string = String.format("textField2: %s", event.getActionCommand());
            
            //Usuário pressionou ENTER no JTextField textField3
            else if(event.getSource() == textField3)
                string = String.format("textField3 : %s", event.getActionCommand());
            
            //Uuário pressionou ENTER no JTextField passwordField
            else if(event.getSource() == passwordField)
                string = String.format("passwordField : %s", event.getActionCommand());
            
            //exibe o conteúdo de JTextField
            JOptionPane.showMessageDialog(null,     string);
           
        }//fim do método actionPerfomed
    }//fim da classe textFieldHandler interna private
}//fim da classe TextFieldFrame
