package Day06;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        // так как random геренрирует от 0 до 3 (цифра 4)
        // то нам пришлось добавить
        // + 2 что бы ответ был от 2 до 5
        int randomValue = (random.nextInt(4) + 2);

        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "неудовлетоврительно";
                break;
            case 3:
                evaluation = "удовлетоврительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.fio + " оценил студента с именем " + student.getFio() + " по предмету" +
                  this.subject +  " на оценку " + evaluation);
    }
}