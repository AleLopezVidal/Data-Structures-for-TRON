package dataStructure;
//Lista Generica
public class List <T>{
	public Node<T> _head, _tail;
	private int _i;
	//Constructor de la Lista
	public List(){
		_head = _tail = null;
		_i = 0;
	}
	
	public Node<T> getHead(){
		return _head;
	}
	//Metodo que recibe un dato y lo agrega alfinal de la lista
	public void addLast(T dato){
		//Se crea  el  nuevo nodo con el dato insertado y su respectivo indice
		Node<T> newNode = new Node<T>(dato,_i);
		//Se le suma uno al contador de indices
		_i++;
		//Comprueba que la lista no este vacia
		if (_head != null){
			//Se le asigna un temporal al  tail para no perder la referencia
			Node<T> temp = _tail;
			//Se le asigna al temporal que va a apuntar a la derecha al nuevo nodo
			temp.setNext(newNode);
			//Al nuevo nodo se le dice que va a apuntar a su izquierda al temporal
			newNode.setPrev(temp);
			//El nuevo tail va a ser el nuevo nodo
			_tail = newNode;
		}
		//Si esta vacia:
		else{
			//Se le asigna al nuevo nodo el head  y el tail
			_head = _tail = newNode;
		}
	}
	
	//Metodo que recibe un dato y se agrega al principio de la lista
	public void addFirst(T dato){
		//Se crea el nuevo nodo con el  dato insertado y su respectivo indice
		Node<T> newNode = new Node<T>(dato,_i);
		//Se le suma uno al contador de indices
		_i++;
		//Comprueba que la lista no este vacia
		if (_head!=null){
			//Se leasigna un temporal alhead para no perder la referencia
			Node<T> temp = _head;
			//Al nuevo nodo se le asigna que va a apuntar a la derecha al temporal
			newNode.setNext(temp);
			//Al temporal se le asigna que va a apuntar ala  izquierda al nuevo nodo
			temp.setPrev(newNode);
			//El nuevo head va a ser el nuevo nodo
			_head = newNode;
		}
		//Si esta vacia:
		else{
			//El nuevo nodo va a ser igual al head y al tail
			_head = _tail = newNode;
		}
	}

	//Metodo que imprime los datos de una lista de izquierda a derecha
	public void printRight(){
		if (_head!=null){
			Node<T> temp = _head;
			while (temp!=null){
				System.out.println(temp.getDato());
				temp = temp.getNext();
			}
		}
		else{
			System.out.println("No hay elementos en la lista");
		}
	}
	
	//Metodo que imprime los datos de una lista de derecha a  izquierda
	public void printLeft(){
		if (_tail!=null){
			Node<T> temp = _tail;
			while (temp!=null){
				System.out.println(temp.getDato());
				temp = temp.getPrev();
			}
		}
		else{
			System.out.println("No hay elementos en la lista");
		}
	}
	
	//Metodo que recibe un sub-indice a buscar y retorna lo que hay en ese sub-indice
	public T getDataIndex(int j){
		if (_head!=null){
			Node<T> temp = _head;
			while (temp.getIndex()!=j){
				temp = temp.getNext();
			}
			return temp.getDato();
		}
		else{
			return null;
		}
	}
	
	//Metodo que recibe dos sub-indices y retorna eldato que hay en esos sub-indices
	public T getDataIndex(int i,int j){
		if (_head!= null){
			Node<T> temp = _head;
			while (temp.getIndex()!=i){
				temp.getNext();
			}
			//Se hace un casteo para accesar a los dator de la lista
			//Se llama  a la funcion getDataIndex(int j) para reducir la complejidad del problema
			return ((List<T>)temp.getDato()).getDataIndex(j);
		}
		else{
			return null;
		}
	}
}
