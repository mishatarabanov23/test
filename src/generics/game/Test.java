package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolboy schoolboy1 = new Schoolboy("Nick", 9);
        Schoolboy schoolboy2 = new Schoolboy("Mark", 8);
        Schoolboy schoolboy3 = new Schoolboy("Nick2", 9);
        Schoolboy schoolboy4 = new Schoolboy("Mark2", 8);
        Student student1 = new Student("Max", 19);
        Student student2 = new Student("Carlos", 21);
        Student student3 = new Student("Max2", 19);
        Student student4 = new Student("Carlos2", 21);
        Employee employee1 = new Employee("Fernando", 30);
        Employee employee2 = new Employee("Yuki", 45);
        Employee employee3 = new Employee("Fernando2", 30);
        Employee employee4 = new Employee("Yuki2", 45);

        Team<Schoolboy> schoolboysTeam = new Team<>("VeselkaTeam(schoolboys)");
        Team<Student> studentsTeam = new Team<>("DragonTeam(students)");
        Team<Employee> employeesTeam = new Team<>("G2(employees)");

        Team<Schoolboy> schoolboysTeam2 = new Team<>("VeselkaTeam2(schoolboys)");
        Team<Student> studentsTeam2 = new Team<>("DragonTeam2(students)");
        Team<Employee> employeesTeam2 = new Team<>("G2_2(employees)");

        schoolboysTeam.addNewParticipant(schoolboy1);
        schoolboysTeam.addNewParticipant(schoolboy2);
        schoolboysTeam2.addNewParticipant(schoolboy3);
        schoolboysTeam2.addNewParticipant(schoolboy4);

        studentsTeam.addNewParticipant(student1);
        studentsTeam.addNewParticipant(student2);
        studentsTeam2.addNewParticipant(student3);
        studentsTeam2.addNewParticipant(student4);

        employeesTeam.addNewParticipant(employee1);
        employeesTeam.addNewParticipant(employee2);
        employeesTeam2.addNewParticipant(employee3);
        employeesTeam2.addNewParticipant(employee4);

        System.out.println(schoolboysTeam.getParticipants());
        System.out.println(studentsTeam.getParticipants());
        System.out.println(employeesTeam.getParticipants());
        System.out.println(schoolboysTeam2.getParticipants());
        System.out.println(studentsTeam2.getParticipants());
        System.out.println(employeesTeam2.getParticipants());

        schoolboysTeam.playWith(schoolboysTeam);



        // в чем главная проблема:
        // 1. до того как мы написали Team<V> мы могли в любую команду добавлять любых участников
        // 2. после того, как мы добавили дженерик, мы можем добавлять не только подклассы класса Participant,
        // но даже например Sting: Team<String> stringTeam = new Team<>("strings");
        // поэтому необходимо добавить public class Team<V extends Participant> и следовательно, теперь мы можем
        // создавать команды, которые содержат в себе классы, которые наследуются от абстрактного класса Participant
        // 3. команды школьников должны играть только со школьниками, студенты со студентами.
        // schoolboysTeam.playWith(studentsTeam); этот код работать не должен.
    }
}
