public class Task1 {
    /**
     * @param args
     */
//     Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Пример вывода: "select * from students WHERE name = Ivanov AND country = Russia.....".
    public static void main(String[] args) {
        String str = "name:Ivanov, country:Russia, city:Moscow, age:null";
        System.out.println(str);

        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData1 = str.split(", ");

        for (int i =0; i < arrayData1.length; i++) {
            String[] arrayData2 = arrayData1[i].split(":");
            if(arrayData2[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrayData2[0]);
                    result.append(" = ");
                    result.append(arrayData2[1]);
                } else {
                    result.append(arrayData2[0]);
                    result.append(" = ");
                    result.append(arrayData2[1]);
                }
            }
        }

        System.out.println(result);   
              
        }
    }