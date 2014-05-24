

package settingsView;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;









import java.util.Set;

import unix.ExecuteUnixOperations;
import viewLogic.CSharedInstance;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.MapChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import viewLogic.CViewConstants;


public class CSettingsController implements Initializable
{


    @FXML // fx:id="btnConnect"
    private Button btnConnect; // Value injected by FXMLLoader

    @FXML // fx:id="btnSaveConfiguration"
    private Button btnSaveConfiguration; // Value injected by FXMLLoader

    @FXML // fx:id="chkboxClix"
    private RadioButton chkboxClix; // Value injected by FXMLLoader

    @FXML // fx:id="chkboxMdisr"
    private RadioButton chkboxMdisr; // Value injected by FXMLLoader

    @FXML // fx:id="chkboxMdsr"
    private RadioButton chkboxMdsr; // Value injected by FXMLLoader

    @FXML // fx:id="chkboxMdssr"
    private RadioButton chkboxMdssr; // Value injected by FXMLLoader

    @FXML // fx:id="cmbStartSelection"
    private ComboBox<String> cmbStartSelection; // Value injected by FXMLLoader
    
    @FXML // fx:id="cmbID"
    private ComboBox<String> cmbID;

    @FXML // fx:id="paneTimeFrame"
    private AnchorPane paneTimeFrame; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldHostName"
    private TextField txtFieldHostName; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldInstance"
    private TextField txtFieldInstance; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldInstanceTime"
    private TextField txtFieldInstanceTime; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldPassword"
    private PasswordField txtFieldPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldTimeFrameFrom"
    private TextField txtFieldTimeFrameFrom; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldTimeFrameTo"
    private TextField txtFieldTimeFrameTo; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldUserName"
    private TextField txtFieldUserName; // Value injected by FXMLLoader
    
    @FXML // fx:id="txtFieldMemoryPop"
    private TextField txtFieldMemoryPop; // Value injected by FXMLLoader
    
    @FXML // fx:id="txtFieldPort"
    private TextField txtFieldPort; // Value injected by FXMLLoader
    
    @FXML // fx:id="txtFieldConfigurationID"
    private TextField txtFieldConfigurationID; // Value injected by FXMLLoader
    
    @FXML // fx:id="lblResponseToUser"
    private Label lblResponseToUser; // Value injected by FXMLLoader
    
    @FXML // fx:id="pnlSettings"
    private AnchorPane pnlSettings; // Value injected by FXMLLoader

    @FXML // fx:id="txtFieldTimeFrameTo"
    private Text txtConfigurationID;
    
    ////////  logic Variables //////
    

    
    
    //////// end logic Variables ///
    
   
    public void initialize(URL fxmlFileLocation, ResourceBundle resources)
    {
    	assert btnConnect != null : "fx:id=\"btnConnect\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert btnSaveConfiguration != null : "fx:id=\"btnSaveConfiguration\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert chkboxClix != null : "fx:id=\"chkboxClix\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert chkboxMdisr != null : "fx:id=\"chkboxMdisr\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert chkboxMdsr != null : "fx:id=\"chkboxMdsr\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert chkboxMdssr != null : "fx:id=\"chkboxMdssr\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert cmbStartSelection != null : "fx:id=\"cmbStartSelection\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert paneTimeFrame != null : "fx:id=\"paneTimeFrame\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldHostName != null : "fx:id=\"txtFieldHostName\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldInstance != null : "fx:id=\"txtFieldInstance\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldInstanceTime != null : "fx:id=\"txtFieldInstanceTime\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldPassword != null : "fx:id=\"txtFieldPassword\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldTimeFrameFrom != null : "fx:id=\"txtFieldTimeFrameFrom\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldTimeFrameTo != null : "fx:id=\"txtFieldTimeFrameTo\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldUserName != null : "fx:id=\"txtFieldUserName\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldMemoryPop != null : "fx:id=\"txtFieldMemoryPop\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldPort != null : "fx:id=\"txtFieldPort\" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert txtFieldConfigurationID != null : "fx:id=\"txtFieldConfigurationID \" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert lblResponseToUser != null : "fx:id=\"lblResponseToUser \" was not injected: check your FXML file 'Setting_Page.fxml'.";
        assert pnlSettings != null : "fx:id=\"pnlSettings \" was not injected: check your FXML file 'Setting_Page.fxml'.";
        
        // Initialize your logic here: all @FXML variables will have been injected
        
        
        // configuration ids added here
        Set<String> configurationsKeySet = CSharedInstance.getInstance().getAllConfigurationKeys();
        if (configurationsKeySet != null && !configurationsKeySet.isEmpty())
        {
        	cmbID.getItems().addAll(configurationsKeySet);
        }
        
        
        btnConnect.setOnAction(new EventHandler<ActionEvent>() 
        {

        	@Override
        	public void handle(ActionEvent event)
        	{
        		if (updateLblIfInputNotOK())
        		{
        			// start connection
        			ExecuteUnixOperations executeUnixOperations = new ExecuteUnixOperations(CSharedInstance.getInstance().getCurrentConfiguration());
        			executeUnixOperations.start();	
        		}
        		
        	}

        });
        
        
        btnSaveConfiguration.setOnAction(new EventHandler<ActionEvent>() 
        {

        	@Override
        	public void handle(ActionEvent event) 
        	{
        		if (updateLblIfInputNotOK())
        		{
        			Map<String, Object> currentSettings = getCurrentSettingsOnView();
        			
        			// save configuration
        			CSharedInstance.getInstance().saveConfigurations(currentSettings);
        			
        			//update view
        			String key = (String) currentSettings.get(CViewConstants.CONFIGURATION_ID);
        			
        			if (cmbID.getItems().size() >= 10)
        			{
        				cmbID.getItems().remove(cmbID.getItems().size() - 1);
        			}
        			
        			cmbID.getItems().add(1,key);
        		}
        	}

        });
        
      
        
        txtFieldHostName.textProperty().addListener(new ChangeListener<String>() 
        {
 
            private boolean ignore;

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
            {
                if (ignore || s1 == null)
                    return;
                
                if (maxLengthInText() < s1.length()) 
                {
                    ignore = true;
                    txtFieldHostName.setText(s1.substring(0, maxLengthInText()));
                    ignore = false;
                } 
                else if (s1.length() > 0)
                {
                	char c = s1.charAt(s1.length() - 1);
                	
                	if (!isLatinLetter(c) && !isDigit(c) && c != '.')
                	{
                        ignore = true;
                        txtFieldHostName.setText(s);
                        ignore = false;
                	}
                	
                }
            }
            
        });
        
        
        txtFieldInstance.textProperty().addListener(new ChangeListener<String>() 
        {
 
            private boolean ignore;

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
            {
                if (ignore || s1 == null)
                    return;
                
                if (maxLengthInText() < s1.length()) 
                {
                    ignore = true;
                    txtFieldInstance.setText(s1.substring(0, maxLengthInText()));
                    ignore = false;
                } 
                else if (s1.length() > 0)
                {
                	char c = s1.charAt(s1.length() - 1);
                	
                	if (!isLatinLetter(c) && !isDigit(c))
                	{
                        ignore = true;
                        txtFieldInstance.setText(s);
                        ignore = false;
                	}
                	
                }
            }
            
        });
        
        
        txtFieldInstanceTime.textProperty().addListener(new ChangeListener<String>() 
        {
 
            private boolean ignore;

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
            {
                if (ignore || s1 == null)
                    return;
                
                if (s1.length() > 0)
                {
                	char c = s1.charAt(s1.length() - 1);
                	
                	if (!isDigit(c) && Integer.parseInt(s1) > maxAllowedInstanceInterval())
                	{
                        ignore = true;
                        txtFieldInstanceTime.setText(s);
                        ignore = false;
                	}
                	
                }
            }
            
        });
        
        txtFieldMemoryPop.textProperty().addListener(new ChangeListener<String>() 
        {
 
            private boolean ignore;

            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
            {
                if (ignore || s1 == null)
                    return;
                
                if (s1.length() > 0)
                {
                	char c = s1.charAt(s1.length() - 1);
                	
                    boolean isAnySelected = chkboxMdsr.isSelected() || chkboxMdisr.isSelected() || chkboxMdssr.isSelected();
                	
                	if (!isDigit(c) || !isAnySelected)
                	{
                        ignore = true;
                        txtFieldMemoryPop.setText(s);
                        ignore = false;
                	}
                	
                }
            }
            
        });
        
        
        txtFieldPort.textProperty().addListener(new ChangeListener<String>() 
        {

        	private boolean ignore;

        	@Override
        	public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
        	{
        		if (ignore || s1 == null)
        			return;

        		if (s1.length() > 0)
        		{
        			char c = s1.charAt(s1.length() - 1);

        			if (!isDigit(c) || !chkboxClix.isSelected())
        			{
        				ignore = true;
        				txtFieldPort.setText(s);
        				ignore = false;
        			}

        		}
        	}

        });
        
        
        txtFieldTimeFrameFrom.textProperty().addListener(new ChangeListener<String>() 
        {

        	private boolean ignore;

        	@Override
        	public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
        	{
        		if (ignore || s1 == null)
        			return;

        		if (s1.length() > 0)
        		{
        			char c = s1.charAt(s1.length() - 1);

        			if (!isDigit(c))
        			{
        				ignore = true;
        				txtFieldTimeFrameFrom.setText(s);
        				ignore = false;
        			}

        		}
        	}

        });
        
        
        txtFieldTimeFrameTo.textProperty().addListener(new ChangeListener<String>() 
        {

        	private boolean ignore;

        	@Override
        	public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
        	{
        		if (ignore || s1 == null)
        			return;

        		if (s1.length() > 0)
        		{
        			char c = s1.charAt(s1.length() - 1);

        			if (!isDigit(c))
        			{
        				ignore = true;
        				txtFieldTimeFrameTo.setText(s);
        				ignore = false;
        			}

        		}
        	}

        });
        
        txtFieldConfigurationID.textProperty().addListener(new ChangeListener<String>() 
        {

        	private boolean ignore;

        	@Override
        	public void changed(ObservableValue<? extends String> observableValue, String s, String s1)
        	{
        		if (ignore || s1 == null)
        			return;

        		if (maxLengthInText() < s1.length()) 
        		{
        			ignore = true;
        			txtFieldConfigurationID.setText(s1.substring(0, maxLengthInText()));
        			ignore = false;
        		} 
        		else if (s1.length() > 0)
        		{
        			char c = s1.charAt(s1.length() - 1);

        			if (!isLatinLetter(c) && !isDigit(c))
        			{
        				ignore = true;
        				txtFieldConfigurationID.setText(s);
        				ignore = false;
        			}

        		}
        	}

        });
        
       
        
    }
    
    



	///////////////////////   Events Sections ///////////////////////////
    
    
	public void chkboxMdsrOnMouseClicked()
    {
    	if (chkboxMdsr.isSelected())
    	{
    		chkboxMdsr.setSelected(true);
    	}
    	else
    	{
    		chkboxMdsr.setSelected(false);
    		
    		updateMemoryPop();
    	}
    	
    }
    

	public void chkboxMdisrOnMouseClicked()
    {
    	if (chkboxMdisr.isSelected())
    	{
    		chkboxMdisr.setSelected(true);
    	}
    	else
    	{
    		chkboxMdisr.setSelected(false);
    		
    		updateMemoryPop();
    	}
    	
    }

    public void chkboxMdssrOnMouseClicked()
    {
    	if (chkboxMdssr.isSelected())
    	{
    		chkboxMdssr.setSelected(true);
    	}
    	else
    	{
    		chkboxMdssr.setSelected(false);
    		
    		updateMemoryPop();
    	}
    	
    }
    
    public void chkBoxClixOnMousePressed()
    {
    	if (chkboxClix.isSelected())
    	{
    		chkboxClix.setSelected(true);
    	}
    	else
    	{
    		chkboxClix.setSelected(false);
    		
    		updatePort();
    	}
    }
    
    public void cmbSelectionOnAction()
    {
    	int selectedIndex = cmbStartSelection.getSelectionModel().getSelectedIndex();
    	
    	if (selectedIndex == 1) // Starting with 0 , with frame is in 2nd location
    	{
    		paneTimeFrame.setVisible(true);
    	}
    	else	
    	{
    		paneTimeFrame.setVisible(false);
    		txtFieldTimeFrameFrom.setText("");
    		txtFieldTimeFrameTo.setText("");
    	}
    }
    
    
    public void cmbSelectIDOnAction()
    {
    	int selectedIndex = cmbID.getSelectionModel().getSelectedIndex();
    	
    	// new Configuration
    	if (selectedIndex == 0)
    	{
    		txtConfigurationID.setVisible(true);
    		txtFieldConfigurationID.setVisible(true);
    		
    		clearSettingPage();
    	}
    	else if (selectedIndex > 0) // existing configuration was chosen
    	{
    		txtConfigurationID.setVisible(false);
    		txtFieldConfigurationID.setVisible(false);
    		
    		setFieldsOnViewByConfigurationID(cmbID.getSelectionModel().getSelectedItem());
    	}
    	
    }
    
    private void clearSettingPage()
    {
    	txtFieldHostName.clear();
    	txtFieldUserName.clear();
    	txtFieldPassword.clear();
    	txtFieldInstance.clear();
    	txtFieldInstanceTime.clear();
    	chkboxMdsr.setSelected(false);
    	chkboxMdisr.setSelected(false);
    	chkboxMdssr.setSelected(false);
    	txtFieldMemoryPop.clear();
    	chkboxClix.setSelected(false);
    	txtFieldPort.clear();
    	cmbStartSelection.setPromptText(cmbStartSelection.getPromptText());
    	paneTimeFrame.setVisible(false);
    	txtFieldTimeFrameFrom.clear();
    	txtFieldTimeFrameTo.clear();
    }
    
    
    
    private void setFieldsOnViewByConfigurationID(String selectedItem)
    {
    	Map<String, Object> map = CSharedInstance.getInstance().getChosenConfiguration(selectedItem);
    	
    	if (map == null || map.isEmpty())
    	{
    		 cmbID.getSelectionModel().select(0);
    	}
    	else
    	{
    		String hostName = (String)map.get(CViewConstants.HOSTNAME);
    		if (hostName != null)
    		{
    			txtFieldHostName.setText(hostName);
    		}
    		
    		String userName = (String)map.get(CViewConstants.USERNAME);
    		if (userName != null)
    		{
    			txtFieldUserName.setText(userName);
    		}
    		
    		String password = (String)map.get(CViewConstants.PASSWORD);
    		if (password != null)
    		{
    			txtFieldPassword.setText(password);
    		}
    		
    		String instance = (String)map.get(CViewConstants.INSTANCE);
    		if (instance != null)
    		{
    			txtFieldInstance.setText(instance);
    		}
    		
    		String interval = (String)map.get(CViewConstants.INTERVAL);
    		if (interval != null)
    		{
    			txtFieldInstanceTime.setText(interval);
    		}
    		
    		Boolean isMdsr = (Boolean)map.get(CViewConstants.MDSR);
    		if (isMdsr != null)
    		{
    			chkboxMdsr.setSelected(isMdsr);;
    		}
    		
    		Boolean isMdisr = (Boolean)map.get(CViewConstants.MDISR);
    		if (isMdisr != null)
    		{
    			chkboxMdisr.setSelected(isMdisr);;
    		}
    		
    		Boolean isMdssr = (Boolean)map.get(CViewConstants.MDSSR);
    		if (isMdssr != null)
    		{
    			chkboxMdssr.setSelected(isMdssr);;
    		}
    		
    		String memPop = (String)map.get(CViewConstants.MEMORY_POP);
    		if (memPop != null)
    		{
    			txtFieldMemoryPop.setText(memPop);
    		}
    		
    		Boolean isClix = (Boolean)map.get(CViewConstants.CLIX);
    		if (isClix != null)
    		{
    			chkboxClix.setSelected(isClix);;
    		}
    		
    		String port = (String)map.get(CViewConstants.PORT);
    		if (port != null)
    		{
    			txtFieldPort.setText(port);
    		}
    		
    		String selectedIndexSelectionString = (String)map.get(CViewConstants.START);
    		
    		if (selectedIndexSelectionString.equalsIgnoreCase(CViewConstants.START_IMMEDIATELY))
    		{
    			cmbStartSelection.getSelectionModel().select(0);
    			
    			paneTimeFrame.setVisible(false);
    		}
    		
    		else if (selectedIndexSelectionString.equalsIgnoreCase(CViewConstants.START_FRAME_TIME)) // time frame chosen
    		{
    			cmbStartSelection.getSelectionModel().select(1);
    			
    			paneTimeFrame.setVisible(true);
    			
    			String timeFrom = (String)map.get(CViewConstants.START_FROM_TIME);
        		if (timeFrom != null)
        		{
        			txtFieldTimeFrameFrom.setText(timeFrom);
        		}
        		
        		String timeTo = (String)map.get(CViewConstants.START_TO_TIME);
        		if (timeTo != null)
        		{
        			txtFieldTimeFrameTo.setText(timeTo);
        		}
    			
    		}
    		
    	}
		
	}





	/////////////////   LOGIC //////////////////////////
    
    public static boolean isLatinLetter(char c) 
    {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
    
    public static boolean isDigit(char c) 
    {
    	return (c >= '0' && c <= '9');
    }
    
    public static int maxLengthInText()
    {
    	return 30;
    }
    
    public static int maxAllowedInstanceInterval()
    {
    	return 1000000;
    }
    
    
    
    
   
    private void updateMemoryPop() 
    {
    	boolean isSelected = chkboxMdssr.isSelected() || chkboxMdisr.isSelected() || chkboxMdsr.isSelected();
    	
		if (!isSelected)
		{
			txtFieldMemoryPop.setText("");
		}
		
	}
    
    private void updatePort() 
    {
    	boolean isSelected = chkboxClix.isSelected();
    	
		if (!isSelected)
		{
			txtFieldPort.setText("");
		}
		
	}
    
    
    private boolean updateLblIfInputNotOK()
    {
		if (txtFieldHostName.getText().isEmpty())
		{
			lblResponseToUser.setText("Host Name Is Mandatory Field");

			return false;
		}
		else if (txtFieldUserName.getText().isEmpty())
		{
			lblResponseToUser.setText("User Name Is Mandatory Field");

			return false;
		}
		else if (txtFieldPassword.getText().isEmpty())
		{
			lblResponseToUser.setText("Password Is Mandatory Field");

			return false;
		}
		else if (txtFieldInstance.getText().isEmpty())
		{
			lblResponseToUser.setText("Instance Is Mandatory Field");

			return false;
		}
		else if (!chkboxMdisr.isSelected() && !chkboxMdsr.isSelected() && !chkboxMdssr.isSelected())
		{
			lblResponseToUser.setText("Choose at least 1 Monitor Process");

			return false;
		}
		else if (!cmbStartSelection.getSelectionModel().isSelected(0) && !cmbStartSelection.getSelectionModel().isSelected(1))
		{
			lblResponseToUser.setText("Start Option Is Mandatory");
			
			return false;
		}
		
		lblResponseToUser.setText("");
		
		return true;
		
	}
    
    
    
    private Map<String, Object> getCurrentSettingsOnView() 
    {
		Map<String, Object> map = new HashMap<String, Object>();
		
		if (!txtFieldConfigurationID.getText().isEmpty())
		{
			map.put(CViewConstants.CONFIGURATION_ID, txtFieldConfigurationID.getText());
		}
		
		if (!txtFieldHostName.getText().isEmpty())
		{
			map.put(CViewConstants.HOSTNAME, txtFieldHostName.getText());
		}
		
		if (!txtFieldUserName.getText().isEmpty())
		{
			map.put(CViewConstants.USERNAME, txtFieldUserName.getText());
		}
		
		if (!txtFieldPassword.getText().isEmpty())
		{
			map.put(CViewConstants.PASSWORD, txtFieldPassword.getText());
		}
		
		if (!txtFieldInstance.getText().isEmpty())
		{
			map.put(CViewConstants.INSTANCE, txtFieldInstance.getText());
		}
		
		if (!txtFieldInstanceTime.getText().isEmpty())
		{
			map.put(CViewConstants.INTERVAL, txtFieldInstanceTime.getText());
		}
		
		map.put(CViewConstants.MDSR, chkboxMdsr.isSelected());
		map.put(CViewConstants.MDISR, chkboxMdisr.isSelected());
		map.put(CViewConstants.MDSSR, chkboxMdssr.isSelected());
		map.put(CViewConstants.CLIX, chkboxClix.isSelected());
		
		
		if (!txtFieldMemoryPop.getText().isEmpty())
		{
			map.put(CViewConstants.MEMORY_POP, txtFieldMemoryPop.getText());
		}
		
		if (!txtFieldMemoryPop.getText().isEmpty())
		{
			map.put(CViewConstants.MEMORY_POP, txtFieldMemoryPop.getText());
		}
		
		if (!txtFieldPort.getText().isEmpty())
		{
			map.put(CViewConstants.PORT, txtFieldPort.getText());
		}
		
		int selectedIndex = cmbStartSelection.getSelectionModel().getSelectedIndex();
		if (selectedIndex != -1)
		{
			map.put(CViewConstants.START, (selectedIndex == 0) ? CViewConstants.START_IMMEDIATELY : CViewConstants.START_FRAME_TIME);
		}
		
		if (!txtFieldTimeFrameFrom.getText().isEmpty())
		{
			map.put(CViewConstants.START_FROM_TIME, txtFieldTimeFrameFrom.getText());
		}
		
		if (!txtFieldTimeFrameTo.getText().isEmpty())
		{
			map.put(CViewConstants.START_TO_TIME, txtFieldTimeFrameTo.getText());
		}
		
		return map;
	}
    
    
}
