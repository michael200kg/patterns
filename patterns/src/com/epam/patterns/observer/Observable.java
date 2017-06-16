package com.epam.patterns.observer;

import java.util.ArrayList;
import java.util.List;

interface Observable {
   List<AbstractObserver> observers = new ArrayList<>();
   void notifyObservers();
   void addObserver(AbstractObserver observer);
   void removeObserver(AbstractObserver observer);
}
