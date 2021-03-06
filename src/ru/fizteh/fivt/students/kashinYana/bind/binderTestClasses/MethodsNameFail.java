package ru.fizteh.fivt.students.kashinYana.bind.binderTestClasses;

import ru.fizteh.fivt.bind.AsXmlElement;
import ru.fizteh.fivt.bind.BindingType;
import ru.fizteh.fivt.bind.MembersToBind;


/**
 * Kashinskaya Yana, 195
 */

@BindingType(value = MembersToBind.GETTERS_AND_SETTERS)
public class MethodsNameFail {
    String name;

    @AsXmlElement(name = "wtf1")
    public void setName(String newName) {
        name = newName;
    }

    @AsXmlElement(name = "wtf2")
    public String getName() {
        return name;
    }
}
