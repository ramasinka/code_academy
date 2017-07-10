package constructors.trecia_paskaita;

import TreciaPaskaita_1.TreciaPaskaita1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class TreciaPaskaita extends TreciaPaskaita1 {

    private List<Item> list;

    public List<Item> createList() {
        List newList = new ArrayList();
        return newList;
    }

    public void addItem(Item item, List<Item> list) {
        this.list.add(item);
    }

    public List<Item> getList() {
        return list;
    }

    void printList(List<Item> list) {
        System.out.println("List:" + list);
    }
}
