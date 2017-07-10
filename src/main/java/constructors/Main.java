package constructors.trecia_paskaita;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Main {
    public static void main(String[] args) {
        TreciaPaskaita treciaPaskaita = new TreciaPaskaita();
        List<Item> list = treciaPaskaita.createList();
        Item item = new Item();
        item.setId(1);
        item.setName("test");

        treciaPaskaita.addItem(item, list);


    }


}
