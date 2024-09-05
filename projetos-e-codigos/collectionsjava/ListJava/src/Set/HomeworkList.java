package Set;

import java.util.Set;
import java.util.HashSet;

public class HomeworkList {
    Set<Homework> hwlist;

    public HomeworkList(){
        hwlist = new HashSet<>();
    }

    public void addHomework(String description){
        hwlist.add(new Homework(description));
    }

    public void removeHomework(String description){
        for (Homework h : hwlist){
            if (h.equals(description)){
                hwlist.remove(h);
                break;
            }
        }
    }

    public void showHomework(){
        System.out.println(hwlist);
    }

    public void countHomeworks(){
        System.out.println(hwlist.size());
    }

    public Set<Homework> obtainDoneHomework(){
        Set<Homework> homeworksDone = new HashSet<>();
        for (Homework h : hwlist){
            if (h.getDone()){
                homeworksDone.add(h);
            }
        }
        return homeworksDone;
    }

    public Set<Homework> obtainNotDoneHomerworks(){
        Set<Homework> homeworksNotDone = new HashSet<>();
        for (Homework h : hwlist){
            if (!h.getDone()){
                homeworksNotDone.add(h);
            }
        }
        return homeworksNotDone;
    }

    public void makeHomework(String description){
        for (Homework h : hwlist){
            if (h.getDescription().equalsIgnoreCase(description)){
                h.setDone(true);
                break;
            }
        }
    }   

    public void notHomework(String description){
        for (Homework h : hwlist){
            if (h.getDescription().equalsIgnoreCase(description)){
                h.setDone(false);
                break;
            }
        }

    }
    
    public void cleanHomeworkList(){
        hwlist.clear();
    }
}
