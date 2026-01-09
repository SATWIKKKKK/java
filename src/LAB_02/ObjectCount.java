class ObjectCount {

    static int count = 0;   // static variable

    ObjectCount() {
        count++;            // increment when object is created
    }

    public static void main(String[] args) {


        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();
        ObjectCount obj4 = new ObjectCount();
        ObjectCount obj5 = new ObjectCount();
        ObjectCount obj6 = new ObjectCount();

        System.out.println("Number of objects created = " + count);
    }
}
