package Practice_6;

public class SortingStudentsByGPA implements Comparato {

    public void sortirovka(Student[] students, int low, int high){

        if(high-low <= 0) return;
        int p;
        Student temp;
        int high_here = high;
        for(int i = 0; i < high_here;){
            if(compareTo(students[i],students[high_here])){
                temp = students[high_here-1];
                students[high_here-1] = students[i];
                students[i] = temp;
                temp = students[high_here];
                students[high_here] = students[high_here-1];
                students[high_here-1] = temp;
                high_here--;
            }
            else i++;
        }
        p = high_here;
        sortirovka(students, low, p-1);
        sortirovka(students, p, high);
    }
    public boolean compareTo(Student student1, Student student2){
        if (student1.getBall() < student2.getBall()){
            return true;
        }
        else return false;
    }
}
