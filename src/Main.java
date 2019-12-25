import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("Красивый", new String[]{"Прекрасный", "Чудесный", "Великоленый", "Симпотичный"});
        dictionary.put("дом", new String[]{"квартира", "хижина", "квартира", "аппартаменты"});
        dictionary.put("человек", new String[]{"мужчина", "личность", "хомосапиенс", "индивидум"});


        HashMap<String, String[]> bigDictionary = new HashMap<>();
//        Set<HashMap.Entry<String, String[]>> value = dictionary.entrySet();
//
//        for (HashMap.Entry<String , String[]>  item : value) {
//
//            for (String y:item.getValue()) {
//                System.out.println(y);
//            }
//
//        }
        Set<String> keys = dictionary.keySet();
        Iterator iter = keys.iterator();

        while (iter.hasNext()) {
            String key = iter.next().toString();
            String[] value = dictionary.get(key);
            bigDictionary.put(key, value);
            for (int i = 0; i < value.length; i++) {
                String newKey = value[i];
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.addAll(Arrays.asList(value));
                arrayList.remove(newKey);
                arrayList.add(key);
                String[] newValue = new String[arrayList.size()];
                newValue = arrayList.toArray(newValue);
                bigDictionary.put(newKey, newValue);
               /* System.out.println("Введите любое слово из словаря ");
                Scanner s = new Scanner(System.in);
                String world = s.nextLine();
                String[] words = bigDictionary.get(world);
                System.out.println(words);*/


            }

        }System.out.println("Введите фразу? ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] words = bigDictionary.get(word);
        Random r = new Random();
        System.out.println(words[r.nextInt(words.length)]);
        }



}
