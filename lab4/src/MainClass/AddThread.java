package MainClass;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Class "AddThread"
 * My class which extends Thread class. This class is a thread
 * @author Archeex
 *
 */
public class AddThread extends Thread{
	private int number1 = 0;
	private int number2 = 0;
	private CopyOnWriteArrayList<Integer> v1 = new CopyOnWriteArrayList<>();
	private CopyOnWriteArrayList<Integer> v2 = new CopyOnWriteArrayList<>();
	boolean flagNumber = false;
	
	/**
	 * Constructor for numbers
	 * @param num1 number 1
	 * @param num2 number 2
	 */
	AddThread(int num1, int num2){
		flagNumber = true;
		this.number1 = num1;
		this.number2 = num2;
	}
	
	/**
	 * Constructor for vectors
	 * @param vect1 vector 1
	 * @param vect2 vector 2
	 */
	AddThread(CopyOnWriteArrayList<Integer> vect1, CopyOnWriteArrayList<Integer> vect2){
		this.v1 = vect1;
		this.v2 = vect2;
		flagNumber = false;
	}
	
	/**
	 * Function which add numbers or vectors in threads
	 */
	public void Add() {
		if(flagNumber)
			Adder.addNumberResult = this.number1 + this.number2;
		else {
			Adder.vectResult.clear();
			int i = 0;
			int size = v1.size();
			while(size != 0) {
				Adder.vectResult.add(v1.get(i) + v2.get(i++));
				size--;
			}
		}
			
	}
	
	/**
	 * Run-function
	 */
	public void run() {
		Add();
	}
}
