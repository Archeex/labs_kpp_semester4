package MainClass;

import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Class "Adder"
 * This class is control GUI and create threads for addition
 * @author Archeex
 *
 */
public class Adder {
	
	public static int addNumberResult;
	private static int num1 = 0;
	private static int num2 = 0;
	static CopyOnWriteArrayList<Integer> vector1 = new CopyOnWriteArrayList<Integer>();
	static CopyOnWriteArrayList<Integer> vector2 = new CopyOnWriteArrayList<Integer>();
	static CopyOnWriteArrayList<Integer> vectResult = new CopyOnWriteArrayList<Integer>();
	
	
	/**
	 * Launch the application.
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(470, 200);
		shell.setText("SWT Java Lab4");
		
		Composite field1 = new Composite(shell, SWT.NONE);
		field1.setLayout(new RowLayout(SWT.HORIZONTAL));
		Label text1 = new Label(field1, SWT.NONE);
		text1.setText("Add to vector #1: ");
		Text inputVector1 = new Text(field1, SWT.CENTER | SWT.BORDER);
		Button buttVector1 = new Button(field1, SWT.NONE);
		buttVector1.setText("Add");
		
	    Label text2 = new Label(field1, SWT.NONE);
		text2.setText("Add to vector #2: ");
		Text inputVector2 = new Text(field1, SWT.CENTER | SWT.BORDER);
		Button buttVector2 = new Button(field1, SWT.NONE);
		buttVector2.setText("Add");
		
	
		Composite field2 = new Composite(shell, SWT.NONE);
		field2.setLayout(new RowLayout(SWT.HORIZONTAL));
		Label int1 = new Label(field2, SWT.NONE);
		int1.setText("Input integer #1: ");
		Text inputInt1 = new Text(field2, SWT.CENTER | SWT.BORDER);
		Button buttInt1 = new Button(field2, SWT.NONE);
		buttInt1.setText("Enter");
		
	    Label int2 = new Label(field2, SWT.NONE);
	    int2.setText("Input integer #2: ");
		Text inputInt2 = new Text(field2, SWT.CENTER | SWT.BORDER);
		Button buttInt2 = new Button(field2, SWT.NONE);
		buttInt2.setText("Enter");
		
		Composite fieldEqual = new Composite(shell, SWT.NONE);
		fieldEqual.setLayout(new RowLayout(SWT.HORIZONTAL));
		Button buttEqual = new Button(fieldEqual, SWT.NONE);
		buttEqual.setText("Equal");
		
		Composite field3 = new Composite(shell, SWT.NONE);
		field3.setLayout(new RowLayout(SWT.HORIZONTAL));
		Label answerVector = new Label(field3, SWT.NONE);
		answerVector.setText("Answer vector: ");
		
		Composite field4 = new Composite(shell, SWT.NONE);
		field4.setLayout(new RowLayout(SWT.HORIZONTAL));
		Label answerNumber = new Label(field4, SWT.NONE);
		answerNumber.setText("Answer number: ");
		
		RowLayout layoutMain = new RowLayout(SWT.VERTICAL | SWT.CENTER);
		shell.setLayout(layoutMain);
		
		
		buttVector1.addSelectionListener(new SelectionAdapter() {
			
			@Override
			   public void widgetSelected(SelectionEvent e) {
			      try {
			    	  Integer.parseInt(inputVector1.getText());
			      }
			      catch(NumberFormatException exc) {
			    	  inputVector1.setText("");
			    	  return;
			      }
			      vector1.add(Integer.valueOf(inputVector1.getText()));
			      inputVector1.setText("");
			   }
		});
		
		buttVector2.addSelectionListener(new SelectionAdapter() {
			
			@Override
			   public void widgetSelected(SelectionEvent e) {
			      try {
			    	  Integer.parseInt(inputVector2.getText());
			      }
			      catch(NumberFormatException exc) {
			    	  inputVector2.setText("");
			    	  return;
			      }
			      vector2.add(Integer.valueOf(inputVector2.getText()));
			      inputVector2.setText("");
			   }
		});
		
		buttInt1.addSelectionListener(new SelectionAdapter() {
			
			@Override
			   public void widgetSelected(SelectionEvent e) {
			      try {
			    	  Integer.parseInt(inputInt1.getText());
			      }
			      catch(NumberFormatException exc) {
			    	  inputInt1.setText("");
			    	  return;
			      }
			      num1 = Integer.valueOf(inputInt1.getText());
			      inputInt1.setText("");
			   }
		});
		
		buttInt2.addSelectionListener(new SelectionAdapter() {
			
			@Override
			   public void widgetSelected(SelectionEvent e) {
			      try {
			    	  Integer.parseInt(inputInt2.getText());
			      }
			      catch(NumberFormatException exc) {
			    	  inputInt2.setText("");
			    	  return;
			      }
			      num2 = Integer.valueOf(inputInt2.getText());
			      inputInt2.setText("");
			   }
		});
		
		buttEqual.addSelectionListener(new SelectionAdapter() {
			
			@Override
			   public void widgetSelected(SelectionEvent e) {
				  if(num1 != 0 && num2 != 0 && !vector1.isEmpty() && !vector2.isEmpty() && vector1.size() == vector2.size()) {
					  AddThread thread1 = new AddThread(num1, num2);
					  thread1.start();
					  AddThread thread2 = new AddThread(vector1, vector2);
					  thread2.start();
					  answerNumber.setText("Answer number: " + addNumberResult);
					  String vectResultString = new String("Answer vector:");
					  for(Integer num : vectResult) {
						  vectResultString += " " + num;
					  }
					  
					  System.out.println(vectResultString);
					  answerVector.setText(vectResultString);
//					  MyThread threadVector = new MyThread(num1, num2);
//					  threadVector.start();
//					 // String resultVector = "Answer vector: " +;
//					  answerNumber.setText(resultVector);
				  }
			   }
		});
		 

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}	
}
