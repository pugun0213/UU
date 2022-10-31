import java.util.*;

public class Main {
    public static void main(String[] args){
        try {

            ArrayList<String> names = new ArrayList<String>();
            names.add("Mateo");
            names.add("Danny");
            names.add("Joe");
            names.add("Alex");

            System.out.println(names.size() + " people in the list");

            System.out.println("name[0] = " + names.get(0));
            System.out.println("name[3] = " + names.get(3));


            Map<String, String> country = new HashMap<>();
            country.put("de", "German");
            country.put("th", "Thailand");
            country.put("us", "United State");
            country.put("tr", "Turkey");

            System.out.println("Map size = " + country.size());

            System.out.println("de = " + country.get("de"));
            System.out.println("th = " + country.get("th"));
            System.out.println("th = " + country.get("uk"));

            List<String> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("a");
            list.add("b");
            list.add("e");

            System.out.println("list size = " + list.size());
            System.out.println("list = " + list);

//            int time = 15;
//            String greeting;
//
//            if (time < 10) {
//                greeting = "Good morning";
//            } else if (time < 20) {
//                greeting = "Good day";
//            } else {
//                greeting = "Good evening";
//            }
//            System.out.println("greeting : " + greeting);


//            for (int i = 1; i <= 2; i++) {
//                System.out.println("text : " + i);
//            }

//            int i = 0;
//            do {
//                System.out.println("text : " + i);
//                i++;
//            }
//            while (i < 5);
//
//            while (i < 10) {
//                System.out.println("text : " + i);
//                i++;
//            }

//            String day = null;
//            switch (new Date().getDay()) {
//                case 0:
//                    day = "Sunday";
//                    break;
//                case 1:
//                    day = "Monday";
//                    break;
//                case 2:
//                    day = "Tuesday";
//                    break;
//                case 3:
//                    day = "Wednesday";
//                    break;
//                case 4:
//                    day = "Thursday";
//                    break;
//                case 5:
//                    day = "Friday";
//                    break;
//                case 6:
//                    day = "Saturday";
//            }
//            System.out.println("day : " + day);


//            String documents = "45613318-A,45613323-A,45647153-A,45647174-A";
//            for (String document : documents.split(",")) {
//                System.out.println("document : " + document);
//            }

//            List<Map> department_code = new ArrayList<>();
//            Map map = new HashMap<>();
//            map.put("DEPARTMENT_CODE","002");
//            department_code.add(map);
//
//            Map map2 = new HashMap<>();
//            map.put("DEPARTMENT_CODE","002");
//            department_code.add(map2);
//
//            String departmentCode = "";
//            for (int i = 0; i < department_code.size(); i++) {
//                departmentCode += department_code.get(i).get("DEPARTMENT_CODE").toString();
//                if (i < (department_code.size() - 1)) {
//                    departmentCode += ",";
//                }
//            }
//            System.out.println("departmentCode : " + departmentCode);


//            HashMap<Integer, String> hm1 = new HashMap<>();
//
//            // Initialization of a HashMap using Generics
//            HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
//
//            // Adding elements using put method
//            // Custom input elements
//            hm1.put(1, "one");
//            hm1.put(2, "two");
//            hm1.put(3, "three");
//            hm1.put(3, "three2");
//
//            hm2.put(4, "four");
//            hm2.put(5, "five");
//            hm2.put(6, "six");
//            hm2.put(4, "six2");
//
//            // Print and display mapping of HashMap 1
//            System.out.println("Mappings of HashMap hm1 are : " + hm1);
//
//            // Print and display mapping of HashMap 2
//            System.out.println("Mapping of HashMap hm2 are : " + hm2);

//            Map mapper = new ObjectMapper().readValue("{ \"id\": 1, \"profile\": \"207:BOONCHAIP-00000563\" }", Map.class);
//            System.out.println("id :"+mapper.get("id"));
//            System.out.println("profile :"+mapper.get("profile"));
//            System.out.println(mapper.get("id")+":"+mapper.get("profile"));

//            List<String> list = new ArrayList();
//            list.add("001");
//            list.add("002");
//            list.add("003");
//            for(String s : list){
//                if (s.equals("002"))continue;
//                System.out.println(s);
//            }


//            List<String> inputString =  Arrays.asList("Sijan", "Sudeep", "Parasar", "Raj Kumar");
//            Collections.sort(inputString);
//            System.out.println(inputString);

//            String  str = "30xx-3055";
//            boolean n = str.startsWith("30");
//            System.out.println(n);

//            String accNo= "468d6d8b-bd2f-4b9f-bb57-7b99b1d7b574_111111111111111111111111111.pdf";
//            String[] splitTypeFile = accNo.split("_");
//            String fileType = splitTypeFile[splitTypeFile.length - 1];
//            System.out.println(fileType);
//
//            String[] splitTypeFile2 = fileType.split("\\.");
//            System.out.println(splitTypeFile2.length);
//            System.out.println(splitTypeFile2[0]);
//
//            Double d = 1174d;
//            DecimalFormat twoDigits = new DecimalFormat("0.00");
//            System.out.print(twoDigits.format(d));

//            String keyMap = "1,9";
//            String[] keyList = keyMap.split(",");
//            for (String key : keyList) {
//                System.out.print(key);
//                System.out.print("\n");
//            }

//            SimpleDateFormat formatter =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//            Date startDate=formatter.parse("28/04/2021 16:12:41");
//            Date endDate=formatter.parse("02/05/2021 16:12:41");
//            System.out.println("date6: "+date6);

//            List<Date> dates = new ArrayList<>();
//            Calendar calendar = new GregorianCalendar();
//            calendar.setTime(startDate);
//
//            while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate) )
//            {
//                Date result = calendar.getTime();
////                dates.add(result);
//                calendar.add(Calendar.DATE, 1);
//                System.out.println(result);
//            }

//
//            Long millisecond = 1660728553969L;
//            Long millisecond = 1660730136830L;
//            Date date = new Date(millisecond);
//            Date date = new Date();
//            System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(date));
//            System.out.println(new SimpleDateFormat("HH:mm").format(date));

//            ///////// Random class ////////////////
//            // create instance of Random class
//            Random rand = new Random();
//
//            // Generate random integers in range 0 to 999
//            int rand_int1 = rand.nextInt(1000);
//            int rand_int2 = rand.nextInt(1000);
//
//            // Print random integers
//            System.out.println("Random Integers: "+rand_int1);
//            System.out.println("Random Integers: "+rand_int2);

//            // Generate Random doubles
//            double rand_dub1 = rand.nextDouble();
//            double rand_dub2 = rand.nextDouble();
//
//            // Print random doubles
//            System.out.println("Random Doubles: "+rand_dub1);
//            System.out.println("Random Doubles: "+rand_dub2);

            ///////// Random class ////////////////

//            String str = "[{\"errorCode\":\"003\",\"errorDetail\":\"Barcode not found.\",\"status\":true}]";
//            String mySubString = null ;
////                    = str.substring(
////                    str.lastIndexOf("[") + 1,
////                    str.lastIndexOf("]"));
//
//            System.out.println("mySubString: "+str.indexOf("errorCode"));
//            if (str.indexOf("errorCode")>0){
//                str = str.substring(
//                        str.lastIndexOf("[") + 1,
//                        str.lastIndexOf("]"));
//            }
//            System.out.println("mySubString: "+str);


//            Date date = new Date();
////            date.setDate(date.getDate() - 1);
//            date.setYear(date.getYear());
//            String formatDateToDay = new SimpleDateFormat("yyyy").format(date);
//            System.out.println("formatDateToDay: "+formatDateToDay);
//            System.out.println("formatDateToDay: "+formatDateToDay.substring(0,2));
//            System.out.println("formatDateToDay: "+formatDateToDay.substring(formatDateToDay.length()-2));


//            System.out.println("Current Quarter : " +
//                    LocalDate.now().get(QUARTER_OF_YEAR) );
//
//            System.out.println("2017-01-01 Quarter : " +
//                    LocalDate.of(2017, 04, 01).get(QUARTER_OF_YEAR) );

            // get the start/end date of a quarter
            // LocalDate localDate = LocalDate.parse("2019-09-04");


//            LocalDate localDate = LocalDate.now();
//            LocalDate firstDayOfQuarter = localDate.with(IsoFields.DAY_OF_QUARTER, 1L);;
//            LocalDate lastDayOfQuarter = firstDayOfQuarter.plusMonths(2)
//                    .with(TemporalAdjusters.lastDayOfMonth());
//
//            System.out.println(
//                    "Date : " + localDate + "\n" +
//                            "Quarter : " + LocalDate.now().get(IsoFields.QUARTER_OF_YEAR) + "\n" +
//                            "Start : " + firstDayOfQuarter + "\n" +
//                            "End   : " + lastDayOfQuarter
//            );

//            LocalDate start = YearMonth.of(2020, 1).with(QUARTER_OF_YEAR, 4).atDay(1);
//            LocalDate end = YearMonth.of(2020, 3).with(QUARTER_OF_YEAR, 4).atEndOfMonth();
//            System.out.println("start: "+start);
//            System.out.println("end: "+end);

//            String test = "abcde";
//            char[] word = test.toCharArray();
//            for (int i = 1; i < word.length - 1; i++) { // make sure to start at second char, and end at one-but-last char
//                word[i] = '*';
//            }
//            System.out.println(String.copyValueOf(word));

//            String[] list = ["Kill", "5h1t", "5hit", "a55", "xxx"];

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

