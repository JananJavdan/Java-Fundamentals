package ComparablExample;
//comparabl class zijn interface en implement en Generic moet tussen <> extend gebruiken (als data type)
public class ComparableDuo<T extends Comparable<T>> extends Duo<T> {
    //variabele
    T first;
    T second;
//constructor
    public ComparableDuo(T first, T second) {
        super(first, second);
        this.first = first;
        this.second = second;
    }
    //comparable class gebruiken om objecten te verglijken
    //als comparable implementeerd moet compar To gebruiken maken
    public T getHighest(){
        return getFirst().compareTo(getSecond()) < 0 ? getSecond() : getFirst();}
    public T getLowest(){
        return getFirst().compareTo(getSecond()) < 0 ? getFirst() : getSecond();}//als get second kliener dan 0 is ,krijgen we first als niet, krijgen we second

   // public int getSum(){
     //   return getFirst().intValue() + getSecond().intValue();
    }

//positive integer, if the current object is greater than the specified object.
//negative integer, if the current object is less than the specified object.
//zero, if the current object is equal to the specified object.


