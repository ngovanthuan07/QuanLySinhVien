# StudentManagement
Những cách sắp sếp trong list

public class MySort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);
        
        // Cach 1:
        list.stream().sorted((o1,o2) -> (int) (o2 - o1)).forEach(System.out::println);
        // Cach 2:
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) o1 - o2;
            }
        };
        Collections.sort(list,comparator.reversed());
        list.forEach(System.out::println);
        
        // Cach 3:
        Comparator<Integer> comparator = ((o1, o2) -> (int) (o1 - o2));
        list.stream().sorted(comparator.reversed()).forEach(System.out::println);
        //or
        Collections.sort(list,comparator);
        list.forEach(System.out::println);

    }
}
