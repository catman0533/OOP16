


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


import com.example.myproject.view.View;
import com.example.myproject.presenter.Presenter;
import com.example.myproject.model.FamilyTree;
import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View());
        presenter.addPerson("John", 30);
        presenter.addPerson("Amy", 25);
        presenter.addPerson("David", 20);
        presenter.addPerson("Emily", 35);

        presenter.displaySortedByName();

        presenter.displaySortedByAge();
    }
}
