package Main;

import java.util.LinkedList;

public class Queue<T> {
	// Queue es FIFO

	// constante maxSize() representa el tamaño maximo que puede tener la cola
	public static final int maxSize = 6;
	private LinkedList<T> list;

	public Queue() {
		list = new LinkedList<>();
	}

	// isEmpty() boolean
	public boolean isEmpty() {
		if (list.size() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	// peek() recupera pero no elimina, si esta vacio retorn null
	public T peek() {
		if (!isEmpty()) {
			return list.get(list.size() - 1);
		} else {
			return null;
		}
	}

	// boolean add() inserta el elemento, retorna true si se ha insettado y si no
	// hay espacio suficiente lanza una expepcion
	public boolean add(T elem) {
		if (list.size() < maxSize) {
			list.push(elem);
			return true;
		} else {
			throw new RuntimeException("An exepssion happens into Queue class, add() method");
		}
	}

	// remove() recupera y elimina la cambeza de la queue return T si esta vacio
	// return null
	public T remove() {
		if (!isEmpty()) {
			T backup = list.get(0);
			list.remove(0);
			
			return backup;
		}else {
			return null;
		}
	}

}
