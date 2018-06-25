package queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class QueueImplement {
	
	
	private static Deque<String> _prior1 = new ArrayDeque<String>();
	private static Deque<String> _prior2 = new ArrayDeque<String>();
	private static Deque<String> _prior3 = new ArrayDeque<String>();
	
	
	public static Deque<String> get_prior1() {
		return _prior1;
	}
	public static Deque<String> get_prior2() {
		return _prior2;
	}
	public static Deque<String> get_prior3() {
		return _prior3;
	}
	
	
	public static boolean insertIntoPrior1(String _task){
		if(_prior1.add(_task))
			return true;
		else
			return false;
	}
	
	public static boolean insertIntoPrior2(String _task){
		if(_prior2.add(_task))
			return true;
		else
			return false;
	}
	
	
	public static boolean insertIntoPrior3(String _task){
		if(_prior3.add(_task))
			return true;
		else
			return false;
	}
	
	

}
