package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

//Miguel Angel Montoya
public class MiguelMontoyaMapTDD<K, V> implements Map<K, V> {
	
	private class Node {
		Node next;
		K key;
		V value;
		Node(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	private ArrayList<Node> buckets;
	private int bucketsQty;
	private int size;
	
	public MiguelMontoyaMapTDD() {
		this.bucketsQty = 10;
		this.size = 0;
		this.buckets = new ArrayList<>();
		
		for(int i = 0; i < this.bucketsQty; i++) {
			this.buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode(); 
        int index = hashCode % this.bucketsQty; 
        return index; 
	}

	@Override
	public void clear() {
		this.buckets.clear();
		this.size = 0;
		for(int i = 0; i < this.bucketsQty; i++) {
			this.buckets.add(null);
		}		
	}

	@Override
	public boolean containsKey(K key) {
		if(key == null) return false;
		int index = this.getBucketIndex(key);
		Node current = this.buckets.get(index);
		while(current != null) {
			if(current.key == key) return true;
			current = current.next;
		}
		return false;
	}

	@Override
	public boolean containsValue(V value) {
		if(value == null) return false;
		for(Node i: this.buckets) {
			while(i != null) {
				if(i.value == value) return true;
				i = i.next;
			}
		}
		return false;
	}

	@Override
	public V get(K key) {
		if(key == null) return null;
		int index = this.getBucketIndex(key);
		Node current = this.buckets.get(index);
		while(current != null) {
			if(current.key == key) {
				return current.value;
			}
			current = current.next;
		}
		return null;
	}

	@Override
	public V getOrDefault(K key, V defaultValue) {
		if(key == null) return defaultValue;
		int index = this.getBucketIndex(key);
		Node current = this.buckets.get(index);
		while(current != null) {
			if(current.key == key) {
				return current.value;
			}
			current = current.next;
		}
		return defaultValue;
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public void put(K key, V value) {
		if(key == null) {
			throw new IllegalArgumentException("Key can't be null.");
		}
		// Replace value is already exists
		int index = this.getBucketIndex(key);
		Node current = this.buckets.get(index);
		while(current != null) {
			if(current.key == key) {
				current.value = value;
				return;
			}
			current = current.next;
		}
		// Increment size
		this.size++;
		// Create new node and make it the head of the bucket
		Node newNode = new Node(key, value);
		newNode.next = this.buckets.get(index);
		this.buckets.set(index, newNode);
		
	}

	@Override
	public V remove(K key) {
		if(key == null) {
			throw new NoSuchElementException("Key doesn't exists.");
		}	
		int index = this.getBucketIndex(key);
		Node prev = null;
		Node current = this.buckets.get(index);
		while(current != null) {
			if(current.key == key) {
				V toReturn = current.value;
				if(prev == null) this.buckets.set(index, current);
				else prev.next = current.next;
				return toReturn;
			}
			prev = current;
			current = current.next;
		}
		throw new NoSuchElementException("Key doesn't exists.");
	}

	@Override
	public void replace(K key, V value) {
		if(key == null) {
			throw new IllegalArgumentException("Key can't be null.");
		}	
		int index = this.getBucketIndex(key);
		Node current = this.buckets.get(index);
		while(current != null) {
			if(current.key == key) {
				current.value = value;
				return;
			}
			current = current.next;
		}
		throw new NoSuchElementException("Key doesn't exists.");
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public Collection<V> values() {
		List<V> values = new ArrayList<>();
		for(Node i: this.buckets) {
			while(i != null) {
				values.add(i.value);
				i = i.next;
			}
		}
		return values;
	}

	@Override
	public Collection<K> keys() {
		List<K> keys = new ArrayList<>();
		for(Node i: this.buckets) {
			while(i != null) {
				keys.add(i.key);
				i = i.next;
			}
		}
		return keys;
	}

}
