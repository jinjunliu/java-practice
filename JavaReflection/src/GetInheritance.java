public class GetInheritance {
    public static void main(String[] args) throws Exception {
        Class<Integer> i = Integer.class;
        Class<? super Integer> n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());

        Class s = Integer.class;
        Class[] is = s.getInterfaces();
        for (Class in : is) {
            System.out.println(in);
        }

        Object q = Integer.valueOf(123);
        boolean isDouble = q instanceof Double; // false
        boolean isInteger = q instanceof Integer; // true
        boolean isNumber = q instanceof Number; // true
        boolean isSerializable = q instanceof java.io.Serializable; // true
        System.out.println(isDouble);
        System.out.println(isInteger);
        System.out.println(isNumber);
        System.out.println(isSerializable);

        // 判断一个向上转型是否成立，可以调用isAssignableFrom()：
        boolean isAssignable = Integer.class.isAssignableFrom(Integer.class); // true
        System.out.println(isAssignable);
        boolean isAssignable2 = Integer.class.isAssignableFrom(Double.class); // false
        System.out.println(isAssignable2);
        boolean isAssignable3 = Number.class.isAssignableFrom(Integer.class); // true
        System.out.println(isAssignable3);
    }
}
