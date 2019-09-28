package com.mhisoft.matthew.learningjava.exceptionRestrictions;

class BaseballException extends Exception{}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    Inning() throws BaseballException {
    }

    void event() throws BaseballException {

    }

    abstract void atBat() throws Strike, Foul;

    void walk() {
    }

}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}


public class StormyInning extends Inning implements Storm {
    StormyInning() throws RainedOut,
            BaseballException {
    }

    StormyInning(String s) throws Foul,
            BaseballException {
    }

    public void rainHard() throws RainedOut {
    }

    public void event() {
    }

    void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
        } catch (RainedOut e) {
        } catch(BaseballException e){
        }
        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
        } catch (Foul e) {
        } catch (RainedOut e) {
        } catch (BaseballException e) {
        }
    }
}

