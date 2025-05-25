public class StringsClass {
    public static void main(String[] args) {
        char x = 65;  //

        System.out.println(x);


        String name = "Anis";  // String decl   // class
        String name1 = "Anis";  // String decl   // class
        String name2 = "anis";

        String name4 = new String("Anis");
 //refrance  // address // pointer   //مؤشر

        //String pool
        // call by ref
        // call by value

        System.out.println(name==name4);// == ref  هل يساوي

        System.out.println(name==name1);// == ref  هل يساوي
        System.out.println(name==name2);// == ref  هل يساوي


        System.out.println(name.equals(name1));  // value  // مقارنة من خلال القمية
        System.out.println(name.equals(name2));  // value
        System.out.println(name.equalsIgnoreCase(name2));  // value   // مقارنة وتتجاهل حسساسية الحروف


        System.out.println(name.equals(" dfdsfdsfsdfd "));  // value


        String localName = "Anis";
        System.out.println(localName.length());

        String serverName = "Anis ";
        System.out.println(serverName);
        String serName1 = serverName.trim();  // حدف لجميع المسافات في بداية و نهاية النص
        //System.out.println(localName.equals(serName1));
        System.out.println(localName.equals(serverName.trim()));
        System.out.println(serverName.trim().equals(localName));

        System.out.println(localName.toUpperCase());
        System.out.println(localName.toLowerCase());

        String line = "Hello from other side from";
        System.out.println(line.contains("Side".toLowerCase()));// contains == بحث
        System.out.println(line.contains("Side ".trim().toLowerCase()));// contains == بحث

        System.out.println(line.length());

        String n = " ";
        System.out.println(localName.isEmpty());
        System.out.println(n.isEmpty());
        System.out.println(n.isBlank());

        //charAt // indexOf
        System.out.println(localName.indexOf("i"));
        System.out.println(line.indexOf("from"));
        System.out.println(line.lastIndexOf("from"));

        System.out.println(localName.charAt(1));


        String firstName = "Anis";
        String lastName = "Siam";

        System.out.println(firstName+" "+ lastName);
        System.out.println(firstName.concat(" " + lastName));


        String st = "Hello from java and i like java so much";

        String st1 = st.replace("java", "c++");
        System.out.println(st1);

        System.out.println(st.substring(3));
        System.out.println(st.substring(6,10)); // ( include , not include)

        System.out.println(st.startsWith("java"));
        System.out.println(st.startsWith("h"));
        System.out.println(st.startsWith("Hello"));
        System.out.println(st.endsWith("Hello"));
        System.out.println(st.endsWith(" "));
        System.out.println(st.endsWith("ch"));














        //anis  //Anis  //anis





        //Anis -> "Anis "-(" ") //"Anis"
    }
}
