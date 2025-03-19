//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] array={'H', 'a', 'l', 'l', 'o', ' ', 'W', 'e', 'l', 't', '!'};
        char[] array1={'H', 'a', 'l', 'l', 'o', ' ', 'W', 'e', 'l', 't', '!'};
        char[] array2={'H', 'a', 'l', 'l', 'o', ' ', 'W', 'e', 'l', 't', '!'};
        char[] test={'H', 'a', 'l', 'l', 'o'};
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.println("Instanziieren...");
        CharArray charArray=new CharArray(array);
        CharArray charArray1=new CharArray(array1);
        CharArray charArray2=new CharArray(array2); //wegen gleichen Referenzen musste ich alle gleichen arrays mit unterschiedlichen Namen einspeichern
        System.out.println("Ausführen...");
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Standard Ausgabe: ");
        charArray.ausgeben();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Mit Zeichen l entfernt: ");
        charArray.entferneZeichen('l');
        charArray.ausgeben();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Umgekehrt: ");
        charArray1.reverseZeile();
        charArray1.ausgeben();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Ist gleich (true erwartet): ");
        System.out.print(charArray2.istIdentMit(array2));
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Ist Teil davon (ja): ");
        System.out.print(charArray2.istTeilVon(test));
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Erster Index ['l'] (3 erwartet): ");
        charArray2.ersterIndexVon('l');
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Erster Index ['l', ab Position 4]: ");
        charArray2.ersterIndexVon('l', 4);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Letzter Index ['l']: ");
        System.out.print(charArray2.letzterIndexVon('l'));
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.print(" Sortierter Array: ");
        charArray2.sort();
        charArray2.ausgeben();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");
        System.out.println("Extras: \n");
        System.out.println(charArray.getSatz());
        System.out.println(charArray.getAnz());
        System.out.println(charArray2.ersterIndexVon('l'));
        System.out.println(charArray2.ersterIndexVon('l', 4));
        System.out.println("\n--------------------------------------------------------------------------------------------------------------");


    }
}