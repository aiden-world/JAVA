package code_day28;

import java.util.*;

import org.junit.Test;

@SuppressWarnings("all")
public class TestIterator{
    
	@Test
    public void Test1(){
        List collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
     //   Collections.sort(list);
        for(int i=0;i<collection.size();i++){
            Object o = collection.get(i);
            if(o.equals(2)){
                collection.remove(i);
            }



        }
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();

            System.out.println(next);
        }

    }

   @Test
    public void Test2(){
       Set set = new HashSet();
       set.add("ff");
       set.add("ee");
       set.add(new String("ee"));

       System.out.println("元素的个数是："+set.size());
       for (Object object:set
            ) {
           System.out.println(object);

       }

   }

    @Test
    public void Test3(){
        Set set = new HashSet();
        set.add("ff");
        set.add(new Student("ee",33));
        set.add(new Student("ee",33));

        System.out.println("元素的个数是："+set.size());
        for (Object object:set
                ) {
            System.out.println(object);

        }
    }

 
	@Test
    public void Test4(){
        Set set = new HashSet();
        set.add("ff");
        set.add("fr");
        set.add("gg");

        System.out.println("元素的个数是："+set.size());
        for (Object object:set
                ) {
            System.out.println(object);

        }
    }

    @Test
    public void Test5(){
        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student s1 = (Student)o1;
                Student s2 = (Student)o2;
                if (s1.getAge() == s2.getAge()) {
                    return s1.getName().compareTo(s2.getName());
                }
                return s1.getAge()-s2.getAge();
            }
        });
        set.add(new Student("ee" ,33));
        set.add(new Student("EE",33));
        set.add(new Student("ff",63));
        set.add(new Student("g",53));

        System.out.println("元素的个数是："+set.size());
        for (Object object:set
                ) {
            System.out.println(object);

        }
    }
    


}

class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }
}