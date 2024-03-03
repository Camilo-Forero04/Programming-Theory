
package arraylist.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {


    public static void main(String[] args) {
        //Instanciando las listas (LinkedList & Arraylist)
        LinkedList<Persona> linkedList = new LinkedList<>();
        List<Persona> arrayList = new ArrayList<>();
        
        //Creacion de personas
        Persona persona1 = new Persona("Juana", 15, "Francia");
        Persona persona2 = new Persona("Juan", 18, "Colombia");
        Persona persona3 = new Persona("Camilo", 19, "Colombia");
        Persona persona4 = new Persona("Leila", 20, "Francia");
        
        //Añadir personas ArrayList
        arrayList.add(persona1);
        arrayList.add(persona2);
        arrayList.add(persona3);
        arrayList.add(persona4);
        
        //Añadir personas linkedList
        linkedList.add(persona1);
        linkedList.add(persona2);
        linkedList.add(persona3);
        linkedList.add(persona4);
        
        //Hay dos formas de eliminar elementos de una LinkedList y un ArraList.
        //Sabiendo la posicion a eliminar o pasando el elemento exacto a eliminar
        //Caso 1:
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(persona1)) {
                arrayList.remove(i);//Aqui juana es eliminada del ArrayList
            }
        }
        
        //Caso 2:
        for (Persona persona : arrayList) {
            if (persona.equals(persona2)) {
                arrayList.remove(persona2);//Aqui Juan es eliminado del ArrayList
                break;//necesario para no obtener un ConcurrentModificationException
            }
        }
        
        System.out.println("-----ArrayList-----");
        //Aqui se imprime el arrayList
        arrayList.forEach(p -> System.out.println(p));
        
        //Caso 1: Eliminacion por posicion:
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).equals(persona1)) {
                linkedList.remove(i);//Aqui juana es eliminada de la LinkedList
            }
        }
        
        //Caso 2: Eliminacion por 
        for (Persona p : linkedList) {
            if (p.equals(persona2)) {
                linkedList.remove(p);//Aqui Juan es eliminado de la LinkedList
                break;//necesario para no obtener un ConcurrentModificationException
            }
        }
        
        System.out.println("-----LinkedList-----");
        //Aqui se imprime la linkedList
        linkedList.forEach(System.out::println);
        //MetodosExtras:
        //Numero 1:
        //Lista.Size() para obtener la cantidad de elementos de tanto linkedList como arrayList
        //Numero 2:
        //Lista.isEmpty() para obtener un boleano true si la lista esta vacio o false si contiene elementos
        //Numero 3:
        //Lista.clear() para eleminar todos los elementos de la lista
        //Numero 4:
        //LinkedList.getFirst() para traer el primer elemento de la lista
        //LinkedList.getLast() para traer el ultimo elemento de la lista
    }
    
}
