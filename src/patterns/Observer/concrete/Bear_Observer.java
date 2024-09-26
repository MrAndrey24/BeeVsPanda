package patterns.Observer.concrete;

import patterns.Observer.interfaces.Observer;

public class Bear_Observer implements Observer {
    @Override
    public boolean verifyQuantity(int value) {
        if(value>=150)//Check the number of bears eliminated
            return true;
        return false;
    }
}
