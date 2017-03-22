/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team6Final;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 *
 * @author nnamdyjunior
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public TextArea textArea, textArea1;
    public Button button1, button2, button3, button4, button5, button6,
            button7, button8, button9, insertCard;
    
	private static Register register = new Register(new ProductCatalog());
	private String action = "ejected";
	
	//information displayed initially on the UI
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    	textArea1.setText("ItemID\t\tItemName\t\t\t\t\t\tPrice\n"
				+ "1\t\tRolex Wristwatch\t\t\t\t\t\t$25000\n"
				+ "2\t\tHublot Wristwatch\t\t\t\t\t\t$58000\n"
				+ "3\t\tGold Ring\t\t\t\t\t\t\t$36000\n"
				+ "4\t\tDiamond Encrusted Cartier Wristwatch\t$783600\n"
				+ "5\t\tDiamond Engagement Ring\t\t\t\t$980000\n"
				+ "6\t\tRayBan, Limited Edition\t\t\t\t\t$28000\n"
				+ "7\t\tGold Bar\t\t\t\t\t\t\t\t$100000\n"
				+ "8\t\tDiamond Necklace\t\t\t\t\t\t$698000\n"
				+ "9\t\tGold Earrings (1 pair)\t\t\t\t\t$215000\n"); 
    	
    }    
    
    //event handlers for the buttons
    @FXML
    private void handleItem1Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(1);
    }
    
    @FXML
    private void handleItem2Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(2);
    }
    
    @FXML
    private void handleItem3Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(3);
    }
    
    @FXML
    private void handleItem4Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(4);
    }
    
    @FXML
    private void handleItem5Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(5);
    }
    
    @FXML
    private void handleItem6Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(6);
    }
    
    @FXML
    private void handleItem7Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(7);
    }
    
    @FXML
    private void handleItem8Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(8);
    }
    
    @FXML
    private void handleItem9Action(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	makeNewSale(9);
    }
    
    //simulates insert and eject card actions.
    @FXML
    private void insertCardAction(ActionEvent event) {
        if (action == "ejected"){
        	textArea.setText("Account Balance: " + CreditCard.getBalance().toString());
            enableAll();
            register.makeNewSale();
            action = "inserted";
            insertCard.setText("Remove Card"); 
        }
        else {
        	textArea.setText("PLEASE INSERT CARD");
            disableAll();
            action = "ejected";
            insertCard.setText("Insert Card"); 
        }
    }
    
    //enable item selection when a valid credit card is inserted
    private void enableAll(){
    	button1.setDisable(false); button2.setDisable(false); button3.setDisable(false);
        button4.setDisable(false); button5.setDisable(false); button6.setDisable(false);
        button7.setDisable(false); button8.setDisable(false); button9.setDisable(false);
    }
    
    //disable item selection when the user purchases an item (one item per sale)
    private void disableAll(){
    	button1.setDisable(true); button2.setDisable(true); button3.setDisable(true);
        button4.setDisable(true); button5.setDisable(true); button6.setDisable(true);
        button7.setDisable(true); button8.setDisable(true); button9.setDisable(true);
    }
    
    //begin a new sale of the selected product (indicated by x)
    private void makeNewSale(int x) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
    	register.enterItem(x);
		register.makePayment();
		textArea.setText(register.getReceipt()); 
		disableAll();
		action = "ejected";
        insertCard.setText("Insert Card");
    }
    
}
