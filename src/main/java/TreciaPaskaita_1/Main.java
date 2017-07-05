package TreciaPaskaita_1;

import trecia_paskaita.Item;
import trecia_paskaita.TreciaPaskaita;

import java.util.List;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class Main {
    public static void main(String[] args) {
        TreciaPaskaita treciaPaskaita = new TreciaPaskaita();
        List<Item> list = treciaPaskaita.getList();
        list.add(new Item());
        treciaPaskaita.deleteList(list);
    }
}
