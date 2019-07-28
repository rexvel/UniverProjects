package Practise_week4;



public class Chapter {


    public static void main(String[] args) {


        String string = "Інкапсуляція — один з java трьох java основних механізмів ja об'єктно-орієнтованого java jaja програмування. Йдеться про те,44 що об’єкт вміщує не тільки дані, але і правила java х обробки, оформлені в вигляді виконуваних фрагментів.";




        Analyze(string);
    }

    public static void Analyze(String string) {
        System.out.println("Виведення першого речення у форматі: парні слова – всі літери великі, непарні слова всі літери маленькі.\n");
        EvenUneven(string);
        System.out.println("Розмір введеного тексту: " + string.length() + "\n");
        System.out.println("__________________________");

        SentDivide(string);
        System.out.println("__________________________");
        WordDivide(string);
        System.out.println("__________________________");
        MentionedTimes(string);
        System.out.println("__________________________");
        SpaceCount1(string);
        System.out.println("__________________________");
        WordCount(string);
        System.out.println("__________________________");
        SenCount(string);
        System.out.println("__________________________");
        SumSym(string);
        System.out.println("__________________________");
        Numbers(string);
        System.out.println("__________________________");
        System.out.println("Перше речення у зворотному порядку (по символам), у зворотному порядку по словам \n");
        reverseStringWithCharAt(string);
        System.out.println("__________________________");

        System.out.println("__________________________");
        System.out.println("Заміна в тексті  всіх слів “java” на “j*a*v*a”");
        System.out.println(string.replace("java", "j*a*v*a"));
        System.out.println("__________________________");
        subs(string);
        System.out.println("__________________________");





    }



    public static void SpaceCount1(String string) {

        int count = 0;

        if (string.length() != 0) {
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;

                }
            }
        }
        System.out.println("Кількість пробілів: " + count + "\n");
    }

    public static void MentionedTimes(String string) {
        String word = "java";
        int pos = 0, count2 = 0;
        while (pos >= 0) {
            pos = string.indexOf(word, pos);
            if (pos >= 0) {
                count2++;
                pos += word.length();
            }
        }
        System.out.println("\n");

        System.out.println("Кількість разів,де в рядку зустрічається слово " + word + ": " + count2 + "\n");
    }

    public static void SenCount(String string) {
        int count1 = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.') {
                count1++;

            }
            if (string.charAt(i) != '.') {
                count1 = 1;
            }
        }
        System.out.println("Кількість речень:" + count1 + "\n");
        if (count1 == 1) {
            reverseStringWithCharAt(string);
            int stringLength = string.length();
            String result = "";


            for (int i = 0; i < stringLength; i++) {
                result = string.charAt(i) + result;
                System.out.println(result);
            }
        }
    }

    public static void Numbers(String string) {

        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                sum += string.charAt(i) - '0';
            }
        }
        System.out.println("Сума всіх чисел " + sum + '\n');
    }


    public static void SumSym(String string) {

        int koma = 0;
        int dot = 0;
        int dash = 0;
        int slash = 0;

        System.out.print("Індекси крапок: ");
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.') {
                System.out.print(i + " ");
                dot++;
            }
        }

        System.out.println("\n");
        System.out.print("Індекси ком: ");

        System.out.println("\n");
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == ':') {
                System.out.print(i + ":");
                koma++;
            }
        }
        //slash
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '/') {
                slash++;
            }
        }
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '—') {
                dash++;
            }
        }
        int Allsymbols = dot + koma + dash + slash;
        System.out.println("Сума всіх символів: " + Allsymbols + "\n");
    }

    public static void WordCount(String string) {
        int spaceCount = 0;
        for (char c : string.toCharArray()) {
            if (c == ' ' || c == '.') {
                spaceCount++;
            }
        }
        System.out.println("Кількість слів: " + spaceCount + "\n");
    }

    public static void WordDivide(String string) {
        String[] stringer = string.split(" ");
        for (int i = 0; i <= stringer.length - 1; i++) {
            System.out.println(stringer[i]);
        }
    }

    public static void SentDivide(String string) {
        String[] stronger = string.split("\\.\\s");
        for (int j = 0; j <= stronger.length - 1; j++) {
            System.out.println(stronger[j]);
        }
    }

    public static String reverseStringWithCharAt(String string) {
        int stringLength = string.length();
        String result = "";

        for (int i = 0; i < stringLength; i++) {
            if (string.charAt(i) == '.') {
                break;
            }
            result = string.charAt(i) + result;

        }
        System.out.println(result);
        return result;

    }

    public static void EvenUneven(String string) {


        String firstSent = string.substring(0, string.indexOf('.'));


        String[] sentence = firstSent.split("\\s");

        for (int i = 0; i < sentence.length; i++) {

            if (sentence[i].length()% 2 == 0) {
                System.out.print(sentence[i].toUpperCase()+" ");
            }

            if (sentence[i].length()% 2 != 0) {
                System.out.println(sentence[i].toLowerCase()+" ");


            }


        }


    }

    public static void subs(String string ){




        String stringer [] = string.split("\\s");
        // Analyze(string);
        int count1 = 0;
        int count2 =0;


        for(int i=0;i<stringer.length;i++){

            if (stringer[i].startsWith("ja")) {
                count1++;


            }
        }


        for(int i=0;i<stringer.length;i++){

            if (stringer[i].endsWith("va")) {
                count2++;


            }
        }

        System.out.println("слова (та їх кількість) що починаються з підстроки   Ja: "+count1);
        System.out.println("слова (та їх кількість) що завершуються підстрокою   va: "+count2);

    }
}



