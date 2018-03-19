package working;

import testinterface.ComparableContract;
import testinterface.EqualsContract;

public class StringTests implements ComparableContract<String>, EqualsContract<String> {

    @Override
    public String createValue() {
        return "value";
    }

    @Override
    public String createNotEqualValue() {
        return "notEqualValue";
    }

    @Override
    public String createSmallerValue() {
        return "a";  //a < v[alue]
    }
}
