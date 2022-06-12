
public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.run();
		Person p1 = new Student();
		System.out.println(p1.name);
		System.out.println(p1.getName());
		System.out.println(p1.hello());
		p1.run();
		Person p2 = new Person();
		System.out.println(p2.getName());
		System.out.println(p2.toString());
		System.out.println(p2.equals(p1)); //true
		System.out.println(p2.hashCode());
		System.out.println(p2.hello());
		runTwice(p1);
		runTwice(p2);
		
        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
	}
	
	public static void runTwice(Person p) {
		p.run();
		p.run();
	}
	
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Person {
	final String name; // can not modify name after an instance is created
	
	public Person () {
		this("unnamed");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
    public void run() {
        System.out.println("Person.run");
    }
    
//    public final String hello() { // compile error if add final modifier
    public String hello() {
        return "Hello, " + name;
    }
    
    // 显示更有意义的字符串:
    @Override
    public String toString() {
        return "Person:name=" + name;
    }

    // 比较是否相等:
    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型:
        if (o instanceof Person) {
            Person p = (Person) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }

    // 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

class Student extends Person {
	@Override
    public void run() {
        System.out.println("Student.run");
    }
	
	@Override
	public String hello() {
		return super.hello() + "!";
	}
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}

