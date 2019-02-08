package tech.tablesaw.api;

import org.junit.Test;
import tech.tablesaw.selection.Selection;

public class TableDateTest {

    private String[] columns = {"userid", "username", "sex", "roomNo", ""};

    @Test
    public void columnfunc() {
        DoubleColumn doubleColumn = DoubleColumn.create("worker");
        for (int i = 0; i < 100; i++) {
            doubleColumn.append(i);
        }

        Selection sel=doubleColumn.isEqualTo(3);


    }
}
