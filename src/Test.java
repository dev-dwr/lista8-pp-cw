public class Test {
    int zawartość = 0;

    static void argNiemodyfikowalny(final Test zmienna) {
        zmienna.zawartość = 1;
//        zmienna = null; // zmianna jest final i chcemy jej przypisac wartosc  trzeba usuanc ta linijke aby sie skompilowalo
    }

    static void argModyfikowalny(Test zmienna) {
        zmienna.zawartość = 1;
        zmienna = null;
    }

    public static void main(String[] args) {
        Test modyfikowalna = new Test();
        final Test niemodyfikowalna = new Test();
//        ponieważ odwołanie się do pola obiektu wskazywanego
//        przez referencję spowoduje faktyczną zmianę zawartości tego pola, czego efekt będzie widoczny
//        poza metodą zmieniającą to pole.


//        Natomiast przypisanie do zmiennej „Test zmienna” referencji
//        pustej czyli null niczego nie zmienia, ponieważ parametry metod są przekazywane przez wartość czyli
//        są traktowane jak zmienne lokalne zadeklarowane w tej metodzie, tzn. wartości zmiennych użytych
//        jako parametry są kopiowane do zmiennych lokalnych metody.

        //a
        argNiemodyfikowalny(modyfikowalna);
        System.out.println(modyfikowalna.zawartość); // wyprintuje 1
        //b
        argNiemodyfikowalny(niemodyfikowalna);
        System.out.println(niemodyfikowalna.zawartość); // wyprintuje 1

        //c
        argModyfikowalny(modyfikowalna);
        System.out.println(modyfikowalna.zawartość); //wyprintuje  1
        //d
        argModyfikowalny(niemodyfikowalna);
        System.out.println(niemodyfikowalna.zawartość); // wyprintuje 1


    }
}