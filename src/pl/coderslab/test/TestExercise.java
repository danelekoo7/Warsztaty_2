package pl.coderslab.test;

import pl.coderslab.dao.ExerciseDao;
import pl.coderslab.model.Exercise;

public class TestExercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise(3, "adf", "aef");
        ExerciseDao exerciseDao = new ExerciseDao();
//     exerciseDao.create(exercise);
//    exerciseDao.read(2);
//    exerciseDao.update(exercise);
        exerciseDao.delete(4);
        Exercise exercise1 = exerciseDao.read(2);
        exerciseDao.create(exercise1);

        for (int i = 0; i < exerciseDao.findAll().length; i++) {
            exerciseDao.printExercise(exerciseDao.findAll()[i]);
        }
    }
}
