package dataStructure;

public class Node<T> {

	private Node<T> _next,_prev;
	private int _index;
	private T _dato;
	
	//Constructor
	public Node(T dato, int index){
		_dato = dato;
		_index = index;
	}
	
	public Node<T> getNext() {
		return _next;
	}
	public void setNext(Node<T> next) {
		_next = next;
	}
	public Node<T> getPrev() {
		return _prev;
	}
	public void setPrev(Node<T> prev) {
		_prev = prev;
	}
	public int getIndex() {
		return _index;
	}
	public void setIndex(int index) {
		_index = index;
	}
	public T getDato() {
		return _dato;
	}
	public void setDato(T dato) {
		_dato = dato;
	}
	
}
