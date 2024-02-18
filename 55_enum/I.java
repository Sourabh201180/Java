class A {

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Days[] days = Days.values();  
        
        for(Days day : days) {
            System.out.println(day);
        }
    }
}