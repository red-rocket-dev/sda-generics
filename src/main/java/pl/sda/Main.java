package pl.sda;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TODO: generyki w klasach
        //TODO: generyki w metodach ...
        //TODO: generyki, a instancjonowanie nowego typu generycznego
        //TODO: kiedy używać
        //TODO: co jeśli nie podam generyku przy np. List
        //TODO: z gwiazdką słówko extends i implements przy generykach
        //TODO: zadanie z listą
        //TODO: inny przykład z refleksją i zapisem dowolnego obiektu do pliku

        NodeString ala = new NodeString();
        ala.setValue("ala");
        NodeString ma = new NodeString();
        ma.setValue("ma");
        NodeString kota = new NodeString();
        kota.setValue("kota");

        ala.setNext(ma);
        ma.setNext(kota);

        System.out.println(ala);
        System.out.println(ala.getNext());
        System.out.println(ala.getNext().getNext());

        System.out.println("Inty");
        NodeInteger one = new NodeInteger();
        one.setValue(1);
        NodeInteger two = new NodeInteger();
        two.setValue(2);
        NodeInteger three = new NodeInteger();
        three.setValue(3);

        one.setNext(two);
        two.setNext(three);

        System.out.println(one);
        System.out.println(one.getNext());
        System.out.println(one.getNext().getNext());
        Node<Abc> costam = new Node<>();
        System.out.println("Z generykami");
        Node<Car> porsche = new Node<>();
        porsche.setValue(new Car("Porsche 911"));
        Node<Car> ford = new Node<>();
        ford.setValue(new Car("Ford GT"));

        porsche.setNext(ford);

        Node<Car> next = porsche.getNext();
        Car value = next.getValue();
        //TODO: przyklad w listach

        System.out.println(porsche);
        System.out.println(porsche.getNext());

        System.out.println("Listy bez uzycia generykow");


        //tak nie robimy:
        List someList = new LinkedList();
        someList.add(new Car(""));
        someList.add("string");
        someList.add(123);

        //

        List<String> aa = new LinkedList<>();

        costam("aaa");

    }

    public static <E extends CharSequence> E costam(E costam) {
        System.out.println(costam.subSequence(0, 2));
        return costam;
    }
}
