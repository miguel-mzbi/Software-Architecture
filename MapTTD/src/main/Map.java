package main;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 *
 * @author jzab
 */
public interface Map<K, V> {

  /**
   * Remove all the elements from the map.
   */
  public void clear();

  /**
   * Checks if a key exists on the map.
   *
   * @param key Key (Null values allowed)
   * @return <b>true</b> if contains the given key, <b>false</b> otherwise.
   */
  public boolean containsKey( K key );

  /**
   * Checks if a value is stored on the Map.
   *
   * @param value Value (Null value allowed)
   * @return <b>true</b> if value is stored on the map, <b>false</b> otherwise.
   */
  public boolean containsValue( V value );

  /**
   * Search for the Value associated with this key.
   * Returns null if no key is in the map
   *
   * @param key Key (Null value allowed)
   * @return value
   */
  public V get( K key );

  /**
   * Return the value if exists or the default.
   * 
   * @param key          Key (Null value allowed)
   * @param defaultValue Value if not exists
   * @return
   */
  public V getOrDefault( K key, V defaultValue );

  /**
   * Return true if Empty.
   * <p>
   * @return
   */
  public boolean isEmpty();

  /**
   * Put value on map.  <br>
   * Null keys are NOT allowed. <br>
   * If you put use an already existing key, it should replace the value.
   * <p>
   * @param key   Key of the entry
   * @param value Value
   * @throws IllegalArgumentException when Key is Null
   */
  public void put( K key, V value );

  /**
   * Remove element.
   *
   * @param key
   * @return the Value associated to the key
   * @throws NoSuchElementException When the key don't exists.
   */
  public V remove( K key );

  /**
   * Replace element.
   *
   * @param key
   * @param value
   * @throws NoSuchElementException If the element to replace don't exist
   * @throws IllegalArgumentException if key is null
   */
  public void replace( K key, V value );

  /**
   * Return the Size.
   * <p>
   * @return
   */
  public int size();

  /**
   * Return all the stored values.
   * <p>
   * @return
   */
  public Collection<V> values();

  /**
   * Return all the stored keys.
   * <p>
   * @return
   */
  public Collection<K> keys();


}
